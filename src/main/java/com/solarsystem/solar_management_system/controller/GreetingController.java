package com.solarsystem.solar_management_system.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.solarsystem.solar_management_system.dto.Greeting;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public Greeting greeting(@RequestParam(name = "value", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
