drop database if exists aula07;
create database aula07;
use aula07;

create table aluno(
	idaluno			integer			auto_increment,
	nome			varchar(50)		not null,
	email			varchar(50)		not null unique,
	primary key(idaluno));
	
create table turma(
	idturma			integer			auto_increment,
	nome			varchar(50)		not null,
	periodo			enum('Manha', 'Tarde', 'Noite') not null,
	primary key(idturma));
	
desc aluno;
desc turma;

create table turma_aluno(
	idturma			integer			not null,
	idaluno			integer			not null,
	primary key(idturma, idaluno),
	foreign key(idturma) references turma(idturma),
	foreign key(idaluno) references aluno(idaluno));
	
desc turma_aluno;

insert into aluno(nome, email) values('Diego', 'diego@gmail.com');
insert into aluno(nome, email) values('Ingrid', 'ingrid@gmail.com');
select * from aluno;

insert into turma(nome, periodo) values('Java', 'Manha');
insert into turma(nome, periodo) values('C#', 'Tarde');
insert into turma(nome, periodo) values('Oracle', 'Noite');
insert into turma(nome, periodo) values('PHP', 'Manha');
select * from turma;

insert into turma_aluno(idturma, idaluno) values(1, 1);
insert into turma_aluno(idturma, idaluno) values(1, 2);
insert into turma_aluno(idturma, idaluno) values(2, 2);
insert into turma_aluno(idturma, idaluno) values(2, 1);
insert into turma_aluno(idturma, idaluno) values(3, 1);
insert into turma_aluno(idturma, idaluno) values(4, 2);
select * from turma_aluno;

--consulta de turmas com alunos
--select de turma junção com turma_aluno e junção com aluno
--exibe os dados de turmas e alunos (muitos para muitos)
select
	t.idturma,
	t.nome as nometurma,
	t.periodo,
	a.idaluno,
	a.nome as nomealuno,
	a.email
from turma as t
inner join turma_aluno as ta
on t.idturma = ta.idturma
inner join aluno as a
on a.idaluno = ta.idaluno
order by idturma;

--view (visão)
create view vw_turmasalunos
as
select
	t.idturma,
	t.nome as nometurma,
	t.periodo,
	a.idaluno,
	a.nome as nomealuno,
	a.email
from turma as t
inner join turma_aluno as ta
on t.idturma = ta.idturma
inner join aluno as a
on a.idaluno = ta.idaluno
order by idturma;

--consultar os dados da view..
select * from vw_turmasalunos;

--consulta para trazer a quantidade de alunos por turma..
select 
	t.idturma,
	t.nome as nometurma,
	t.periodo,
	count(ta.idaluno) as qtd_alunos
from turma as t
left join turma_aluno as ta
on t.idturma = ta.idturma
group by idturma, nometurma, periodo;


--criando uma view para a consulta acima..
create view vw_turmaqtdalunos
as
select 
	t.idturma,
	t.nome as nometurma,
	t.periodo,
	count(ta.idaluno) as qtd_alunos
from turma as t
left join turma_aluno as ta
on t.idturma = ta.idturma
group by idturma, nometurma, periodo;

desc vw_turmaqtdalunos;

select * from vw_turmaqtdalunos;


--criando uma view para obter alunos e quantidade de turmas
create view vw_alunoqtdturmas
as
select 
	a.idaluno,
	a.nome as nomealuno,
	a.email,
	count(ta.idturma) as qtd_turmas
from aluno as a
left join turma_aluno as ta
on a.idaluno = ta.idaluno
group by idaluno, nome, email;

desc vw_alunoqtdturmas;

select * from vw_alunoqtdturmas;











