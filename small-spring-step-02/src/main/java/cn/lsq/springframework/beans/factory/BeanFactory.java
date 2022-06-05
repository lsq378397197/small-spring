package cn.lsq.springframework.beans.factory;

import cn.lsq.springframework.beans.BeansException;

/**
 * Bean 工厂
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

}
