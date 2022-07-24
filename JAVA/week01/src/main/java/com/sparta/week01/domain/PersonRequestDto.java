package com.sparta.week01.domain;

import lombok.Getter;

@Getter
public class PersonRequestDto {
    private String name;
    private String job;
    private int age;
    private String address;
}