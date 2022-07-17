package cn.lsq.springframework.beans.factory.config;

import cn.lsq.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * Configuration interface to be implemented by most bean factories. Provides facilities to configure a bean factory, in addition to the bean factory client methods in the BeanFactory interface.
 * This bean factory interface is not meant to be used in normal application code: Stick to BeanFactory or org.springframework.beans.factory.ListableBeanFactory for typical needs. This extended interface is just meant to allow for framework-internal plug'n'play and for special access to bean factory configuration methods.
 * Since:
 * 03.11.2003
 * See Also:
 * BeanFactory, org.springframework.beans.factory.ListableBeanFactory, ConfigurableListableBeanFactory
 * Author:
 * Juergen Hoeller
 * 提供分析和修改Bean以及预先实例化的操作接口
 *
 * @author liushangqing
 * @date 2022/7/14 21:36
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";
}
