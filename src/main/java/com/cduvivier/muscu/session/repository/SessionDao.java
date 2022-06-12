package com.cduvivier.muscu.session.repository;

import com.cduvivier.muscu.session.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionDao extends JpaRepository<Session, Integer> {
}
