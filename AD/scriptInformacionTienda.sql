
use tienda;

-- Insertar datos en la tabla 'cliente'
INSERT INTO cliente (nombre, password) VALUES
('Juan', 'contraseña123'),
('María', 'contraseñasegura'),
('Carlos', 'qwerty'),
('Ana', 'clave123'),
('Pedro', 'contraseñaFuerte');

-- Insertar datos en la tabla 'categoria'
INSERT INTO categoria (nombre) VALUES
('Electrónica'),
('Ropa'),
('Hogar'),
('Deportes'),
('Libros');

-- Insertar datos en la tabla 'producto'
INSERT INTO producto (nombre, fkcategoria, pvp, stock) VALUES
('Smartphone', 1, 499.99, 50),
('Camiseta', 2, 19.99, 100),
('Aspiradora', 3, 129.99, 30),
('Balón de fútbol', 4, 24.99, 50),
('Libro de ciencia ficción', 5, 15.99, 20);

-- Insertar datos en la tabla 'carrito'
INSERT INTO carrito (fkcliente, fecha) VALUES
(1, '2023-11-22'),
(2, '2023-11-22'),
(3, '2023-11-22'),
(4, '2023-11-22'),
(5, '2023-11-22');

-- Insertar datos en la tabla 'lineacarrito'
INSERT INTO lineacarrito (fkcarrito, fkproducto, unidades) VALUES
(1, 1, 2),
(1, 3, 1),
(2, 2, 3),
(3, 4, 2),
(4, 5, 1);


-- Crear el usuario administrador de la base de datos
CREATE USER 'admintienda'@'localhost' IDENTIFIED BY 'Tienda-123';

-- Otorgar todos los privilegios al usuario en la base de datos 'tienda'
GRANT ALL PRIVILEGES ON tienda.* TO 'admintienda'@'localhost';

-- Actualizar los privilegios
FLUSH PRIVILEGES;
