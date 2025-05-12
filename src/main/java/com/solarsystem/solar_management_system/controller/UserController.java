package com.solarsystem.solar_management_system.controller;


import com.solarsystem.solar_management_system.dto.user.UserCreateRequestDTO;
import com.solarsystem.solar_management_system.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    @PostMapping("/addNewUser")
    public String addNewUser(@RequestBody UserCreateRequestDTO user) {
        return
    }

}
