package com.ysdrzp.ssm.tx;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhipeng zhai
 * @date 2019/4/9 0009
 */
public class App {

    @Test
    public void testTrans(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx-context.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountServiceImpl");
        accountService.transfer(2,1,500);
    }

}
