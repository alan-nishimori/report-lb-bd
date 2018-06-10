package com.usp.lbd.lbd;

import com.usp.lbd.lbd.entity.Session;
import com.usp.lbd.lbd.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.UUID;
import java.util.function.Function;

@Component
public class AuthFilter implements HandlerInterceptor {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response
        , Object handler) throws Exception {
        return isLoggedIn(request);
    }

    private boolean isLoggedIn(HttpServletRequest request) {
        try {
            return Arrays.stream(request.getCookies())
                .filter(cookie -> cookie.getName().equals("user-session"))
                .findFirst()
                .map(session ->
                    sessionRepository.findById(UUID.fromString(session.getValue()))
                        .map(isUserAllowedToPage(request))
                        .orElse(false))
                .orElse(false);
        } catch (IllegalStateException ex) {
            return false;
        }
    }

    private Function<Session, Boolean> isUserAllowedToPage(HttpServletRequest request) {
        return authSession -> {
            sessionRepository.save(authSession);
            return authSession.getRole().getPages().contains(request.getRequestURI());
        };
    }

}
