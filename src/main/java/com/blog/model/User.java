package com.blog.model;

import lombok.Data;

import java.time.LocalDateTime;

// 왜 지금은 0개의 사용 위치 인가?

@Data
public class User {
    private long id;

    private String userName;

    private String password;

    private String name;

    private String age;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

}
