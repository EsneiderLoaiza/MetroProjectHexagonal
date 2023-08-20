package com.example.metro.infrastructure.user.adapter;

import com.example.metro.application.user.mapper.UserMapper;
import com.example.metro.domain.user.model.User;
import com.example.metro.domain.user.model.entity.UserEntity;
import com.example.metro.domain.user.model.port.UserPort;
import com.example.metro.infrastructure.user.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserAdapter implements UserPort {

    private final UserRepository userRepository;

    private  final UserMapper userMapper;

    public UserAdapter(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void saveUser(User user) {
        UserEntity userEntity = userMapper.userToUserEntity(user);
        userRepository.save(userEntity);
    }
}
