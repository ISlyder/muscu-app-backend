package com.cduvivier.muscu.mapper;

import com.cduvivier.muscu.dto.ExerciseDto;
import com.cduvivier.muscu.model.Exercise;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ExerciseMapper {
	public static ExerciseDto toExerciseDto(Exercise exercise) {
		return ExerciseDto.builder()
				.id(exercise.getId())
				.name(exercise.getName())
				.description(exercise.getDescription())
				.image(exercise.getImage())
				.build();
	}
}
