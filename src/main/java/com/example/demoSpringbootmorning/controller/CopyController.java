package com.example.demoSpringbootmorning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CopyController {


    int i = 1;
    @RequestMapping("/hello")  // REQUEST MAPPING
    public void hello () {

        System.out.println("Hello , Spring boot");
    }

    @RequestMapping("/welcome")  // request mapping
    public String massage () {


        String welcome = "Welcome to Spring boot......"+i;
        i++;
        return welcome;
    }
}
