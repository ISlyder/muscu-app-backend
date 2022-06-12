package com.cduvivier.muscu.session.service;

import com.cduvivier.muscu.dto.SessionDto;
import com.cduvivier.muscu.session.model.Session;

import java.util.List;

public interface SessionService {
    List<SessionDto> findAll();
    SessionDto getSessionById(int sessionId);
    SessionDto create(Session session);
    void deleteById(int id);
}
