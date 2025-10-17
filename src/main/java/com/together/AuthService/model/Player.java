package com.together.AuthService.model;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class Player extends User {

    private int level = 1;
    private int experience = 0;
    private int coins = 0;
    private String bio;
    private String avatar;
    private String wallpaper;
}
