package com.innova.dto;



import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data
@Log4j2
public class UserDto {

    private LoginDto loginDto;
    private RegisterDto registerDto;
}
