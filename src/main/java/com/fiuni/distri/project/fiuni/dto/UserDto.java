package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

@Data
public class UserDto extends BaseDto {
    private String username;
    private String password;
    private String email;
    private int rol_id;
}
