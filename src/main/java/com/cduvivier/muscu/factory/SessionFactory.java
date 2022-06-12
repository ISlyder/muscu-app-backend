package com.cduvivier.muscu.factory;

import com.cduvivier.muscu.dto.SessionDto;
import com.cduvivier.muscu.session.model.Session;

public class SessionFactory {
	public static SessionDto toSessionDto(Session session) {
		return SessionDto.builder()
				.id(session.getId())
				.name(session.getName())
				.build();
	}
}
