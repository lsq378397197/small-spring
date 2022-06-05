package cn.lsq.springframework.beans.factory.support;

import cn.lsq.springframework.beans.BeansException;
import cn.lsq.springframework.beans.factory.BeanFactory;
import cn.lsq.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象工厂
 * 抽象类尽量不干具体的活儿，交给子类去实现
 * @author liushangqing
 * @date 2022/6/5 10:40
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object singleton = getSingleton(name);
        if (singleton != null) {
            return singleton;
        }

        BeanDefinition beanDefinition=getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract Object createBean(String name, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;



}
