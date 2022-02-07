package com.innova.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class RegisterDto {

    @NotEmpty(message = "Kullanıcı adı alanı boş geçilemez")
    @Min(value = 5,message = "Kullanıcı adınız min 5 harften oluşmalıdır")
    @Max(value = 20,message = "Kullanıcı adınız min 20 harften oluşmalıdır")
    private String userName;
    @NotEmpty(message = "Email alanı boş geçilemez")
    @Email(message = "Lütfen geçerli bir email giriniz")
    private String userEmail;
    @NotEmpty(message = "Şifre alanı boş geçilemez")
    private String userPassword;


}
