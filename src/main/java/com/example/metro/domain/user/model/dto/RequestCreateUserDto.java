package com.example.metro.domain.user.model.dto;

import lombok.Data;

@Data
public class RequestCreateUserDto {

    private String name;

    private int age;


    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
