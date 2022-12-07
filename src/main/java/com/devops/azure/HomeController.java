package com.devops.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Hello from Spring Boot with Gradle";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
