package com.myk.learn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {
//    @Value("${server.port}")
//    public Integer port;
    @GetMapping("/set")
    public String set(HttpSession session){
        session.setAttribute("user","java");
        return Thread.currentThread().getName();
    }

    @GetMapping("/get")
    public String get(HttpSession session){
        return session.getAttribute("user") + ":" + Thread.currentThread().getName();
    }
}
