CREATE DATABASE ecommerce;
CREATE TABLE tabelaprodutos (
codigo INT,
nome VARCHAR(255),
preco DECIMAL(6,2),
quantidade INT,
cor VARCHAR(255)
);
DROP TABLE tabelaprodutos;
USE ecommerce;
SELECT * FROM tabelaprodutos;
INSERT INTO tabelaprodutos
VALUES (1,"tenis", 199.99, 10, "preto"),
(2,"chinelo", 70.00, 5, "branco"),
(3,"mochila", 200, 10, "azul"),
(4,"bone", 99.00, 10, "verde"),
(5,"casaco", 700, 10, "amarelo"),
(6,"bermuda", 200, 10, "vermelho"),
(7,"oculos", 600, 10, "laranja"),
(8,"luva", 50, 10, "cinza");

SELECT * FROM tabelaprodutos;
select * from tabelaprodutos
where preco > 500;
select * from tabelaprodutos
where preco < 500;
UPDATE tabelaprodutos 
SET quantidade = 10 
WHERE codigo = 2;
SELECT nome, quantidade FROM tabelaprodutos
WHERE codigo = 2;
SELECT * FROM tabelaprodutos;
 
