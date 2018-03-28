CREATE TABLE categoria(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (nome) values ('Lazer');
INSERT INTO categoria (nome) values ('Necessidades');
INSERT INTO categoria (nome) values ('Poupança');
INSERT INTO categoria (nome) values ('Instrução');
INSERT INTO categoria (nome) values ('Doação');
INSERT INTO categoria (nome) values ('Investimento');