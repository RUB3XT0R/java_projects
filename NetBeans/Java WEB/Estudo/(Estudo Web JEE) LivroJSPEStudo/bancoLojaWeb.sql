create database bancoLojaWeb;

create table PRODUTOS(
    codigo integer not null auto_increment,
    descricao varchar(50) not null,
    preco float not null,
    primary key (codigo)
);