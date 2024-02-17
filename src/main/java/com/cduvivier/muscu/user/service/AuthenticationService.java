package com.cduvivier.muscu.user.service;

import com.cduvivier.muscu.dto.AuthenticationResponse;
import com.cduvivier.muscu.dto.LoginRequest;
import com.cduvivier.muscu.dto.RegisterRequest;
import com.cduvivier.muscu.user.model.User;
import com.cduvivier.muscu.user.repository.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

import static com.cduvivier.muscu.factory.UserFactory.toUser;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	private final UserDao userDao;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;

	@Transactional
	public AuthenticationResponse register(RegisterRequest request) {
		User user = toUser(request);
		userDao.save(user);
		String jwt = jwtService.generateToken(user);
		return new AuthenticationResponse(jwt);
	}

	public AuthenticationResponse login(LoginRequest request) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		User user = userDao.findByUsername(request.getUsername())
				.orElseThrow(() -> new NoSuchElementException("User " + request.getUsername() + " not found"));
		String jwt = jwtService.generateToken(user);
		return new AuthenticationResponse(jwt);
	}

	public String logout() {
		return null;
	}
}
