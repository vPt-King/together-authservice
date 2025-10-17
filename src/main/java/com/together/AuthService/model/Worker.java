package com.together.AuthService.model;

import com.together.AuthService.enumConfig.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Worker extends User {

    private String position;
    private double salary;
    private boolean isAdmin = false;
    @Enumerated(EnumType.STRING)
    private Role role;
}