package com.innova.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.NotEmpty;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class LoginDto {

    @NotEmpty(message = "Kullanıcı adı alanı boş geçilemez")
    private String userName;

    @NotEmpty(message = "Password alanı boş geçilemez")
    private String userPassword;
}
