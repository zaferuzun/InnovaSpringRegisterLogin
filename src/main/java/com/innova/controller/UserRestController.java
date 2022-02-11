package com.innova.controller;

import com.innova.dto.UserDto;
import com.innova.entity.UserEntity;
import com.innova.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class UserRestController {

    @Autowired
    IUserRepository iUserRepository;

    UserDto userDto=UserDto.builder()
            .userId(11L)
            .userName("zafer")
            .userEmail("zafer@gmail.com")
            .userPassword("password")
            .userCreatedDate(new Date())
            .build();

    // http://localhost:8080/user/manueljson
    @GetMapping("/user/manueljson")
    public UserDto getManuelUserJson(){
        return this.userDto;
    }

    // http://localhost:8080/user/find/5
    @GetMapping("/user/find/{id}")
    @ResponseBody
    public UserDto getDynamicsJson(@PathVariable(name="id") Long id){

        //Dto olarak alınan veri maplenerek Entity'e eklendi
        Optional<UserEntity> userEntity = iUserRepository.findById(id);
        UserDto userDto=UserDto.builder()
                .userId(userEntity.get().getUserId())
                .userName(userEntity.get().getUserName())
                .userEmail(userEntity.get().getUserEmail())
                .userPassword(userEntity.get().getUserPassword())
                .userCreatedDate(userEntity.get().getUserCreatedDate())
                .build();
        return userDto;
    }


    // http://localhost:8080/user/find/mediatype
    @GetMapping(value = "/user/find/mediatype",produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto getDProduces(){
        return userDto;
    }


    // http://localhost:8080/user/list/
    @GetMapping(value = "/user/list/")
    public List<UserEntity> getProductList(){
        List<UserEntity> userEntityList=new ArrayList<>();
        return userEntityList;
    }
}
