-- --------------------- --
-- ----- Cazadores ----- --
-- ----- de libros ----- --
-- --------------------- --

CREATE DATABASE librosdb;
USE librosdb;

-- Tabla Roles -- 
CREATE TABLE roles (
id_rol INT AUTO_INCREMENT PRIMARY KEY,
nombre_rol ENUM('ROL_CLIENTE' , 'ROL_ADMINISTRADOR') NOT NULL
);

-- Tabla Usuarios --
CREATE TABLE usuarios (
id_usuario INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
apellidos VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL UNIQUE,
contraseña VARCHAR(100) NOT NULL,
ENABLED INT NOT NULL DEFAULT 1
);

-- Tabla Libros --
CREATE TABLE libros (
id_libro INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(150) NOT NULL UNIQUE,
autor VARCHAR(100) NOT NULL,
categoria VARCHAR(100) NOT NULL,
editorial VARCHAR(100) NOT NULL,
fecha_lanzamiento DATE NOT NULL,
descripcion VARCHAR(250) NOT NULL,
precio DECIMAL(2,2) NOT NULL
);

-- Tabla Tarjetas --
CREATE TABLE tarjetas (
id_tarjetas INT AUTO_INCREMENT PRIMARY KEY,
nombre_titular VARCHAR(100) NOT NULL,
numeracion VARCHAR(16) NOT NULL UNIQUE,
caducidad DATE NOT NULL,
cvv INT NOT NULL
);

-- Tabla Descargas --
CREATE TABLE descargas (
id_descarga INT AUTO_INCREMENT PRIMARY KEY,
fecha DATETIME, 
estado ENUM('Favoritos', 'Tramitados') NOT NULL,
id_usuario INT NOT NULL,
id_tarjeta INT,
CHECK (estado IN ('Favoritos', 'Tramitados')),
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
FOREIGN KEY (id_tarjeta) REFERENCES tarjetas(id_tarjeta)
);

-- Tabla intermedia usuarios_tarjetas --
CREATE TABLE usuarios_tarjetas (
id_usuario INT,
id_tarjeta INT,
PRIMARY KEY (id_usuario, id_tarjeta),
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
FOREIGN KEY (id_tarjeta) REFERENCES tarjetas(id_tarjeta)
);

-- Tabla intermedia usuarios_roles --
CREATE TABLE usuarios_roles (
id_usuario INT,
id_rol INT,
PRIMARY KEY (id_usuario, id_rol),
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
FOREIGN KEY (id_rol) REFERENCES roles(id_rol)
);

-- Tabla intermedia libros_descarga --
CREATE TABLE libros_descarga (
id_libro INT,
id_descarga INT,
precio FLOAT,
PRIMARY KEY (id_libro, id_descarga),
FOREIGN KEY (id_libro) REFERENCES libros(id_libro),
FOREIGN KEY (id_descarga) REFERENCES descargas(id_descarga)
);

-- ------------------- --
-- ----- INSERTS ----- --
-- ------------------- --

-- Tablas Roles --

INSERT INTO Roles (nombre_rol)
VALUES
('ROLE_CLIENTE'),
('ROLE_ADMINISTRADOR');

-- Tablas Usuarios --

INSERT INTO usuarios (nombre, apellidos, email, contraseña)
VALUES
("Isaac", "Calderon Lopez", "isaac@gmail.com", "clave000"),
("Marcos", "Sanda Fernandez", "marcos@gmail.com", "clave111"),
("Juan", "Perez Lopez", "juan@gmail.com", "clave222"),
("María", "Garcia Ferran", "maria@gmail.com", "clave333"),
("Jose", "Hernandez Martin", "jose@gmail.com", "clave444");

-- Tablas Libros --

INSERT INTO libros (nombre, autor, categoria, editorial, fecha_lanzamiento, descripcion, precio)
VALUES
('El gran Gatsby', 'F. Scott Fitzgerald', 'Novela', 'Scribner', '1925-04-10', 'La historia sigue al millonario Jay Gatsby y su obsesión por la joven Daisy Buchanan.', 15.99),
('1984', 'George Orwell', 'Ciencia Ficción', 'Secker & Warburg', '1949-06-08', 'Una novela distópica que describe una sociedad totalitaria y vigilante.', 12.99),
('Harry Potter y la piedra filosofal', 'J.K. Rowling', 'Fantasía', 'Bloomsbury Publishing', '1997-06-26', 'La primera novela de la serie de Harry Potter, sobre un joven mago que descubre su identidad y sus habilidades.', 10.99),
('El código Da Vinci', 'Dan Brown', 'Suspense', 'Doubleday', '2003-03-18', 'Un thriller de misterio que sigue al simbologista Robert Langdon mientras resuelve un asesinato en el Museo del Louvre.', 14.99),
('El principito', 'Antoine de Saint-Exupéry', 'Infantil', 'Reynal & Hitchcock', '1943-04-06', 'Un cuento filosófico y poético sobre la amistad y la exploración de la naturaleza humana.', 8.99),
('El Hobbit', 'J.R.R. Tolkien', 'Aventura', 'George Allen & Unwin', '1937-09-21', 'Un clásico de la literatura de fantasía sobre un hobbit llamado Bilbo Bolsón que se une a un grupo de enanos en una búsqueda para recuperar un tesoro.', 13.99),
('La Metamorfosis', 'Franz Kafka', 'Ficción Absurda', 'Kurt Wolff Verlag', '1915-10-15', 'La historia de un hombre llamado Gregorio Samsa que se despierta una mañana convertido en un insecto.', 7.99),
('El lobo estepario', 'Hermann Hesse', 'Ficción Existencial', 'S. Fischer Verlag', '1927-08-25', 'La historia de un hombre solitario llamado Harry Haller, que se siente alienado de la sociedad y lucha por encontrar su lugar en el mundo.', 11.99),
('Mujercitas', 'Louisa May Alcott', 'Clásico', 'Roberts Brothers', '1868-09-30', 'La historia de cuatro hermanas adolescentes que crecen juntas y luchan contra la pobreza y la tragedia en la Nueva Inglaterra de mediados del siglo XIX.', 9.99);

-- Tablas Tarjetas --

INSERT INTO tarjetas (nombre_titular, numeracion, caducidad, cvv)
VALUES
("Isaac Calderon Lopez", '4280005032451532', '360'),
("Marcos Sanda Fernandez", '3210018245560008', '174'),
('Juan Perez Lopez', '1234567812345678', '2023-04-30', '123'),
('Maria Garcia Ferran', '2345678923456789', '2024-06-30', '456'),
('Jose Hernandez Martin', '3456789034567890', '2025-02-28', '789');

-- Tablas Descarga --

INSERT INTO descargas (fecha, estado, id_usuario, id_tarjeta)
VALUES
('2022-12-20 13:45:00', 'Favoritos' , 1, 1),
('2023-03-30 22:30:00', 'Favoritos', 2, 2),
('2023-01-02 10:10:00', 'Tramitados', 3, 3);

-- Tablas usuarios_tarjetas --

INSERT INTO usuarios_tarjetas (id_usuario, id_tarjeta)
VALUES
('1', '1'),
('1', '2'),
('2', '1'),
('2', '2'),
('3', '3'),
('4', '4'),
('5', '5');

-- Tablas usuarios_roles --

INSERT INTO usuarios_roles (id_usuario, id_rol)
VALUES
('1','2'),
('2','2'),
('3','1'),
('4','1'),
('5','1');

-- Tablas libros_descarga --

INSERT INTO libros_descarga (id_libro, id_descarga, precio)
VALUES
('3', '1', 10.99),
('6', '2', 13.99),
('2', '3', 12.99);

-- ------------------------ --
-- ----- USUARIO BBDD ----- --
-- ------------------------ --

CREATE USER 'ulibros' IDENTIFIED BY 'ulibros';
GRANT ALL PRIVILEGES ON librosdb.* TO 'ulibros';
