create database sistema_medico;

use sistema_medico;

create table paciente(
	cpf varchar(14) unique,
    nome varchar(100),
    email varchar(100),
    telefone varchar(100),
    sexo varchar(11),
    data_nasc date
);

create table especialidade(
	id_especialidade int primary key auto_increment,
    nome varchar(100),
    desc_especialidade varchar(200)
);

create table medico(
	crm int primary key,
    nome_medico varchar(100),
    preco_consulta decimal(10,2)
);

create table agenda_consulta(
	id int primary key auto_increment,
    id_cpf varchar(14),
    id_crm int,
    status_consulta varchar(100),
    data_consulta datetime
);

alter table agenda_consulta 
add constraint fk_agenda_paciente foreign key (id_cpf) references paciente(cpf) on delete cascade,
add constraint fk_agenda_medico foreign key (id_crm) references medico(crm) on delete cascade;

create table execucao_consulta(
	id int primary key auto_increment,
    id_ag int,
    diagnostico varchar(100)
);

alter table execucao_consulta add constraint fk_execucao_consulta foreign key (id_ag) references agenda_consulta (id) on delete cascade;

create table exame(
	id int primary key auto_increment,
    nome_exame varchar(100)
);

create table medico_especialidade(
	id_espMedico int primary key auto_increment,
    crm_medico int,
    especialidade_id int
);

alter table medico_especialidade add constraint fk_me_crm foreign key (crm_medico) references medico (crm) on delete cascade;
alter table medico_especialidade add constraint fk_me_esp foreign key (especialidade_id) references especialidade (id_especialidade) on delete cascade;

create table consulta_exame(
	execucao_id int,
    exame_id int,
    primary key (execucao_id, exame_id)
);

alter table consulta_exame
add constraint fk_ce_execucao foreign key (execucao_id) references execucao_consulta (id) on delete cascade,
add constraint fk_ce_exame foreign key (exame_id) references exame (id) on delete cascade;

insert into paciente (cpf, nome, email, telefone, sexo, data_nasc) values
('125.671.817-11', 'João Ricardo', 'joaoricardo@email.com', '99988-0990', 'm', '2001-09-11'),
('817.901.008-31', 'Pedro Francisco', 'pedrofran@email.com', '99881-1234', 'm', '1999-11-21'),
('154.347.986-21', 'Ana Irlanda', 'anairlanda@email.com', '99976-1900', 'f', '2001-01-29'),
('154.347.986-31', 'Maria Linda', 'marialinda@email.com', '99922-2183', 'f', '2005-11-29');

insert into especialidade (nome, desc_especialidade) values
('Anestesiologista', 'Aplica anestesia e cuida da dor no pré e pós-operatório.'),
('Cardiologista', 'Estuda e trata doenças do coração e sistema circulatório.'),
('Dermatologista', 'Cuida de doenças da pele, cabelos e unhas.'),
('Gastroenterologista', 'Trata doenças do aparelho digestivo.'),
('Ginecologista', 'Cuida da saúde da mulher e da gestação.'),
('Infectologista', 'Diagnostica e trata infecções (vírus, bactérias, fungos).'),
('Neurologista', 'Trata doenças do sistema nervoso clínico');

insert into exame (nome_exame) values
('Fezes'), ('Hemograma'), ('Glicemia'), ('Glicose'), ('Urina');

insert into medico (crm, nome_medico, preco_consulta) values
(123, 'Fernando Ferdinando', 290.99), (238, 'Catarina Catarinense', 310.87), (132, 'Shaolin Japonês', 780.99);

insert into medico_especialidade (crm_medico, especialidade_id) values
(123, 1), (123, 4), (238, 2), (132, 1), (132, 2), (132, 3);

insert into agenda_consulta (id_cpf, id_crm, status_consulta, data_consulta) values
('817.901.008-31', 132, 'Agendada', '2026-04-22 08:00'),
('154.347.986-21', 717, 'Agendada', '2026-03-16 09:00');

insert into execucao_consulta (id_ag, diagnostico) values
(3, 'Cancer no Esofago');

insert into consulta_exame (execucao_id, exame_id) values
(1, 1), (1, 2);
