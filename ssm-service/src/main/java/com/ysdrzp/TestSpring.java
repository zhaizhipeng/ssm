package com.ysdrzp;

import com.ysdrzp.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 Spring 环境是否独立运行成功
 */
public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountService",IAccountService.class);
        accountService.saveAccount(null);
    }
}
