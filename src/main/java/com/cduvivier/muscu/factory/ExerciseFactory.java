package com.cduvivier.muscu.factory;

import com.cduvivier.muscu.dto.ExerciseDto;
import com.cduvivier.muscu.exercise.model.Exercise;

public class ExerciseFactory {
	public static ExerciseDto toExerciseDto(Exercise exercise) {
		return ExerciseDto.builder()
				.id(exercise.getId())
				.name(exercise.getName())
				.description(exercise.getDescription())
				.image(exercise.getImage())
				.build();
	}
}
