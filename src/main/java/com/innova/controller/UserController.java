package com.innova.controller;

import com.innova.dto.LoginDto;
import com.innova.dto.RegisterDto;
import com.innova.dto.UserDto;
import com.innova.entity.UserEntity;
import com.innova.repository.IUserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "user")
@Log4j2
public class UserController {

    @Autowired
    IUserRepository iUserRepository;


    //login ve register için get sayfası
    // http://localhost:8080/user
    @GetMapping()
    public String getLoginAndRegister(Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("register_form", userDto.getRegisterDto());
        model.addAttribute("login_form", userDto.getRegisterDto());
        return "user";
    }

    // http://localhost:8080/user/register
    @PostMapping("register")
    public String postRegister(@Valid @ModelAttribute("register_form") RegisterDto registerDto, @ModelAttribute("login_form") LoginDto loginDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("Hata var");
            log.info(registerDto);
            return "user";
        }
        //Dto olarak alınan veri maplenerek Entity'e eklendi
        UserEntity userEntity = UserEntity
                .builder()
                .userId(0L)
                .userName(registerDto.getUserName())
                .userPassword(registerDto.getUserPassword())
                .userEmail(registerDto.getUserEmail())
                .build();

        iUserRepository.save(userEntity);

        log.info(registerDto);
        return "user";
    }

    // http://localhost:8080/user/login
    @PostMapping("login")
    public String postLogin(@Valid @ModelAttribute("login_form") LoginDto loginDto,@ModelAttribute("register_form") RegisterDto registerDto, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            log.error("Hata var");
            log.info(loginDto);
            return "user";
        }

        //databaseden kontrol edilecek alan
        log.info(loginDto);
        return "login";
    }

}
