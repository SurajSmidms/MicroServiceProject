package com.smidms.security_service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@NoArgsConstructor
public class RegisterRequest {

    private String username;
    private String password;
    private Set<String> roles;

}
