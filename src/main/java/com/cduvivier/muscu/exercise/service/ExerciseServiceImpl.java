package com.cduvivier.muscu.exercise.service;

import com.cduvivier.muscu.dto.ExerciseDto;
import com.cduvivier.muscu.exercise.model.Exercise;
import com.cduvivier.muscu.exercise.repository.ExerciseDao;
import com.cduvivier.muscu.factory.ExerciseFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ExerciseServiceImpl implements ExerciseService {

	private final ExerciseDao exerciseDao;

	@Override
	public List<ExerciseDto> getAll() {
		var exercises = exerciseDao.findAll();
		return exercises.stream()
				.map(ExerciseFactory::toExerciseDto)
				.collect(Collectors.toList());
	}

	@Override
	public ExerciseDto getById(int exerciseId) {
		var exercise = this.exerciseDao.findById(exerciseId)
				.orElseThrow(() -> new NoSuchElementException("No exercise found with id " + exerciseId));
		return ExerciseFactory.toExerciseDto(exercise);
	}

	@Override
	public List<ExerciseDto> getExercisesBySessionId(int sessionId) {
		var exercises = this.exerciseDao.findAllBySessionsId(sessionId);
		return exercises.stream()
				.map(ExerciseFactory::toExerciseDto)
				.collect(Collectors.toList());
	}

	@Override
	public ExerciseDto create(Exercise exercise) {
		var exerciseToSave = this.exerciseDao.save(exercise);
		return ExerciseFactory.toExerciseDto(exerciseToSave);
	}

	@Override
	public void delete(int id) {
		this.exerciseDao.deleteById(id);
	}


}
