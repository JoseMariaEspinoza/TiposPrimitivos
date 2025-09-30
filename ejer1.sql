CREATE DATABASE if not exists reserva_aulas character set 'utf8mb4' collate 'utf8mb4_spanish_ci';
DROP TABLE clientes;
USE reserva_aulas;
CREATE TABLE if not exists clientes1(
	dni varchar(9) PRIMARY KEY,
    nombre varchar(50) NOT NULL,
    direccion varchar(60) DEFAULT 'desconocida'
);