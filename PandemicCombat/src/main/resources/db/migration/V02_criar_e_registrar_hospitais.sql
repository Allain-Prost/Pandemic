CREATE TABLE IF NOT EXISTS hospital(
	id SERIAL PRIMARY KEY,
	nome_hospital varchar(255),
	cnpj varchar(255)
);

CREATE TABLE IF NOT EXISTS Endereco (
	id SERIAL PRIMARY KEY,
	logradouro varchar(255),
	bairro varchar(255),
	cidade varchar(255),
	numero int,
	complemento varchar(255),
	cep varchar(255),
	latitude varchar(255),
	longitudade varchar(255)
);

CREATE TABLE IF NOT EXISTS Recurso(
	id SERIAL PRIMARY KEY,
	percentual_ocupacao int,
	num_medicos int,
	num_enfermeiros int,
	num_respiradores int,
	num_tomografo int,
	num_ambulancia int,
	total_recurso int
);

ALTER TABLE hospital
ADD CONSTRAINT fk_endereco FOREIGN KEY (id) REFERENCES Endereco (id),
ADD CONSTRAINT fk_recurso FOREIGN KEY (id) REFERENCES Recurso (id)