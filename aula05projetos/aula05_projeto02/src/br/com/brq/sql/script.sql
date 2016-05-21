drop table if exists produto;
drop table if exists estoque;

create table estoque(
	idestoque		integer			auto_increment,
	nome			varchar(50)		not null,
	descricao		varchar(100)	not null,
	primary key(idestoque));
	
create table produto(
	idproduto		integer			auto_increment,
	nome			varchar(50)		not null,
	preco			double			not null,
	quantidade		integer			not null,
	idestoque		integer			not null,
	primary key(idproduto),
	foreign key(idestoque) references estoque(idestoque));
	
insert into estoque(nome, descricao)
values('Informatica', 'Produtos de Informatica');
	
insert into estoque(nome, descricao)
values('Eletronicos', 'Produtos Eletronicos');

select * from estoque;

--------------------

insert into produto(nome, preco, quantidade, idestoque) values
('Mouse', 30.0, 10, 1),
('Monitor', 200, 15, 1),
('Computador', 1500.0, 10, 1),
('TV', 2000.0, 5, 2),
('Celular', 400.0, 6, 2),
('DVD', 200.0, 18, 2);

select * from produto;

-- consulta que retorne todos os produtos com preco de 10 a 1000
select * from produto 
where preco >= 10 and preco <= 1000;

select * from produto 
where preco between 10 and 1000;

-- consulta que retorne produtos pelo nome (like)
select * from produto
where nome like 'M%';

--ordenação..
select * from produto order by nome asc;
select * from produto order by nome desc;

--funções de calculo em banco de dados..
select sum(preco) as 'Somatorio de Preco' from produto;
select avg(preco) as 'Media de Preco' from produto;

select max(preco) as 'Maior Preco' from produto;
select min(preco) as 'Menor Preco' from produto;

select count(*) as 'Quantidade de Registros' from produto;

----------------------

--quais produtos tem o preco maior ou igual a media..
select * from produto
where preco >= (select avg(preco) from produto);

--mostrar os dados dos produtos com o seu estoque..
select
	p.idproduto,
	p.nome as nomeproduto,
	p.preco,
	p.quantidade,
	e.idestoque,
	e.nome as nomeestoque,
	e.descricao
from
produto p
inner join
estoque e
on
e.idestoque = p.idestoque;

-- somatorio de quantidade de produtos por estoque..
select
	e.idestoque,
	e.nome,
	e.descricao,
	sum(p.quantidade) as 'Qtd total de Produtos'
from produto p 
inner join estoque e
on e.idestoque = p.idestoque
group by
	idestoque, nome, descricao;

	
-- somatorio dos precos de produtos por estoque..
select
	e.idestoque,
	e.nome,
	e.descricao,
	sum(p.preco) as 'Somatorio de Preco'
from produto p
inner join estoque e
on e.idestoque = p.idestoque
group by
	idestoque, nome, descricao;
	

-- total de cada produto (preco * quantidade)
select
	p.idproduto,
	p.nome,
	p.preco,
	p.quantidade,
	(p.preco * p.quantidade) as total
from produto p;

--somatorio do total dos produtos por estoque..
select
	e.idestoque,
	e.nome,
	e.descricao,
	sum(p.preco * p.quantidade) as 'Somatorio Total'
from produto p
inner join estoque e
on e.idestoque = p.idestoque
group by
	idestoque, nome, descricao;

























