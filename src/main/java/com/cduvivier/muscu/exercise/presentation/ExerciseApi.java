package com.cduvivier.muscu.exercise.presentation;

import com.cduvivier.muscu.dto.ExerciseDto;
import com.cduvivier.muscu.exercise.model.Exercise;
import com.cduvivier.muscu.exercise.repository.ExerciseDao;
import com.cduvivier.muscu.exercise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseApi {

    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseApi(ExerciseService exerciseService) {
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
