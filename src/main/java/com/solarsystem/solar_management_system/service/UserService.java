package com.solarsystem.solar_management_system.service;

import com.solarsystem.solar_management_system.dto.user.UserCreateRequestDTO;
import com.solarsystem.solar_management_system.models.User;
import com.solarsystem.solar_management_system.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
        Optional<User> userDetail = repository.findByEmail(username);
        return  userDetail.map(UserInfoDetails::new)
                .orElseThrow(()-> new UsernameNotFoundException("User not found: " + username));
    }

    public String addUser(UserCreateRequestDTO user) {
        user.setPassword(this.encoder.encode(user.getPassword()));
        User new_user = this.modelMapper.map(user,User.class);
        this.repository.save(new_user);
        return "User created successfully";
    }



}
