-- Añadir datos
use indigames;
-- Insertar datos en la tabla nacionalidad
INSERT INTO nacionalidad (nacionalidad) VALUES 
('Española'),
('Mexicana'),
('Argentina'),
('Colombiana'),
('Chilena');

-- Insertar datos en la tabla perfil
INSERT INTO perfil (tipo_usuario) VALUES 
('invitado'),
('usuario'),
('desarrollador'),
('administrador');

-- Insertar datos en la tabla pegui
INSERT INTO pegui (tipo_pegui) VALUES 
('3'),
('7'),
('12'),
('16'),
('18'),
('18+');

-- Insertar datos en la tabla generos
INSERT INTO generos (nombre_genero, descripcion_genero) VALUES 
('Aventura', 'Juegos de aventuras'),
('Estrategia', 'Juegos de estrategia'),
('Acción', 'Juegos de acción'),
('Rol', 'Juegos de rol'),
('Deportes', 'Juegos de deportes');

-- Insertar datos en la tabla usuarios
INSERT INTO usuarios (nombre, apellidos, fecha_nac, alias, password, email, id_nacionalidad, id_perfil, id_biblioteca) VALUES 
('Adrian', 'Pena', '2003-09-01', 'ducatona', '1234', 'adrianpcarnero@gmail.com', 1, 4, 1);

-- Insertar datos en la tabla biblioteca
INSERT INTO biblioteca (id_usuario, fecha, url) VALUES 
(1, '2023-01-01', 'http://example.com/library1');

-- Insertar datos en la tabla juegos
INSERT INTO juegos (id_juego, nombre_juego, descripcion, url, url_caratula, id_genero, nivel_dificultad, fecha_creacion, id_desarrollador, id_pegui, precio, descargas_acumuladas) VALUES 
(1, 'Super Aventura', 'Un emocionante juego de aventuras', 'http://example.com/game1', 'http://example.com/cover1', 1, 
'Medio', '2023-01-01',1, 3, 29.99, 100);

-- Insertar datos en la tabla descargas
INSERT INTO descargas (id_biblioteca, id_juegos, fecha) VALUES 
(1, 1, '2023-02-01');

