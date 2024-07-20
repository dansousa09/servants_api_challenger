CREATE TABLE specializations
(
    id   UUID default gen_random_uuid() primary key,
    name varchar(255) not null
);