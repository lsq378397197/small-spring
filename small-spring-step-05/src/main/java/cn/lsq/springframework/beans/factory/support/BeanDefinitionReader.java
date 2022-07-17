package cn.lsq.springframework.beans.factory.support;

import cn.lsq.springframework.beans.BeansException;
import cn.lsq.springframework.beans.factory.config.BeanDefinition;
import cn.lsq.springframework.core.io.Resource;
import cn.lsq.springframework.core.io.ResourceLoader;

/**
 * bean定义读取接口
 *
 * @author liushangqing
 * @date 2022/7/14 21:58
 */
public interface BeanDefinitionReader {
    /**
     * 这里需要注意 getRegistry()、getResourceLoader()，都是用于提供给后面三个方法的工具，加载和注册，
     * 这两个方法的实现会包装到抽象类中，以免污染具体的接口实现方法。
     *
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 这里需要注意 getRegistry()、getResourceLoader()，都是用于提供给后面三个方法的工具，加载和注册，
     * 这两个方法的实现会包装到抽象类中，
     * 以免污染具体的接口实现方法。
     *
     * @return
     */
    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;


}
