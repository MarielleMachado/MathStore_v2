package com.BackEnd.MathStoreOnline2.dto;

import com.BackEnd.MathStoreOnline2.enums.UserRole;
import lombok.Data;


@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;


}
