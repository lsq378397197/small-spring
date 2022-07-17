package cn.lsq.springframework.beans.factory;

import cn.lsq.springframework.beans.BeansException;

/**
 * Bean 工厂
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    /**
     * 含有参数的构造方法创建实例
     * @param name beanName
     * @param args 参数
     * @return bean
     * @throws BeansException
     */
    Object getBean(String name,Object... args) throws BeansException;

}
