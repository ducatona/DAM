CREATE DATABASE IF NOT EXISTS IndiGames;
USE IndiGames;

CREATE TABLE IF NOT EXISTS nacionalidad (
    id_nacionalidad INT AUTO_INCREMENT PRIMARY KEY,
    nacionalidad VARCHAR(40)
);

CREATE TABLE IF NOT EXISTS perfil (
    id_perfil INT AUTO_INCREMENT PRIMARY KEY,
    tipo_usuario ENUM('invitado','usuario','desarrollador','administrador')
);

CREATE TABLE IF NOT EXISTS pegui (
    id_pegui INT AUTO_INCREMENT PRIMARY KEY,
    tipo_pegui ENUM('3','7','12','16','18','18+')
);

CREATE TABLE IF NOT EXISTS generos (
    id_genero INT AUTO_INCREMENT PRIMARY KEY,
    nombre_genero VARCHAR(50),
    descripcion_genero VARCHAR(255)
);



CREATE TABLE IF NOT EXISTS usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellidos VARCHAR(40) NOT NULL,
    fecha_nac DATE NOT NULL,
    alias VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL,
    email VARCHAR(30) NOT NULL,
    id_nacionalidad INT NOT NULL,
    id_perfil INT DEFAULT(1),
    id_biblioteca INT(9) NOT NULL,
    CONSTRAINT fk_usuarios_nacionalidad FOREIGN KEY (id_nacionalidad) REFERENCES nacionalidad(id_nacionalidad) ON UPDATE NO ACTION ON DELETE NO ACTION,
    CONSTRAINT fk_usuarios_perfil FOREIGN KEY (id_perfil) REFERENCES perfil(id_perfil) ON UPDATE CASCADE ON DELETE SET NULL
);
CREATE TABLE IF NOT EXISTS biblioteca (
    id_biblioteca INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    fecha DATE,
    url VARCHAR(150),
    CONSTRAINT fk_biblioteca_usuario FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario) ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE IF NOT EXISTS juegos (
    id_juego INT PRIMARY KEY,
    nombre_juego VARCHAR(50) NOT NULL,
    descripcion VARCHAR(255),
    url VARCHAR(150),
    url_caratula VARCHAR(150),
    id_genero INT NOT NULL,
    nivel_dificultad ENUM('Fácil','Medio','Difícil'),
    fecha_creacion DATE,
    id_desarrollador INT,
    id_pegui INT NOT NULL,
    precio DECIMAL(10,2),
    descargas_acumuladas INT,
    CONSTRAINT fk_juegos_genero FOREIGN KEY (id_genero) REFERENCES generos(id_genero) ON DELETE RESTRICT,
    CONSTRAINT fk_juegos_desarrollador FOREIGN KEY (id_desarrollador) REFERENCES usuarios(id_usuario) ON UPDATE NO ACTION ON DELETE CASCADE,
    CONSTRAINT fk_juegos_pegui FOREIGN KEY (id_pegui) REFERENCES pegui(id_pegui)
);

CREATE TABLE IF NOT EXISTS descargas (
    id_descarga INT AUTO_INCREMENT PRIMARY KEY,
    id_biblioteca INT NOT NULL,
    id_juegos INT NOT NULL,
    fecha DATE,
    CONSTRAINT fk_descargas_biblioteca FOREIGN KEY (id_biblioteca) REFERENCES biblioteca(id_biblioteca) ON UPDATE RESTRICT ON DELETE RESTRICT,
    CONSTRAINT fk_descargas_juegos FOREIGN KEY (id_juegos) REFERENCES juegos(id_juego) ON UPDATE RESTRICT ON DELETE RESTRICT
);
