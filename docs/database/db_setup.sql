-- Create student database
CREATE DATABASE IF NOT EXISTS student_database;

-- Switch to the created database
USE student_database;

-- Create Student table
CREATE TABLE IF NOT EXISTS student (
    oid VARCHAR(35) PRIMARY KEY NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    tc_no VARCHAR(11) NOT NULL,
    birth_date VARCHAR(12) NOT NULL,
    registration_date VARCHAR(14) NOT NULL,
    course_time VARCHAR(20),
    remaining_day VARCHAR(14) NOT NULL,
    optime VARCHAR(14) NOT NULL
    );