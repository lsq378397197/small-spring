package cn.lsq.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import cn.lsq.springframework.beans.BeansException;
import cn.lsq.springframework.beans.PropertyValue;
import cn.lsq.springframework.beans.PropertyValues;
import cn.lsq.springframework.beans.factory.config.BeanDefinition;
import cn.lsq.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * 抽象类可以不用实现所有方法
 * 该类主要实现了创建Bean的功能
 *
 * @author liushangqing
 * @date 2022/6/5 11:11
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();
    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean;
        try {
            bean = createBeanInstance(name, beanDefinition, args);
            applyPropertyValues(name, bean, beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(name, bean);
        return bean;
    }

    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String propertyName = propertyValue.getName();
                Object value = propertyValue.getValue();
                if (value instanceof BeanReference) {
                    //这里需要注意我们并没有去处理循环依赖的问题，这部分内容较大，后续补充。
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                //属性填充
                BeanUtil.setFieldValue(bean, propertyName, value);

            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values：" + beanName);
        }
        System.out.println("填充属性");
    }

    protected Object createBeanInstance(String name, BeanDefinition beanDefinition, Object[] args) {
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] constructors = beanClass.getConstructors();
        Constructor<?> constructorToUse = null;
        for(Constructor<?> constructor : constructors) {
            if (null != args && constructor.getParameterTypes().length == args.length) {
                constructorToUse = constructor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, name, constructorToUse,args);
    }
}
