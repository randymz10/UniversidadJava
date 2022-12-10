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

-- 3) Insertar datos (DML)

INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Juan', 'Perez', 'jperez@mail.com', '55443322');

INSERT INTO persona (nombre, apellido, email, telefono) VALUES ('Karla', 'Gomez', 'kgomez@mail.com','22334455');