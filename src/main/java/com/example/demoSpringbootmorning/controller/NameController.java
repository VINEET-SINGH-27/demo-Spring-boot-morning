package com.example.demoSpringbootmorning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @RequestMapping("/Name")
    public String Name(){

        String name = "Java";
        String sir_name = "Core";

        return "my name is :"+name;
    }
}
