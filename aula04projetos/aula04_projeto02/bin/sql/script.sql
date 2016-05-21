drop database if exists aula04b;
create database aula04b;
use aula04b;

create table funcionario(
	idfuncionario		integer			auto_increment,
	nome				varchar(50)		not null,
	salario				double			not null,
	dataadmissao		date			not null,
	primary key(idfuncionario));
	
create table endereco(
	idendereco			integer			auto_increment,
	logradouro			varchar(100)	not null,
	cidade				varchar(50)		not null,
	estado				varchar(50)		not null,
	cep					varchar(15)		not null,
	idfuncionario		integer			not null unique,
	primary key(idendereco),
	foreign key(idfuncionario) references funcionario(idfuncionario));
	

insert into funcionario(nome, salario, dataadmissao)
values('Ana Paula', 2000, '2016-05-16');

insert into funcionario(nome, salario, dataadmissao)
values('Joao Pedro', 3000, '2016-05-13');

select * from funcionario;
	

insert into endereco(logradouro, cidade, estado, cep, idfuncionario)
values('Rua A, Centro', 'Sao Paulo', 'SP', '25000-000', 1);

insert into endereco(logradouro, cidade, estado, cep, idfuncionario)
values('Rua B, Centro', 'Rio de Janeiro', 'RJ', '26000-000', 2);
	
select * from endereco;
	

select 
	f.idfuncionario,
	f.nome,
	f.salario,
	f.dataadmissao,
	e.idendereco,
	e.logradouro,
	e.cidade,
	e.estado,
	e.cep
from funcionario f
inner join endereco e
on f.idfuncionario = e.idfuncionario\G
















	
	
	
	
	