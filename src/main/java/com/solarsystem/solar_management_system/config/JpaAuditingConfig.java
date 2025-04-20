package com.solarsystem.solar_management_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import com.solarsystem.solar_management_system.models.User;

import java.util.Optional;
import java.util.UUID;

@Configuration
@EnableJpaAuditing
public class JpaAuditingConfig {

//    @Bean
//    public AuditorAware<UUID> auditorProvider() {
//        return () -> {
//            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//            if (auth == null || !auth.isAuthenticated()) return Optional.empty();
//
//            Object principal = auth.getPrincipal();
//            if (principal instanceof User user){
//                return Optional.of(user.getId());
//            }
//
//            return Optional.empty();
//        };
//    }

}
