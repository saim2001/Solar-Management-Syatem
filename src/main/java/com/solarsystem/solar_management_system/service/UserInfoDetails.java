package com.solarsystem.solar_management_system.service;
import java.util.Collection;
import java.util.List;

import com.solarsystem.solar_management_system.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserInfoDetails implements UserDetails {

    private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    public UserInfoDetails(User user){
        this.username = user.getEmail();
        this.password = user.getPassword_hash();
        this.authorities = List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));



    }

    @Override
    public Collection<? extends  GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
