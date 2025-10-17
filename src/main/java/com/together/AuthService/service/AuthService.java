package com.together.AuthService.service;

import com.together.AuthService.dto.request.RegisterRequest;
import com.together.AuthService.enumConfig.ErrorCode;
import com.together.AuthService.exception.AppException;
import com.together.AuthService.mapper.PlayerMapper;
import com.together.AuthService.model.Player;
import com.together.AuthService.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final PlayerRepository playerRepository;
    private final PasswordEncoder passwordEncoder;
    private final PlayerMapper playerMapper;
    public String registerPlayer(RegisterRequest registerRequest) {
        if(playerRepository.findByEmail(registerRequest.getEmail()).isPresent()) {
            throw new AppException(ErrorCode.USER_EXISTED);
        }
        Player player = playerMapper.fromRegisterRequestToUser(registerRequest);
        String hashPassword = passwordEncoder.encode(registerRequest.getPassword());
        player.setPassword(hashPassword);
        playerRepository.save(player);
        return "Đăng kí tài khoản thành công";
    }
}
