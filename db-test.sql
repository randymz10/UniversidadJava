-- 1) Creando la base de datos (DDL): 

CREATE DATABASE test;

-- 2) Crear tabla persona

CREATE TABLE persona (
    id_persona INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45),
    apellido VARCHAR(45),
    email VARCHAR(45),
    telefono VARCHAR(45),
    PRIMARY KEY (id_persona)
);

CREATE TABLE usuario (
    id_usuario INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(45),
    password VARCHAR(128),
    PRIMARY KEY (id_usuario)
);

CREATE TABLE rol (
    id_rol INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45),
    id_usuario INT,
    PRIMARY KEY (id_rol),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

-- 3) Insertar datos (DML)

-- Tabla persona

INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Juan', 'Perez', 'jperez@mail.com', '55443322');
INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Karla', 'Gomez', 'kgomez@mail.com','22334455');

-- Tabla usuario

INSERT INTO usuario (username, password) VALUES ( 'admin', '123');
INSERT INTO usuario (username, password) VALUES ( 'user', '123');

-- Tabla rol

INSERT INTO rol (nombre, id_usuario) VALUES ( 'ROLE_ADMIN', '1');
INSERT INTO rol (nombre, id_usuario) VALUES ( 'ROLE_USER', '1');
INSERT INTO rol (nombre, id_usuario) VALUES ( 'ROLE_USER', '2');

-- 4) Update password encriptados

UPDATE usuario
SET password = '$2a$10$drPx5pRzQiN/LVG.pbqgTOHtce6M1/3.O1cXMuyNuyLEAm8WasK8S'
WHERE id_usuario = 1;

UPDATE usuario
SET password = '$2a$10$LKWa8Xt/rocEBLtbYJittuGnYcy0QVrrR2MtYrZ/XqCceehXpzgya'
WHERE id_usuario = 2;