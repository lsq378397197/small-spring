package cn.lsq.springframework.beans.factory.config;

/**
 * @description: 单例注册表接口
 * @author: shangqing
 * @date: 2022/6/6 19:50
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
