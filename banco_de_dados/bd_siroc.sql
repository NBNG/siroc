create table clientes (
	id_cliente serial primary key,
	cli_nome varchar (150),
	cli_insc_est varchar (20),
	cli_celular char (15),
	cli_telefone char (14),
	cli_endereco varchar (80),
	cli_bairro varchar (30),
	cli_cidade varchar (20),
	cli_estado char(3),
	cli_cep varchar (10),
	cli_contato varchar (40),
	cli_email varchar (50),
	cli_cgc varchar (20)
);

create table fornecedores (
	id_fornecedor serial primary key,
	for_nome varchar (150),
	for_telefone char (14),
	for_email varchar (60)
);

create table produtos (
	id_produto serial primary key,
	pro_nome varchar (50),
	pro_qnt smallint,
	pro_peso decimal (5,3),
	pro_valor_saida decimal (9,2),
	pro_valor_entrada decimal (9,2),
	id_fornecedor int,
	constraint fk_fornecedor foreign key (id_fornecedor) references fornecedores (id_fornecedor)
	on update cascade on delete restrict
);

create table pedidos (
	id_pedido serial primary key,
	ped_pagamento varchar (8),
	ped_data date,
	ped_valor_frete decimal (9,2),
	id_cliente int,
	constraint fk_cliente foreign key (id_cliente) references clientes (id_cliente)
	on update cascade on delete restrict
);

create table itens_pedidos(
	id_pedido int,
	id_produto int,
	ip_quantidade char(3),
	ip_preco_desconto decimal (9,2),
	constraint fk_pedido foreign key (id_pedido) references pedidos (id_pedido)
	on update cascade on delete restrict,
	constraint fk_produto foreign key (id_produto) references produtos (id_produto)
	on update cascade on delete restrict,
	primary key (id_pedido,id_produto)
);


