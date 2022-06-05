package cn.lsq.springframework.test;

import cn.lsq.springframework.BeanDefinition;
import cn.lsq.springframework.BeanFactory;
import cn.lsq.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 测试第一版BeanFactory
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
