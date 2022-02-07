package com.innova.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class RegisterDto {

    @NotEmpty(message = "Kullanıcı adı alanı boş geçilemez")
    private String userName;
    @NotEmpty(message = "Email alanı boş geçilemez")
    @Email(message = "Lütfen geçerli bir email giriniz")
    private String userEmail;
    @NotEmpty(message = "Şifre alanı boş geçilemez")
    private String userPassword;


}
