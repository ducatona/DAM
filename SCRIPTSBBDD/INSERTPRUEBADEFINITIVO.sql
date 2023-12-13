-- Insertar datos en la tabla nacionalidad
INSERT INTO nacionalidad (nacionalidad) VALUES ('Española'),
('Mexicana'),
('Argentina'),
('Colombiana'),
('Chilena');
;

-- Insertar datos en la tabla perfil
INSERT INTO perfil (tipo_usuario) VALUES ('invitado'),
('usuario'),
('desarrollador'),
('administrador');

-- Insertar datos en la tabla pegui
INSERT INTO pegui (tipo_pegui) VALUES ('3'),
('7'),
('12'),
('16'),
('18'),
('18+');

-- Insertar datos en la tabla generos
INSERT INTO generos (nombre_genero, descripcion_genero) VALUES ('Aventura', 'Juegos de aventuras'),
('Estrategia', 'Juegos de estrategia'),
('Acción', 'Juegos de acción'),
('Rol', 'Juegos de rol'),
('Deportes', 'Juegos de deportes');

-- Insertar datos en la tabla usuarios
INSERT INTO usuarios (nombre, apellidos, fecha_nac, alias, password, email, id_nacionalidad, id_perfil)
VALUES ('Adrian', 'Pena', '2003-09-01', 'ducatona', '1234', 'adrianpcarnero@gmail.com', 1, 4);

-- Insertar datos en la tabla juegos
INSERT INTO juegos (id_juego, nombre_juego, descripcion, url, url_caratula, id_genero, nivel_dificultad, fecha_creacion, id_desarrollador, id_pegui, precio, descargas_acumuladas)
VALUES (1, 'EjemploJuego', 'Descripción del juego', 'http://ejemplo.com', 'http://ejemplo.com/caratula.jpg', 1, 'Fácil', '2023-01-01', 1, 1, 19.99, 0);

-- Insertar datos en la tabla biblioteca
INSERT INTO biblioteca (id_juego, id_usuario, fecha, url)
VALUES (1, 1, '2023-01-01', 'http://ejemplo.com/juego_en_biblioteca');
