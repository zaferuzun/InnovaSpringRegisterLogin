package com.innova.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class UserDto {

    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Date userCreatedDate;
}
