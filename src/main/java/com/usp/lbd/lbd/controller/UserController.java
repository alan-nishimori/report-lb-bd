package com.usp.lbd.lbd.controller;

import com.usp.lbd.lbd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity get(String userName, String password) {
        if (userName == null || password == null) {
            return ResponseEntity.badRequest().build();
        }

        final UUID sessionToken = userService.authUser(userName, password);
        if (sessionToken != null) {
            return ResponseEntity.ok(sessionToken);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/check")
    public boolean checkAuth() {
        return true;
    }
}
