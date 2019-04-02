package com.ysdrzp.ssm.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SomeBean {

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

    @Override
    public String toString() {
        return "SomeBean{" +
                "otherBean1=" + otherBean +
                ", otherBean2=" + otherBean2 +
                '}';
    }
}
