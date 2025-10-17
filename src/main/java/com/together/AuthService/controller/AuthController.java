package com.together.AuthService.controller;

import com.together.AuthService.dto.request.RegisterRequest;
import com.together.AuthService.dto.response.ApiResponse;
import com.together.AuthService.service.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthController {
    private final AuthService authService;

    @GetMapping("")

    @PostMapping("/register")
    ApiResponse<String> register(@RequestBody RegisterRequest request){
        var result = authService.registerPlayer(request);
        return ApiResponse.<String>builder()
                .message(result)
                .result(result)
                .build();
    }
}
