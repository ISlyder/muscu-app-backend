package com.cduvivier.muscu.service;

import com.cduvivier.muscu.model.Exercise;

import java.util.List;

public interface ExerciseService {
    List<Exercise> getAll();
    Exercise getById(int exerciseId);
    List<Exercise> getExercisesBySession(int sessionId);
    Exercise create(Exercise exercise);
    void delete(int id);
}
