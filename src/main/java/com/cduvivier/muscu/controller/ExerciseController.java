package com.cduvivier.muscu.controller;

import com.cduvivier.muscu.dto.ExerciseDto;
import com.cduvivier.muscu.model.Exercise;
import com.cduvivier.muscu.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

	private final ExerciseService exerciseService;

	@Autowired
	public ExerciseController(ExerciseService exerciseService) {
		this.exerciseService = exerciseService;
	}

	@GetMapping()
	public List<ExerciseDto> getAll() {
		return this.exerciseService.getAll();
	}

	@GetMapping("/{exerciseId}")
	public ExerciseDto getById(@PathVariable int exerciseId) {
		return this.exerciseService.getById(exerciseId);
	}

	@GetMapping("/sessions/{sessionId}")
	public List<ExerciseDto> getExercisesBySession(@PathVariable int sessionId) {
		return this.exerciseService.getExercisesBySessionId(sessionId);
	}

	@PostMapping()
	public ExerciseDto create(@RequestBody Exercise exercise) {
		return this.exerciseService.create(exercise);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.exerciseService.delete(id);
	}

}
