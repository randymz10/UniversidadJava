-- 1) Creando la base de datos (DDL): 

CREATE DATABASE sga;

-- 2) Crear tablas 

CREATE TABLE domicilio (
    id_domicilio INT NOT NULL AUTO_INCREMENT,
    calle VARCHAR(45),
    no_calle VARCHAR(45),
    pais VARCHAR(45),
    PRIMARY KEY (id_domicilio)
);

CREATE TABLE contacto (
    id_contacto INT NOT NULL AUTO_INCREMENT,
    telefono VARCHAR(45),
    email VARCHAR(45),
    PRIMARY KEY(id_contacto)
);

CREATE TABLE curso (
    id_curso int NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45),
    precio DOUBLE,
    PRIMARY KEY (id_curso)
);

CREATE TABLE alumno(
    id_alumno INT NOT NULL AUTO_INCREMENT,
    id_domicilio INT,
    id_contacto INT,
    nombre VARCHAR(45),
    apellido VARCHAR(45),
    PRIMARY KEY (id_alumno),
    FOREIGN KEY (id_domicilio) REFERENCES domicilio(id_domicilio),
    FOREIGN KEY (id_contacto) REFERENCES contacto(id_contacto)
);

CREATE TABLE asignacion (
    id_asignacion INT NOT NULL AUTO_INCREMENT,
    id_alumno INT,
    id_curso INT,
    turno VARCHAR(45),
    PRIMARY KEY (id_asignacion),
    FOREIGN KEY (id_alumno) REFERENCES alumno(id_alumno),
    FOREIGN KEY (id_curso) REFERENCES curso(id_curso)
);

-- 3) Insertar datos (DML)

-- Domicilio
INSERT INTO domicilio (calle, no_calle, pais) VALUES ('Saturno', '15', 'Mexico');
INSERT INTO domicilio (calle, no_calle, pais) VALUES ('Candelaria', '35', 'Venezuela');

-- Contacto

INSERT INTO contacto (telefono, email) VALUES ('55443322', 'jperez@mail.com');
INSERT INTO contacto (telefono, email) VALUES ('22334455', 'kgomez@mail.com');

-- Alumno

INSERT INTO alumno (id_domicilio, id_contacto, nombre, apellido) VALUES (1, 1, 'Juan', 'Perez');
INSERT INTO alumno (id_domicilio, id_contacto, nombre, apellido) VALUES (2, 2, 'Karla', 'Gomez');

-- Curso

INSERT INTO curso (nombre, precio) VALUES ('Fundamentos Java', 200);
INSERT INTO curso (nombre, precio) VALUES ('Java con JDBC', 300);

-- Asignacion

INSERT INTO asignacion (id_alumno, id_curso, turno) VALUES (1, 1, 'Matutino');
INSERT INTO asignacion (id_alumno, id_curso, turno) VALUES (2, 2, 'Vespertino');
INSERT INTO asignacion (id_alumno, id_curso, turno) VALUES (1, 2, 'Vespertino');

