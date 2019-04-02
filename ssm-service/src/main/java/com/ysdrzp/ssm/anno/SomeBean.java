package com.ysdrzp.ssm.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SomeBean {

    @Value("${server.port}")
    private int port;

    public SomeBean(){
        System.out.println("创建SomeBean对象");
    }

    @PostConstruct
    public void open(){
        System.out.println("初始化方法");
    }

    @PreDestroy
    public void close(){
        System.out.println("销毁方法");
    }

    public void work(){
        System.out.println("开始工作");
    }

    @Autowired
    private OtherBean otherBean;

    @Autowired
    private OtherBean otherBean2;

    /*@Autowired
    @Qualifier("other")
    public void setter(OtherBean otherBean, OtherBean otherBean2){
        this.otherBean = otherBean;
        this.otherBean2=otherBean2;
    }*/

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public OtherBean getOtherBean2() {
        return otherBean2;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "otherBean1=" + otherBean +
                ", otherBean2=" + otherBean2 +
                '}';
    }
}
