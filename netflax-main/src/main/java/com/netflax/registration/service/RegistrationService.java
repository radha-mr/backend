package com.netflax.registration.service;

import com.netflax.login.db.model.EUser;
import com.netflax.login.db.repository.UserRepository;
import com.netflax.registration.model.CustomerSignupRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class RegistrationService {

    public static final String ROLE_CUSTOMER = "customer";
    private final UserRepository userRepository;

    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void signup(CustomerSignupRequest signupRequest) {
        Optional<EUser> eUserOptional = userRepository.findUserByUsernameAndRole(signupRequest.getUsername(), ROLE_CUSTOMER);
        if (eUserOptional.isPresent()) {
            throw new RuntimeException("Username already taken");
        }
        eUserOptional = userRepository.findUserByEmailAndRole(signupRequest.getEmail(), ROLE_CUSTOMER);
        if (eUserOptional.isPresent()) {
            throw new RuntimeException("Email already in use");
        }
        EUser eUser = new EUser(
                signupRequest.getUsername(),
                signupRequest.getEmail(),
                signupRequest.getPassword(),
                ROLE_CUSTOMER);
        userRepository.save(eUser);
    }
}
