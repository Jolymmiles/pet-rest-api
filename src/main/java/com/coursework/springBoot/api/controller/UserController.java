package com.coursework.springBoot.api.controller;


import com.coursework.springBoot.core.mapper.Mapper;
import com.coursework.springBoot.core.model.UserDto;
import com.coursework.springBoot.core.service.UserService;
import com.coursework.springBoot.core.service.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private Mapper mapper;

    @Autowired
    private UserServiceImpl userService;

    @ApiOperation(value = "Добавление нового пользователя")
    @PostMapping
    public UserDto addUSer(@RequestBody UserDto user) {
        return mapper.map(userService.addUser(user), UserDto.class);
    }

    @ApiOperation(value = "Получение пользователя по ID")
    @RequestMapping(value = {"{id}"})
    @GetMapping
    public UserDto getUserById(@PathVariable("id") Long id) {
        return mapper.map(userService.getUser(id), UserDto.class);
    }

    @ApiOperation(value = "Удаление пользователя по ID")
    @RequestMapping(value = {"{id}"}, method = RequestMethod.DELETE)
    @DeleteMapping
    public void deleteUserbyId(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }
}
