package com.cf.swagger.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试")
public class hello {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
