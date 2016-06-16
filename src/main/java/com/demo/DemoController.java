package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;

/**
 * Created by Ivan on 2016/6/15.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {


   @RequestMapping(value="/first",method = RequestMethod.GET)
    @ResponseBody
    public String first(@HeaderParam("name")String name, final DemoParam demoParam){
        System.out.println("name:"+name);
        System.out.println("demo1:"+demoParam.getDemo1());
        return demoParam.getDemo1();
    }
}
