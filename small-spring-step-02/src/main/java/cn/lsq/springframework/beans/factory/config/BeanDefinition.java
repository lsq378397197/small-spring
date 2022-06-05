package cn.lsq.springframework.beans.factory.config;

/**
 * BeanDefinition定义
 *
 * @author liushangqing
 * @date 2022/6/5 10:23
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
