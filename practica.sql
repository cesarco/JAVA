use curso;
CREATE TABLE usuarios(
id int NOT NULL auto_increment,
nombre varchar(80),
apellido varchar(80),
fecha_naciemiento datetime,
primary key (id)
);

alter table usuarios add column telefono varchar(45) null;

alter table usuarios modify column telefono varchar(30) null;

INSERT INTO usuarios(nombre,apellido,fecha_naciemiento, telefono)
values('Cesar','rodriguez',2001-12-20, 3024198990);

select * from usuarios;

delete from usuarios where id = 1;