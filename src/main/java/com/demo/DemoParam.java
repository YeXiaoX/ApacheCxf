package com.demo;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.HeaderParam;

/**
 * Created by Ivan on 2016/6/15.
 */

public class DemoParam {

   @HeaderParam("demo1")
    private String demo1;

    public String getDemo1() {
        return demo1;
    }

    public void setDemo1(String demo1) {
        System.out.println("ssfs");
        this.demo1 = demo1;
    }

    @Override
    public String toString() {
        return "DemoParam{" +
                "demo1='" + demo1 + '\'' +
                '}';
    }
}
