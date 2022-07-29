package com.sparta.spring_project_week02.domain;

import lombok.Getter;

@Getter
public class PostRequestDto {
    private Long id;

    private String title;

    private String author;

    private String content;

    private String password;
}
