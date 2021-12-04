package com.coursework.springBoot.core.service;

import com.coursework.springBoot.core.mapper.Mapper;
import com.coursework.springBoot.core.model.UserDto;
import com.coursework.springBoot.db.entity.user.UserEntity;
import com.coursework.springBoot.db.entity.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    public UserEntity addUser(UserDto userDto) {
        UserEntity userNew = mapper.map(userDto, UserEntity.class);
        userNew = userRepository.save(userNew);
        return userNew;

    }

    public UserEntity getUser(Long id) {
        UserEntity userOb = userRepository.getById(id);
        return userOb;

    }


    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    //public UserEntity putUser(UserDto userDto)



}
