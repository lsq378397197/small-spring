package cn.lsq.springframework.beans.factory;

/**
 * 是一个扩展 Bean 工厂接口的接口，新增加了 getBeansOfType、getBeanDefinitionNames() 方法，在 Spring 源码中还有其他扩展方法
 *
 * @author liushangqing
 * @date 2022/7/14 21:32
 */
public interface ListableBeanFactory extends BeanFactory{
}
