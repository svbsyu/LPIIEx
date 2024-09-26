create database BD1_Romero;
use BD1_Romero;

create table tb_categoria(
id_cate int auto_increment primary key,
descripcion varchar(100),
fre_comp varchar(30)
);

create table tb_productos(
id_prod int auto_increment primary key,
nom_prod varchar(100),
id_cate int,
stock int,
foreign key (id_cate) references tb_categoria (id_cate)
);

create table tb_inventario(
nro_inv int auto_increment primary key,
fecha date,
id_prod int,
cost_in double,
foreign key (id_prod) references tb_productos (id_prod)
);

insert into tb_categoria (descripcion,fre_comp) values 
('Pastillas', "Diario"),('Jarabes',"Interdiario"),('Jeringas', "Semanal");
insert into tb_productos (nom_prod, id_cate, stock)
values
("Paracetamol",1, 200),
("Jarabe Tos",2, 150),
("Iyeccion",3, 100);
insert into tb_inventario (fecha, id_prod, cost_in) values
(current_timestamp(),1,0.50),
(current_timestamp(),2,3.00),
(current_timestamp(),3,5.50);

use sys;
drop database BD1_Romero;