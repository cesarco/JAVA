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
select count(*) as 'Cantidad' from usuarios;
delete from usuarios where id = 2;

select nombre, apellido 
from usuarios where id = 1;


delete from usuarios where id = 1;

update usuarios
set nombre = 'cesar luis',
apellido = 'rodriguez solera'
where id = 1;

select * from usuarios
where nombre like 'ce%';

CREATE TABLE publicaciones
(
id INT NOT NULL AUTO_INCREMENT,
autor_id INT NOT NULL,
titulo VARCHAR(150) NOT NULL,
texto TEXT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (autor_id) REFERENCES usuarios(id)

);
DROP TABLE publicaciones;