package com.together.AuthService.dto.response;

import com.together.AuthService.enumConfig.Status;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlayerResponse {
    String uuid;
    String username;
    int level;
    int experience;
    int coins;
    String avatar;
    Status status;
}
