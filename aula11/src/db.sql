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

INSERT INTO pedido VALUES (1001, '2010-06-15', 300.00, 102);

INSERT INTO pedido VALUES (1002, '2010-06-15', 300.00, 110); /* ERRO */


INSERT INTO PEDIDO VALUES (1002, '2010-06-15', NULL, 101);

INSERT INTO PEDIDO VALUES (1002, '2010-06-15', 1250.00, 101);

INSERT INTO PEDIDO VALUES
(1003, '2010-06-16', 200.00, 102),
(1004, '2010-06-16', 400.00, 101),
(1005, '2010-06-17', 320.00, 101),
(1006, '2010-06-17', 780.00, 102),
(1007, '2010-06-17', 150.00, 102),
(1008, '2010-06-17', 390.00, 101),
(1009, '2010-06-18', 650.00, 102),
(1010, '2010-06-18', 290.00, 101),
(1011, '2010-06-18', 100.00, 102),
(1012, '2010-06-19', 315.00, 101),
(1013, '2010-06-19', 738.00, 101),
(1014, '2010-06-20', 472.00, 102);

DELETE CLIENTE WHERE id = 101;

SELECT count(*) AS total FROM PEDIDO;

SELECT * FROM PEDIDO WHERE data > '2010-06-16';

SELECT max(valor) AS maior, avg(valor) AS media,
	min(valor) AS menor FROM PEDIDO;
	
SELECT * FROM CLIENTE, PEDIDO
	WHERE CLIENTE.id = PEDIDO.id_cliente;
	
SELECT * FROM CLIENTE, PEDIDO
	WHERE CLIENTE.id = PEDIDO.id_cliente AND id_cliente = 102; /*melhor fazer um JOIN*/
	
SELECT c.id, c.nome, p.data, p.valor FROM CLIENTE c, PEDIDO p
	WHERE c.id = p.id_cliente;
	
SELECT * FROM
	CLIENTE c INNER JOIN PEDIDO p ON c.id = p.id_cliente;
	
SELECT * FROM
	CLIENTE c LEFT JOIN PEDIDO p ON c.id = p.id_cliente;
	
SELECT * FROM
	CLIENTE c RIGHT JOIN PEDIDO p ON c.id = p.id_cliente;
	
SELECT * FROM
	PEDIDO p RIGHT JOIN CLIENTE c ON p.id_cliente = c.id;
	





	


