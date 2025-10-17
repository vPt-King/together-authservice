package com.together.AuthService.service;

import com.together.AuthService.dto.request.RegisterRequest;
import com.together.AuthService.model.Player;
import com.together.AuthService.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final PlayerRepository playerRepository;
    private final PasswordEncoder passwordEncoder;
    public String registerPlayer(RegisterRequest registerRequest) {
        if(playerRepository.findByEmail(registerRequest.getEmail()).isPresent()) {
            return "Email đã tồn tại";
        }
        Player player = Player.builder()
                .email(registerRequest.getEmail())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .username(registerRequest.getUsername())
                .build();
        playerRepository.save(player);
        return "Đăng kí tài khoản thành công";
    }
}
