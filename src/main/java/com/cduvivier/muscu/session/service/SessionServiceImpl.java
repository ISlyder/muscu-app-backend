package com.cduvivier.muscu.session.service;

import com.cduvivier.muscu.dto.SessionDto;
import com.cduvivier.muscu.factory.SessionFactory;
import com.cduvivier.muscu.session.model.Session;
import com.cduvivier.muscu.session.repository.SessionDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SessionServiceImpl implements SessionService {

    private final SessionDao sessionDao;

    @Override
    public List<SessionDto> findAll() {
        var sessions = sessionDao.findAll();
        return sessions.stream()
                .map(SessionFactory::toSessionDto)
                .collect(Collectors.toList());
    }

    @Override
    public SessionDto getSessionById(int sessionId) {
        var session = sessionDao.findById(sessionId)
                .orElseThrow(() -> new NoSuchElementException("No session found with id " + sessionId));
        return SessionFactory.toSessionDto(session);
    }

    @Override
    public SessionDto create(Session session) {
        var sessionToSave = sessionDao.save(session);
        return SessionFactory.toSessionDto(sessionToSave);
    }

    @Override
    public void deleteById(int id) {
        sessionDao.deleteById(id);
    }
}
