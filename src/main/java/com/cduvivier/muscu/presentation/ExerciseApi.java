package com.cduvivier.muscu.presentation;

import com.cduvivier.muscu.model.Exercise;
import com.cduvivier.muscu.service.ExerciseService;
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
    public List<Exercise> getAll() {
        return this.exerciseService.getAll();
    }

    @GetMapping("/{exerciseId}")
    public Exercise getById(@PathVariable int exerciseId) {
        return this.exerciseService.getById(exerciseId);
    }

    @GetMapping("/sessions/{sessionId}")
    public List<Exercise> getExercisesBySession(@PathVariable int sessionId) {
        return this.exerciseService.getExercisesBySession(sessionId);
    }

    @PostMapping()
    public Exercise create(@RequestBody Exercise exercise) {
        return this.exerciseService.create(exercise);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.exerciseService.delete(id);
    }

}
