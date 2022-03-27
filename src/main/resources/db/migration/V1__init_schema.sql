CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE exercise
(
    id          INTEGER NOT NULL,
    name        VARCHAR(255),
    description VARCHAR(255),
    image       VARCHAR(255),
    session_id  INTEGER,
    CONSTRAINT pk_exercise PRIMARY KEY (id)
);

CREATE TABLE session
(
    id   INTEGER NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_session PRIMARY KEY (id)
);

CREATE TABLE session_exercises
(
    session_id   INTEGER NOT NULL,
    exercises_id INTEGER NOT NULL
);

CREATE TABLE "user"
(
    id   UUID NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_user PRIMARY KEY (id)
);

CREATE TABLE user_session
(
    user_id    UUID    NOT NULL,
    session_id INTEGER NOT NULL
);

ALTER TABLE session_exercises
    ADD CONSTRAINT uc_session_exercises_exercises UNIQUE (exercises_id);

ALTER TABLE user_session
    ADD CONSTRAINT uc_user_session_session UNIQUE (session_id);

ALTER TABLE exercise
    ADD CONSTRAINT FK_EXERCISE_ON_SESSION FOREIGN KEY (session_id) REFERENCES session (id);

ALTER TABLE session_exercises
    ADD CONSTRAINT fk_sesexe_on_exercise FOREIGN KEY (exercises_id) REFERENCES exercise (id);

ALTER TABLE session_exercises
    ADD CONSTRAINT fk_sesexe_on_session FOREIGN KEY (session_id) REFERENCES session (id);

ALTER TABLE user_session
    ADD CONSTRAINT fk_useses_on_session FOREIGN KEY (session_id) REFERENCES session (id);

ALTER TABLE user_session
    ADD CONSTRAINT fk_useses_on_user FOREIGN KEY (user_id) REFERENCES "user" (id);