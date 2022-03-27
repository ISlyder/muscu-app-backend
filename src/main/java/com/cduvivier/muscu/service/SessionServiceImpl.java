package com.cduvivier.muscu.service;

import com.cduvivier.muscu.model.Session;
import com.cduvivier.muscu.repository.SessionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SessionServiceImpl implements SessionService {

    private final SessionDao sessionDao;

    @Autowired
    public SessionServiceImpl(SessionDao sessionDao) {
        this.sessionDao = sessionDao;
    }

    @Override
    public List<Session> findAll() {
        return sessionDao.findAll();
    }

    @Override
    public Session getSessionById(int sessionId) {
        return sessionDao.findById(sessionId)
                .orElseThrow(() -> new NoSuchElementException("No session found with id " + sessionId));
    }

    @Override
    public Session create(Session session) {
        return sessionDao.save(session);
    }

    @Override
    public void deleteById(int id) {
        sessionDao.deleteById(id);
    }
}
