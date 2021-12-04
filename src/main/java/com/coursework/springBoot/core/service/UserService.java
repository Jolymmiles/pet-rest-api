package com.coursework.springBoot.core.service;

import com.coursework.springBoot.core.model.UserDto;
import com.coursework.springBoot.db.entity.user.UserEntity;

/**
 * Сервис доступа к пльзователям
 */
public interface UserService {

    /**
     * Adding user
     *
     * @param userDto - user entity
     * @return UserDto
     */
    public UserEntity addUser(UserDto userDto);

    /**
     * Get user
     *
     * @param id - user id
     * @return UserDto
     */
    public UserEntity getUser(Long id);

    /**
     * Удаляет пользователя
     *
     * @param id - user id
     * @return
     */
    public void deleteUserById(Long id);
}
