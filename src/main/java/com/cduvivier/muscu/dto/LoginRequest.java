package com.cduvivier.muscu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginRequest {
	private String username;
	private String password;
}
