package com.cduvivier.muscu.repository;

import com.cduvivier.muscu.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionDao extends JpaRepository<Session, Integer> {
}
