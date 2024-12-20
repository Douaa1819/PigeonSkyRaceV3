package com.youcode.pigeonskyracev3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public Endpoint - No authentication required.";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "User Endpoint - Authenticated users only.";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Admin Endpoint - Admin role required.";
    }
}
