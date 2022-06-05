package cn.lsq.springframework.beans.factory.support;

import cn.lsq.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例bean注册表实现
 * 注册表只用来存储和获取，不负责创建对象
 *
 * @author liushangqing
 * @date 2022/6/5 10:30
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private final Map<String, Object> singletonObjects = new HashMap<>();


    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object object) {
        singletonObjects.put(beanName, object);
    }
}
