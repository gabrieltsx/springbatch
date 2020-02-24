DROP TABLE yser IF EXISTS;

CREATE TABLE user  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    name VARCHAR(50),
    lastname VARCHAR(50)
);

INSERT INTO user (id, name, lastname) VALUES (1, 'Gabriel', 'Silva');
INSERT INTO user (id, name, lastname) VALUES (2, 'Maria', 'Silva');
INSERT INTO user (id, name, lastname) VALUES (3, 'Jose', 'Silva');

CREATE TABLE user_imported  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    name VARCHAR(50),
    lastname VARCHAR(50)
);
