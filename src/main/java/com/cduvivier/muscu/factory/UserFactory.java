package com.cduvivier.muscu.factory;

import com.cduvivier.muscu.dto.RegisterRequest;
import com.cduvivier.muscu.model.Role;
import com.cduvivier.muscu.model.User;

public class UserFactory {

	private UserFactory() {
	}

	public static User toUser(RegisterRequest userDto) {
		return User.builder()
				.username(userDto.getUsername())
				.password(userDto.getPassword())
				.role(Role.USER)
				.build();
	}
}
