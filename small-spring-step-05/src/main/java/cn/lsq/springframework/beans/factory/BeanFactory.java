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

    /**
     * 根据类型获取bean
     * @param beanName beanName
     * @param requiredType bean类型
     * @param <T> 实例类
     * @return
     * @throws BeansException
     */
    <T> T getBean(String beanName,Class<T> requiredType) throws BeansException;

}
