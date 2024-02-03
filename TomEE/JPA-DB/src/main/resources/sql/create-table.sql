-- Table: public.employee
-- DROP TABLE IF EXISTS ua_user;
CREATE TABLE IF NOT EXISTS git_user
(
    id SERIAL PRIMARY KEY, -- SERIAL type creates a sequence automatically
    first_name VARCHAR(32) NOT NULL,
    middle_name VARCHAR(16),
    last_name VARCHAR(32) NOT NULL,
    user_id  VARCHAR(16) UNIQUE NOT NULL,
    email VARCHAR(50) UNIQUE,
    birthday DATE,
    address VARCHAR(255),
    created_on TIMESTAMP(6) NOT NULL,
    last_login TIMESTAMP(6)
);

ALTER TABLE IF EXISTS git_user
    OWNER to jihwan11;