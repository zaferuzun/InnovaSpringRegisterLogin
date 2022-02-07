package com.innova.controller;

import com.innova.dto.LoginDto;
import com.innova.dto.RegisterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "user")
@Log4j2
public class UserController {



    // http://localhost:8080/index/user
    @GetMapping()
    @ResponseBody
    public String getLoginAndRegister(Model model){
        model.addAttribute("register_form", new RegisterDto());
        model.addAttribute("login_form", new LoginDto());
        return "index";
    }


    @PostMapping("register")
    public String postRegister(@Valid @ModelAttribute("register_form") RegisterDto registerDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("Hata var");
            log.info(registerDto);
            return "index";
        }

        //database yazılacak alan



        log.info(registerDto);
        return "index";
    }

    @PostMapping("login")
    public String postLogin(@Valid @ModelAttribute("login_form") LoginDto loginDto, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            log.error("Hata var");
            log.info(loginDto);
            return "index";
        }

        //database yazılacak alan
        log.info(loginDto);
        return "login";
    }

}
