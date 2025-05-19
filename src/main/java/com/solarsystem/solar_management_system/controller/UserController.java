package com.solarsystem.solar_management_system.controller;


import com.solarsystem.solar_management_system.dto.user.UserCreateRequestDTO;
import com.solarsystem.solar_management_system.models.User;
import com.solarsystem.solar_management_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private UserService service;

    @PostMapping("/addNewUser")
    public String addNewUser(@RequestBody UserCreateRequestDTO user) {
        return this.service.addUser(user);
    }

}
