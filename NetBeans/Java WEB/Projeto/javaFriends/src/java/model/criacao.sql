create database javaFriends;
use javaFriends;

create table jf_pessoa(
    pessoa_id integer not null auto_increment primary key,
    nome varchar(200),
    usuario varchar(50),
    senha varchar(200),
    idade integer
);

create table jf_amizade(
    convidante integer references jf_pessoa(pessoa_id),
    convidado integer references jf_pessoa(pessoa_id),
    primary key (convidante,convidado)
);
 create table jf_mensagem(
    mensagem_id integer primary key,
    remetente integer references jf_pessoa(pessoa_id),
    destinatario integer references jf_pessoa(pessoa_id),
    titulo varchar(200),
    conteudo text
 );