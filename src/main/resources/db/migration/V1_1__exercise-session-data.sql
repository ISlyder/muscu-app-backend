INSERT INTO session (id, name) VALUES (1, 'test-push');
INSERT INTO session (id, name) VALUES (2, 'test-pull');
INSERT INTO session (id, name) VALUES (3, 'test-legs');

INSERT INTO exercise (id, name, description, image, session_id) VALUES (1, 'Développé couché', '', '', 1);
INSERT INTO exercise (id, name, description, image, session_id) VALUES (2, 'Développé millitaire', '', '', 1);
INSERT INTO exercise (id, name, description, image, session_id) VALUES (3, 'Développé incliné', '', '', 1);
INSERT INTO exercise (id, name, description, image, session_id) VALUES (4, 'élévations latérales', '', '', 1);
INSERT INTO exercise (id, name, description, image, session_id) VALUES (5, 'triceps poulie', '', '', 1);
INSERT INTO exercise (id, name, description, image, session_id) VALUES (6, 'écarté poulie', '', '', 1);
INSERT INTO exercise (id, name, description, image, session_id) VALUES (7, 'tractions', '', '', 2);

INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 1);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 2);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 3);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 4);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 5);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (1, 6);
INSERT INTO session_exercises (session_id, exercises_id) VALUES (2, 7);