package com.cai.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ValueConstants;

@Controller
public class TestController {

    @RequestMapping(value = {"/index"})
    public String index(){

        return "index";
    }


    public String index2(){

        return "index";
    }


    public String index3(){

        System.out.println("git branch confict");
        return "index";
    }

    public String index4(){
        System.out.println("git branch4");
        return "index";
    }


}
