package com.cduvivier.muscu.controller;

import com.cduvivier.muscu.dto.AuthenticationResponse;
import com.cduvivier.muscu.dto.LoginRequest;
import com.cduvivier.muscu.dto.RegisterRequest;
import com.cduvivier.muscu.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
	private final AuthenticationService authenticationService;

	@PostMapping("/register")
	@ResponseStatus(HttpStatus.CREATED)
	public AuthenticationResponse registerUser(@RequestBody RegisterRequest request) {
		return authenticationService.register(request);
	}

	@PostMapping("/login")
	public AuthenticationResponse login(@RequestBody LoginRequest request) {
		return authenticationService.login(request);
	}
	@PostMapping("/logout")
	public String logout() {
		return authenticationService.logout();
	}

}
