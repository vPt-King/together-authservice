package com.together.AuthService.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerLoginRequest {
    private String email;
    private String password;
}
