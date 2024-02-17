package com.cduvivier.muscu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
public class RegisterRequest {
	@NotBlank
	private String username;
	@NotBlank
	private String password;
}
