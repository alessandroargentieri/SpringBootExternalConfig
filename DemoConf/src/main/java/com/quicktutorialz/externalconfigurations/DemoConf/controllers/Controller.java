package com.quicktutorialz.externalconfigurations.DemoConf.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @Value("${myapp.user-name}")
    String username;

    @RequestMapping("/")
    @ResponseBody
    public String base(){
        return "Write /hello";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello " + username + "!";
    }

}
