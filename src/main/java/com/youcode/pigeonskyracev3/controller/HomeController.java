package com.youcode.pigeonskyracev3.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/public")
    public String publicEndpoint() {
        return "This is a public endpoint.";
    }

    @GetMapping("/api/user")
    public String userEndpoint(@AuthenticationPrincipal Jwt jwt) {
        return "Hello, User! Your username is: " + jwt.getClaim("preferred_username");
    }

    @GetMapping("/api/admin")
    public String adminEndpoint(@AuthenticationPrincipal Jwt jwt) {
        return "Hello, Admin! Your username is: " + jwt.getClaim("preferred_username");
    }
}
