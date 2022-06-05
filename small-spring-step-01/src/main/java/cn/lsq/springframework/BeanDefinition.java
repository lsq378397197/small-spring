package cn.lsq.springframework;

/**
 * Bean定义
 *
 * @author liushangqing
 * @date 2022/6/5 9:53
 */
public class BeanDefinition {
    private Object object;

    public BeanDefinition(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
