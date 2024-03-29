package com.example.mall.user;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false, unique = true)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String nickname;

    private String userImage;
    private boolean role;
    private boolean isWithdraw;
    private Timestamp createdAt;

    @Builder
    public User(Integer id, String username, String password, String nickname, String userImage, boolean role, boolean isWithdraw, Timestamp createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.userImage = userImage;
        this.role = role;
        this.isWithdraw = isWithdraw;
        this.createdAt = createdAt;
    }
}
