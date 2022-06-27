CREATE DATABASE Cinemar CHARACTER SET utf8mb3;
USE cinemar;

CREATE TABLE TipoPelicula(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    formato VARCHAR(3),
    idioma VARCHAR(12),
    subtitulada BOOLEAN
);

CREATE TABLE Clasificacion(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    identificador VARCHAR(3),
    recomendacion VARCHAR(30),
    descipcion VARCHAR(1024)
);
CREATE TABLE Pelicula(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(196),
    sinopsis VARCHAR(1024),
    duracion INT NOT NULL,
    id_clasificacion INT NOT NULL,
    id_tipo INT NOT NULL,
    CONSTRAINT clasificacion_fk
    FOREIGN KEY Pelicula(id_clasificacion)
    REFERENCES Clasificacion(id),
    CONSTRAINT tipo_fk
    FOREIGN KEY Pelicula(id_tipo)
    REFERENCES TipoPelicula(id)
);
CREATE TABLE Reparto(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30),
    apellido VARCHAR(30)
);
CREATE TABLE PeliculaXReparto(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_pelicula INT NOT NULL,
    id_reparto INT NOT NULL,
    rol VARCHAR(20),
    personaje VARCHAR(20),
    CONSTRAINT pelicula_fk
    FOREIGN KEY PeliculaXReparto(id_pelicula)
    REFERENCES Pelicula(id),
    CONSTRAINT reparto_fk
    FOREIGN KEY PeliculaXReparto(id_reparto)
    REFERENCES Reparto(id)
);
CREATE TABLE Genero(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(15)
);
CREATE TABLE PeliculaXGenero(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_pelicula INT NOT NULL,
    id_genero INT NOT NULL,
    CONSTRAINT pelicula_pxg_fk
    FOREIGN KEY PeliculaXGenero(id_pelicula)
    REFERENCES Pelicula(id),
    CONSTRAINT genero_pxg_fk
    FOREIGN KEY PeliculaXGenero(id_genero)
    REFERENCES Genero(id)
);
CREATE TABLE Sala(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    numero INT NOT NULL UNIQUE,
    formato VARCHAR(3),
    capacidad INT UNSIGNED NOT NULL
);
CREATE TABLE Sesion(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fecha TIMESTAMP,
    id_sala INT NOT NULL,
    id_pelicula INT NOT NULL,
    CONSTRAINT sala_sesion_fk
    FOREIGN KEY Sesion(id_sala)
    REFERENCES Sala(id),
    CONSTRAINT pelicula_sesion_fk
    FOREIGN KEY Sesion(id_pelicula)
    REFERENCES Pelicula(id)
);
CREATE TABLE Butaca(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fila VARCHAR(1),
    numero TINYINT(2),
    reservada BOOLEAN,
    id_sala INT NOT NULL,
    CONSTRAINT sala_butaca_fk
    FOREIGN KEY Butaca(id_sala)
    REFERENCES Sala(id)
);
CREATE TABLE Usuario(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30),
    apellido VARCHAR(30),
    email VARCHAR(30),
    dni INT(8) UNSIGNED NOT NULL,
    fecha_nac DATE,
    contrasenia VARCHAR(16)
);
CREATE TABLE Descuento(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    porcentaje FLOAT,
    dia VARCHAR(9)
);
CREATE TABLE TarjetaCredito(
	numero BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    banco VARCHAR(20),
    titular VARCHAR(60),
    fecha_caducidad DATE,
    id_usuario INT NOT NULL,
    CONSTRAINT usuario_tc_fk
    FOREIGN KEY TarjetaCredito(id_usuario)
    REFERENCES Usuario(id)
);
CREATE TABLE Reserva(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    precio FLOAT,
    fecha_compra TIMESTAMP,
    id_sesion INT NOT NULL,
    id_butaca INT NOT NULL,
    id_usuario INT NOT NULL,
    id_tc BIGINT UNSIGNED NOT NULL,
    id_descuento INT NOT NULL,
    CONSTRAINT sesion_reserva_fk
    FOREIGN KEY Reserva(id_sesion)
    REFERENCES Sesion(id),
    CONSTRAINT butaca_reserva_fk
    FOREIGN KEY Reserva(id_butaca)
    REFERENCES Butaca(id),
    CONSTRAINT usuario_reserva_fk
    FOREIGN KEY Reserva(id_usuario)
    REFERENCES Usuario(id),
    CONSTRAINT tc_reserva_fk
    FOREIGN KEY Reserva(id_tc)
    REFERENCES TarjetaCredito(numero),
    CONSTRAINT descuento_reserva_fk
    FOREIGN KEY Reserva(id_descuento)
    REFERENCES Descuento(id)
);
