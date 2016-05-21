drop database if exists aula06;
create database aula06;
use aula06;

create table mensagem(
	idmensagem 		integer			auto_increment,
	emaildest		varchar(50)		not null,
	assunto			varchar(50)		not null,
	conteudo		varchar(255)	not null,
	dataenvio		timestamp		not null,
	primary key(idmensagem));
	
desc mensagem;



