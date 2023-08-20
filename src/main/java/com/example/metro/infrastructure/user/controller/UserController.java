package com.example.metro.infrastructure.user.controller;

import com.example.metro.application.user.handler.CreateUserHandler;
import com.example.metro.domain.user.model.dto.RequestCreateUserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("metro/api")
public class UserController {

    private final CreateUserHandler createUserHandler;

    public UserController(CreateUserHandler createUserHandler) {
        this.createUserHandler = createUserHandler;
    }

    @PostMapping("/user")
    public ResponseEntity<String> test(@RequestBody RequestCreateUserDto requestCreateUserDto) {
        //String mensajeRespuesta = createUserHandler.execute(requestCreateUserDto);
        return ResponseEntity.ok(createUserHandler.execute(requestCreateUserDto));
    }

}
