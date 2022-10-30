package com.netflax.login;

import com.netflax.login.model.LoginRequest;
import com.netflax.login.model.LoginResponse;
import com.netflax.login.service.LoginService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/signup")
@RestController
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping(value = "/customer/login", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)

    public ResponseEntity<LoginResponse> customerLogin(LoginRequest loginRequest) {
        System.out.println("customer/login");
        return ResponseEntity.ok(loginService.login(loginRequest, "customer"));
    }

    @PostMapping(value = "/admin/login", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<LoginResponse> adminLogin(LoginRequest loginRequest) {
        return ResponseEntity.ok(loginService.login(loginRequest, "admin"));
    }
}
