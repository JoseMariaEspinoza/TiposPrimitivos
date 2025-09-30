create database if not exists peluqueria character set 'utf8mb4' collate 'utf8mb4_spanish_ci';

create table if not exists peluqueria.servicios(
	Codigo smallint,
	FechaHora date not null,
	TipoServicio varchar(20) default null,
	primary key (Codigo)
)engine innodb;

create table if not exists peluqueria.empleados(
	DNI varchar(9),
    Nombre varchar(50) not null,
    Especialidad varchar(60) default null,
    primary key (DNI)
)engine innodb;

create table if not exists peluqueria.clientes(
	DNI varchar(9),
    Nombre varchar(50) not null,
    Profesion varchar(40) default null,
    Telefono varchar(9) not null,
    Direccion varchar(60) default null,
    Tratamientos varchar(60) default null,
    primary key (DNI)
)engine innodb;

create table if not exists peluqueria.cosmeticos(
	Codigo smallint,
    Nombre varchar(50) not null,
    Precio double,
    primary key (Codigo)
)engine innodb;

create table if not exists peluqueria.citas(
	DNIEmpleado varchar(9),
    DNICliente varchar(9),
    CodigoServicio smallint,
    FechaHoraCita date not null,
    primary key (DNIEmpleado, DNICliente, CodigoServicio),
    constraint fk_ce foreign key (DNIEmpleado) references Empleados (DNI),
    constraint fk_cc foreign key (DNICliente) references Clientes (DNI),
    constraint fk_cs foreign key (CodigoServicio) references Servicios (Codigo)
)engine innodb;

create table if not exists peluqueria.ventas(
	DNIEmpleado varchar(9),
    DNICliente varchar(9),
    CodigoCosmetico smallint,
    Cantidad double not null,
    Comision double default null,
    primary key (DNIEmpleado, DNICliente, CodigoCosmetico),
    constraint fk_ce2 foreign key (DNIEmpleado) references Empleados (DNI),
    constraint fk_cc2 foreign key (DNICliente) references Clientes (DNI),
    constraint fk_cco foreign key (CodigoCosmetico) references Cosmeticos (Codigo)
)engine innodb;



