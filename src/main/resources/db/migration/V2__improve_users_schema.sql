-- Drop users table if it exists
DROP TABLE IF EXISTS users CASCADE;

-- Users table creation script with improved schema
CREATE TABLE users (
    email VARCHAR(150) PRIMARY KEY NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    birthdate DATE,
    account_status VARCHAR(50) NOT NULL DEFAULT 'active',
    last_login TIMESTAMP,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    job_title VARCHAR(100),
    job_level VARCHAR(50),
    job_hunting BOOLEAN NOT NULL DEFAULT FALSE
);

-- Add index for faster lookups on email
CREATE INDEX idx_users_email ON users(email);

-- Drop table user_roles if it exists
DROP TABLE IF EXISTS user_roles CASCADE;

-- User roles association table with improved schema
CREATE TABLE user_roles (
    user_email VARCHAR(150) NOT NULL,
    role_id UUID NOT NULL,
    PRIMARY KEY (user_email, role_id),
    FOREIGN KEY (user_email) REFERENCES users(email) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES roles(id) ON DELETE CASCADE
);

-- Create user credentials table
CREATE TABLE user_credentials (
    user_email VARCHAR(150) PRIMARY KEY NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_email) REFERENCES users(email) ON DELETE CASCADE
);
