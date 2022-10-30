package com.netflax.login.service;

import com.netflax.login.db.model.EUser;
import com.netflax.login.db.repository.UserRepository;
import com.netflax.login.model.LoginRequest;
import com.netflax.login.model.LoginResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@Service
public class LoginService {

    private final UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginResponse login(LoginRequest loginRequest, String role) {
        Optional<EUser> loggedInUserOptional = userRepository.findUserByUsernameAndRole(
                loginRequest.getUsername(), role);
        return loggedInUserOptional
                .map(eUser -> new LoginResponse(
                        eUser.getUsername(), eUser.getEmail(), eUser.getRole()))
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
