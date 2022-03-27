package com.cduvivier.muscu.repository;

import com.cduvivier.muscu.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseDao extends JpaRepository<Exercise, Integer> {
    List<Exercise> findAllBySessionId(int sessionId);
}