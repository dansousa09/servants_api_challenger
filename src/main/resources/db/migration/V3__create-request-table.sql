CREATE TABLE requests
(
    id                UUID      default gen_random_uuid() primary key,
    user_id           UUID not null,
    specialization_id UUID not null,
    created_at        TIMESTAMP default now(),
    CONSTRAINT fk_request_user FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT fk_request_specialization FOREIGN KEY (specialization_id) REFERENCES specializations (id)
);