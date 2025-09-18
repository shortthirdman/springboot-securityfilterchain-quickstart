package com.shortthirdman.springboot.security.controller;

import org.springframework.boot.actuate.endpoint.SecurityContext;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AccountController {

    @GetMapping("/account")
    public ResponseEntity<Map<String, Object>> getUserInfo() {
        SecurityContext context = (SecurityContext) SecurityContextHolder.getContext();
        Authentication authentication = (Authentication) context.getPrincipal();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        return ResponseEntity.ok(Map.of("info", "Digest", "username", authentication.getName(), "authorities", authorities));
    }
}
