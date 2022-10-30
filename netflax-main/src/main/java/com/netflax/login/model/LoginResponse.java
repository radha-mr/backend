package com.netflax.login.model;

public class LoginResponse {

    private final String username;
    private final String email;
    private final String role;

    public LoginResponse(String username, String email, String role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}
