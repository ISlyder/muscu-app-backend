package com.cduvivier.muscu.exercise.service;

import com.cduvivier.muscu.dto.ExerciseDto;
import com.cduvivier.muscu.exercise.model.Exercise;

import java.util.List;

public interface ExerciseService {
	List<ExerciseDto> getAll();

	ExerciseDto getById(int exerciseId);

	List<ExerciseDto> getExercisesBySessionId(int sessionId);

	ExerciseDto create(Exercise exercise);

	void delete(int id);
}
