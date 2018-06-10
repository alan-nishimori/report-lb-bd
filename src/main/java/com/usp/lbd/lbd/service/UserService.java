package com.usp.lbd.lbd.service;

import com.usp.lbd.lbd.entity.Session;
import com.usp.lbd.lbd.entity.User;
import com.usp.lbd.lbd.repository.SessionRepository;
import com.usp.lbd.lbd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Component
public class UserService {

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private UserRepository userRepository;

    public UUID authUser(String userName, String password) {
        String encryptedPassword = cryptPassword(password);
        User user = userRepository.findByNameAndPassword(userName, encryptedPassword);
        return Optional.ofNullable(user)
            .map(this::performAuthentication).orElse(null);
    }

    private UUID performAuthentication(User authUser) {
        authUser.setLastLogin(new Date());
        userRepository.save(authUser);
        return sessionRepository.save(Session.builder()
            .token(UUID.randomUUID())
            .role(authUser.getRole())
            .userId(authUser.getId()).build()).getToken();
    }

    private String cryptPassword(String password) {
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }
}
