package com.example.javademo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ZYController {

    @RequestMapping(value = "/demo")
    public String demo() {
        return "success";
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }
}
