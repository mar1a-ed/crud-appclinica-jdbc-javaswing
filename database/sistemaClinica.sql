create database sistema_clinica;

use sistema_clinica;

create table paciente(
	cpf varchar(14) primary key,
    nome varchar(100),
    email varchar(100),
    telefone varchar(100),
    sexo varchar(1),
    data_nasc date
);

create table especialidade(
	id_especialidade int primary key auto_increment,
    nome varchar(100)
);

create table medico(
	crm int primary key,
    nome_medico varchar(100),
    especialidade_id int,
    preco_consulta decimal(10,2),
    foreign key (especialidade_id) references especialidade (id_especialidade)
);

create table agenda_consulta(
	id int primary key auto_increment,
    id_cpf varchar(14),
    id_crm int,
    status_consulta varchar(100),
    foreign key (id_cpf) references paciente (cpf),
    foreign key (id_crm) references medico (crm)
);

create table execucao_consulta(
	id int primary key auto_increment,
    id_ag int,
    diagnostico varchar(100),
    foreign key (id_ag) references agenda_consulta (id)
);

create table exame(
	id int primary key auto_increment,
    nome_exame varchar(100)
);
