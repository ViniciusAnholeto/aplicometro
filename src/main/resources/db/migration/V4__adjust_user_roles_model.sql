-- Drop existing user_roles table if it exists
DROP TABLE IF EXISTS user_roles;

-- Alter users table to remove old role_id column if it exists
ALTER TABLE users
DROP COLUMN IF EXISTS role_id;

ALTER TABLE users
ADD COLUMN role_id INTEGER REFERENCES roles(id);