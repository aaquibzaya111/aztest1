package com.mynobroker.payload;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private long id;
    private String name;
    private long mobile;
    private String email;
    private String password;

}
