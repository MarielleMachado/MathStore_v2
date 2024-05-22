package com.BackEnd.MathStoreOnline2.dto;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwtToken;

    public AuthenticationResponse(String jwt) {
    }
}
