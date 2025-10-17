package com.together.AuthService.exception;

import com.together.AuthService.dto.response.ApiResponse;
import com.together.AuthService.enumConfig.ErrorCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = AppException.class)
    ApiResponse<String> handlingAppException(AppException e) {
        return ApiResponse.<String>builder()
                .code(e.getErrorCode().getCode())
                .message(e.getMessage())
                .result(e.getMessage())
                .build();
    }

    @ExceptionHandler(value=Exception.class)
    ApiResponse<String> handlingUncategorizedException(Exception e) {
        return ApiResponse.<String>builder()
                .code(ErrorCode.UNCATEGORIZED_EXCEPTION.getCode())
                .message(ErrorCode.UNCATEGORIZED_EXCEPTION.getMessage())
                .result(ErrorCode.UNCATEGORIZED_EXCEPTION.getMessage())
                .build();
    }

}
