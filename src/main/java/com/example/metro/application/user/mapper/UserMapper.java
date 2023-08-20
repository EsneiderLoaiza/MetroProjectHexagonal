package com.example.metro.application.user.mapper;

import com.example.metro.domain.user.model.User;
import com.example.metro.domain.user.model.dto.RequestCreateUserDto;
import com.example.metro.domain.user.model.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User requestCreateUserDtoToUser(RequestCreateUserDto createUserDto) {

        User user = new User();
        user.setName(createUserDto.getName());
        user.setAge(createUserDto.getAge());

        return user;
    }

    public UserEntity userToUserEntity(User user) {
        UserEntity userEntity = new UserEntity(user.getName(), user.getAge());
        return userEntity;
        // return  new UserEntity(user.getName(), user.getAge());
    }

}
