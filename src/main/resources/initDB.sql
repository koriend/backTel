DROP TABLE IF EXISTS shoplist;
DROP TABLE IF EXISTS users;
CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE users
(
    id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    chat_id    INTEGER UNIQUE                NOT NULL,
    name       VARCHAR                       NOT NULL
);

CREATE TABLE shoplist
(
    id             INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name           VARCHAR NOT NULL,
    date           VARCHAR NOT NULL
);