drop database if exists aula04;
create database aula04;
use aula04;

create table cliente(
	idcliente		integer			auto_increment,
	nome			varchar(50)		not null,
	email			varchar(50)		not null unique,
	primary key(idcliente));
	
desc cliente;

insert into cliente(nome, email) values('Ana', 'ana@gmail.com');
insert into cliente(nome, email) values('Rui', 'rui@gmail.com');
insert into cliente(nome, email) values('Leo', 'leo@gmail.com');
insert into cliente(nome, email) values('Max', 'max@gmail.com');
insert into cliente(nome, email) values('Bia', 'bia@gmail.com');

select * from cliente;