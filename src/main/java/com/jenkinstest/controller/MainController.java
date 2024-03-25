package com.jenkinstest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("")
    @ResponseBody
    public String hello(){
        return "Hello Jenkins! 배포까지 자동으로 된걸까요!?";
    }
}
