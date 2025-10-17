package com.together.AuthService.mapper;

import com.together.AuthService.dto.request.RegisterRequest;
import com.together.AuthService.model.Player;
import com.together.AuthService.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    Player fromRegisterRequestToUser(RegisterRequest registerRequest);
}
