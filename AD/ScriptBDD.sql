
-- creacion base de datos
create database  if not exists videojuegos; 

-- Creación de usuarios

CREATE USER 'adrian'@'localhost' IDENTIFIED BY '1234';
CREATE USER 'pablo'@'localhost' IDENTIFIED BY '1234';
CREATE USER 'alvaro'@'localhost' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON *.* TO 'adrian'@'localhost';
GRANT ALL PRIVILEGES ON *.* TO 'pablo'@'localhost';
GRANT ALL PRIVILEGES ON *.* TO 'alvaro'@'localhost';


-- Crear la tabla de juegos
CREATE TABLE juegos (
    id_juego INT AUTO_INCREMENT PRIMARY KEY,
    nombre_juego VARCHAR(50) NOT NULL,
    tipo VARCHAR(20) NOT NULL
);
-- Insertar datos en la tabla de juegos
INSERT INTO juegos (nombre_juego, tipo) VALUES
('Juego1', 'psp'),
('Juego2', 'switch'),
('Juego3', 'ps4'),
('Juego4', 'xbox'),
('Juego5', 'pc'),
('Juego6', 'nintendo'),
('Juego7', 'ps4'),
('Juego8', 'switch'),
('Juego9', 'psp'),
('Juego10', 'xbox360');

-- Crear la tabla de jugadores
CREATE TABLE jugadores (
    id_jugador INT AUTO_INCREMENT PRIMARY KEY,
    alias VARCHAR(50) NOT NULL,
    nombre VARCHAR(50) NOT NULL
);

-- Insertar datos en la tabla de jugadores
INSERT INTO jugadores (alias, nombre) VALUES
('Player1', 'Nombre1'),
('Player2', 'Nombre2'),
('Player3', 'Nombre3'),
('Player4', 'Nombre4'),
('Player5', 'Nombre5'),
('Player6', 'Nombre6'),
('Player7', 'Nombre7'),
('Player8', 'Nombre8'),
('Player9', 'Nombre9'),
('Player10', 'Nombre10');

-- Crear la tabla de sesiones
CREATE TABLE sesiones (
    id_sesion INT AUTO_INCREMENT PRIMARY KEY,
    id_juego INT,
    id_jugador INT,
    FOREIGN KEY (id_juego) REFERENCES juegos(id_juego),
    FOREIGN KEY (id_jugador) REFERENCES jugadores(id_jugador)
);

-- Insertar datos en la tabla de sesiones
INSERT INTO sesiones (id_juego, id_jugador) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);
