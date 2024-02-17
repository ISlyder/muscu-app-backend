package com.cduvivier.muscu.exercise.repository;

import com.cduvivier.muscu.exercise.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseDao extends JpaRepository<Exercise, Integer> {
	@Query("select e from exercises e inner join e.sessions sessions where sessions.id = :sessionId")
	List<Exercise> findAllBySessionsId(@Param("sessionId") int sessionId);
}
