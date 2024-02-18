package com.cduvivier.muscu.mapper;

import com.cduvivier.muscu.dto.RegisterRequest;
import com.cduvivier.muscu.model.Role;
import com.cduvivier.muscu.model.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class UserMapper {

	public static User toUser(RegisterRequest userDto) {
		return User.builder()
				.username(userDto.getUsername())
				.password(userDto.getPassword())
				.role(Role.USER)
				.build();
	}
}
