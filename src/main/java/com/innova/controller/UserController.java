package com.innova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "user")
public class UserController {

    // http://localhost:8080/index/user
    @GetMapping()
    @ResponseBody
    public String getLoginAndRegister(){
        return "getLoginAndRegister";
    }

    @PostMapping("register")
    public String postRegister(){
        return "postRegister";
    }

    @PostMapping("login")
    public String postLogin(){
        return "postLogin";
    }

}
