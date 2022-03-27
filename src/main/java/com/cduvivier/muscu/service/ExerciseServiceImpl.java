package com.cduvivier.muscu.service;

import com.cduvivier.muscu.repository.ExerciseDao;
import com.cduvivier.muscu.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private final ExerciseDao exerciseDao;

    @Autowired
    public ExerciseServiceImpl(ExerciseDao exerciseDao) {
            this.exerciseDao = exerciseDao;
    }

    @Override
    public List<Exercise> getAll() {
        return exerciseDao.findAll();
    }

    @Override
    public Exercise getById(int exerciseId) {
        return this.exerciseDao.findById(exerciseId)
                .orElseThrow(() -> new NoSuchElementException("No exercise found with id " + exerciseId));
    }

    @Override
    public List<Exercise> getExercisesBySession(int sessionId) {
        return this.exerciseDao.findAllBySessionId(sessionId);
    }

    @Override
    public Exercise create(Exercise exercise) {
        return this.exerciseDao.save(exercise);
    }

    @Override
    public void delete(int id) {
        this.exerciseDao.deleteById(id);
    }


}
