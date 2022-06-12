INSERT INTO session (id, name) VALUES (1, 'test-push');
INSERT INTO session (id, name) VALUES (2, 'test-pull');
INSERT INTO session (id, name) VALUES (3, 'test-legs');

INSERT INTO exercise (id, name, description, image) VALUES (1, 'Développé couché', '', '');
INSERT INTO exercise (id, name, description, image) VALUES (2, 'Développé millitaire', '', '');
INSERT INTO exercise (id, name, description, image) VALUES (3, 'Développé incliné', '', '');
INSERT INTO exercise (id, name, description, image) VALUES (4, 'élévations latérales', '', '');
INSERT INTO exercise (id, name, description, image) VALUES (5, 'triceps poulie', '', '');
INSERT INTO exercise (id, name, description, image) VALUES (6, 'écarté poulie', '', '');
INSERT INTO exercise (id, name, description, image) VALUES (7, 'tractions', '', '');

INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 1);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 2);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 3);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 4);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 5);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 6);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (2, 7);

INSERT INTO exercise_sessions (exercise_id, sessions_id) VALUES (1, 1);
INSERT INTO exercise_sessions (exercise_id, sessions_id) VALUES (2, 1);
INSERT INTO exercise_sessions (exercise_id, sessions_id) VALUES (3, 1);
INSERT INTO exercise_sessions (exercise_id, sessions_id) VALUES (4, 1);
INSERT INTO exercise_sessions (exercise_id, sessions_id) VALUES (5, 1);
INSERT INTO exercise_sessions (exercise_id, sessions_id) VALUES (6, 1);
INSERT INTO exercise_sessions (exercise_id, sessions_id) VALUES (7, 2);