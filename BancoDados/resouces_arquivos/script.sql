create database odonto_smile;

use odonto_smile;

create table funcinario(
idfuncionario int not null auto_increment primary key,
nomeFuncionario varchar(20),
funcao varchar(20),
salario float(4,2),
cpf int(11),
endereco varchar(40),
ataNascimento date,
email varchar(20),
senha varchar(23)

);

create table cliente(
idcliente int not null auto_increment primary key,
nomecliente varchar(20),
cpf int(11),
endereco varchar(40),
ataNascimento date,
email varchar(20),
senha varchar(23)

);

