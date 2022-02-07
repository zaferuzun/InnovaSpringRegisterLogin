package com.innova.dto;

import javax.validation.constraints.NotEmpty;

public class LoginDto {

    @NotEmpty(message = "Kullanıcı adı alanı boş geçilemez")
    private String userName;

    @NotEmpty(message = "Password alanı boş geçilemez")
    private String userPassword;
}
