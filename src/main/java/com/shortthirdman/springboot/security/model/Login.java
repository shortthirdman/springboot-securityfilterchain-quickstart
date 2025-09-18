package com.shortthirdman.springboot.security.model;

import org.springframework.lang.NonNull;

public record Login(@NonNull String username, @NonNull String password) {
}
