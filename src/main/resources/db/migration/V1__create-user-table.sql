CREATE
EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE users
(
    id       UUID default gen_random_uuid() primary key,
    name     varchar(255) not null,
    email    varchar(255) not null,
    password varchar(255) not null
);