package com.netflax.registration.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class CustomerSignupRequest {

    private final String username;
    private final String password;

    private final String email;

    @JsonCreator
    public CustomerSignupRequest(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
