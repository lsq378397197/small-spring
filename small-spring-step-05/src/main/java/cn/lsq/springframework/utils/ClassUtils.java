package cn.lsq.springframework.utils;

/**
 * 类操作工具类
 *
 * @author liushangqing
 * @date 2022/7/14 21:45
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable t) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            cl = ClassUtils.getDefaultClassLoader();
        }
        return cl;
    }
}
