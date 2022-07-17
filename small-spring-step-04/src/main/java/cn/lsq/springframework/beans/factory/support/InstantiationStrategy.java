package cn.lsq.springframework.beans.factory.support;

import cn.lsq.springframework.beans.BeansException;
import cn.lsq.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * bean实例化策略(策略模式）
 *
 * @author liushangqing
 * @date 2022/6/6 20:02
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
