-- Recruiters table
CREATE TABLE recruiters (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    phone VARCHAR(20),
    linkedin TEXT,
    company_name VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Main applications table
CREATE TABLE applications (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    recruiter_id BIGINT,
    job_title VARCHAR(255) NOT NULL,
    company_name VARCHAR(255),
    source VARCHAR(100),
    job_link TEXT,
    application_date DATE,
    status VARCHAR(50),
    salary TEXT,
    location VARCHAR(255),
    notes TEXT,
    considerations TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_app_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_app_recruiter FOREIGN KEY (recruiter_id) REFERENCES recruiters(id)
);

-- Application status history table
CREATE TABLE application_status_history (
    id BIGSERIAL PRIMARY KEY,
    application_id BIGINT NOT NULL,
    status VARCHAR(50) NOT NULL,
    notes TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_status_application FOREIGN KEY (application_id) REFERENCES applications(id)
);

-- Tags table for categorizing applications
CREATE TABLE tags (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(50) UNIQUE NOT NULL
);

-- Table to associate applications with tags
CREATE TABLE application_tags (
    application_id BIGINT NOT NULL,
    tag_id BIGINT NOT NULL,

    PRIMARY KEY (application_id, tag_id),
    CONSTRAINT fk_app_tag_application FOREIGN KEY (application_id) REFERENCES applications(id),
    CONSTRAINT fk_app_tag_tag FOREIGN KEY (tag_id) REFERENCES tags(id)
);
