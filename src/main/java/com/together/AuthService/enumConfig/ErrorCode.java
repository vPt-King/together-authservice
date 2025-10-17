package com.together.AuthService.enumConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(999, "Exception chưa được phân loại"),
    USER_EXISTED(400, "User đã tồn tại")
    ;
    private int code;
    private String message;
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
