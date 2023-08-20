package com.example.metro.application.user.usecase;

import com.example.metro.domain.user.model.User;
import com.example.metro.domain.user.model.port.UserPort;
import org.springframework.stereotype.Component;

@Component
public class CreateUserUseCase {

    private final UserPort userPort;

    public CreateUserUseCase(UserPort userPort) {
        this.userPort = userPort;
    }

    public String createUser(User user) {

        if(user.majorOrEqualTo15(user.getAge())) {
            userPort.saveUser(user);
            return "Usuario guardado con exito";
        }

        return "El usuario es menor a 15 años";
    }

}
