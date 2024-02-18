package com.cduvivier.muscu.service;

import com.cduvivier.muscu.dto.ExerciseDto;
import com.cduvivier.muscu.model.Exercise;
import com.cduvivier.muscu.repository.ExerciseDao;
import com.cduvivier.muscu.mapper.ExerciseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ExerciseService {

	private final ExerciseDao exerciseDao;

	public List<ExerciseDto> getAll() {
		var exercises = exerciseDao.findAll();
		return exercises.stream()
				.map(ExerciseMapper::toExerciseDto)
				.collect(Collectors.toList());
	}

	public ExerciseDto getById(int exerciseId) {
		var exercise = this.exerciseDao.findById(exerciseId)
				.orElseThrow(() -> new NoSuchElementException("No exercise found with id " + exerciseId));
		return ExerciseMapper.toExerciseDto(exercise);
	}

	public List<ExerciseDto> getExercisesBySessionId(int sessionId) {
		var exercises = this.exerciseDao.findAllBySessionsId(sessionId);
		return exercises.stream()
				.map(ExerciseMapper::toExerciseDto)
				.collect(Collectors.toList());
	}

	public ExerciseDto create(Exercise exercise) {
		var exerciseToSave = this.exerciseDao.save(exercise);
		return ExerciseMapper.toExerciseDto(exerciseToSave);
	}

	public void delete(int id) {
		this.exerciseDao.deleteById(id);
	}


}
