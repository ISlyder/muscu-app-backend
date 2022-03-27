package com.cduvivier.muscu.service;

import com.cduvivier.muscu.model.Session;

import java.util.List;

public interface SessionService {
    List<Session> findAll();
    Session getSessionById(int sessionId);
    Session create(Session session);
    void deleteById(int id);
}
