SHOW DATABASES;

CREATE DATABASE tutorial;

USE tutorial;

CREATE TABLE CLIENTE
(
	id SMALLINT UNSIGNED NOT NULL, /* NOT NULL dispensavel por ser uma PK */
	nome VARCHAR(60) NOT NULL,
	fone CHAR(10),
	PRIMARY KEY (id)
) ENGINE = InnoDB;


DESCRIBE CLIENTE;

CREATE TABLE PEDIDO
(
	id SMALLINT UNSIGNED NOT NULL,
	data DATE NOT NULL,
	valor NUMERIC (10, 2) NOT NULL,
	id_cliente SMALLINT UNSIGNED NOT NULL,
	PRIMARY KEY (id)
) ENGINE = InnoDB;

ALTER TABLE PEDIDO 
	ADD FOREIGN KEY (id_cliente) REFERENCES CLIENTE (id) 
	ON DELETE RESTRICT ON UPDATE RESTRICT;

DESCRIBE PEDIDO;

INSERT INTO cliente VALUES (101, 'Zé das Couves', '1127991999');

INSERT INTO CLIENTE VALUES
	(102, 'Maria das Couves', NULL),
	(103, 'Antonio das Couves', '1127991999'),
	(104, 'Ana das Couves', '1121213434');
	
SELECT * FROM cliente;

SELECT * FROM cliente ORDER BY nome;

SELECT * FROM cliente ORDER BY 1;

SELECT 2 + 4;

SELECT 2 + 4 AS Soma;

SELECT id, nome FROM cliente WHERE fone IS NOT NULL;

SELECT * FROM cliente WHERE nome LIKE 'A%';

SELECT * FROM cliente WHERE nome LIKE '%Couves';

SELECT * FROM cliente WHERE nome LIKE '%Couves%';

UPDATE cliente SET fone = '1121212121' WHERE id = 102;

SELECT * FROM cliente WHERE id = 102;

DELETE FROM cliente WHERE id = 104;

SELECT * FROM cliente;