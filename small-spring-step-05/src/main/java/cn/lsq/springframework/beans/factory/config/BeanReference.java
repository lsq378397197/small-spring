package cn.lsq.springframework.beans.factory.config;

/**
 * bean引用
 *
 * @author liushangqing
 * @date 2022/6/8 21:28
 */
public class BeanReference {
    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
