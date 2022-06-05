package cn.lsq.springframework.beans.factory.support;

import cn.lsq.springframework.beans.BeansException;
import cn.lsq.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象类可以不用实现所有方法
 * 该类主要实现了创建Bean的功能
 *
 * @author liushangqing
 * @date 2022/6/5 11:11
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation bean failed,beanName=" + name);
        }
        addSingleton(name, bean);
        return bean;
    }
}
