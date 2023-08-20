package com.example.metro.application.user.handler;

import com.example.metro.application.user.mapper.UserMapper;
import com.example.metro.application.user.usecase.CreateUserUseCase;
import com.example.metro.domain.user.model.User;
import com.example.metro.domain.user.model.dto.RequestCreateUserDto;
import org.springframework.stereotype.Service;

@Service
public class CreateUserHandler {

    private final UserMapper userMapper;

    private final CreateUserUseCase createUserUseCase;

    public CreateUserHandler(UserMapper userMapper, CreateUserUseCase createUserUseCase) {
        this.userMapper = userMapper;
        this.createUserUseCase = createUserUseCase;
    }


    public String execute(RequestCreateUserDto createUserDto) {
        User user = userMapper.requestCreateUserDtoToUser(createUserDto);
        return createUserUseCase.createUser(user);
    }

}
