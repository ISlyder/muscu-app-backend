package com.cduvivier.muscu.mapper;

import com.cduvivier.muscu.dto.SessionDto;
import com.cduvivier.muscu.model.Session;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class SessionMapper {
	public static SessionDto toSessionDto(Session session) {
		return SessionDto.builder()
				.id(session.getId())
				.name(session.getName())
				.build();
	}
}
