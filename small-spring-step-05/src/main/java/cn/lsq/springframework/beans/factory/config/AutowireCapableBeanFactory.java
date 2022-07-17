package cn.lsq.springframework.beans.factory.config;

import cn.lsq.springframework.beans.factory.BeanFactory;

/**
 * Extension of the {@link cn.lsq.springframework.beans.factory.BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 * @author liushangqing
 * @date 2022/7/14 21:26
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

}
