CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
ID INT NOT NULL AUTO_INCREMENT,
tipo VARCHAR(20),
tamanho VARCHAR(20),
PRIMARY KEY (ID)
);

CREATE TABLE tb_pizza(

ID INT NOT NULL AUTO_INCREMENT,
sabor VARCHAR(20),
preco DECIMAL(5,2),
borda VARCHAR(20),
fk_categoria INT,
PRIMARY KEY (ID),
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (ID)
);

INSERT INTO tb_categoria (tipo, tamanho)
VALUES
("Doce", "Pequena"),
("Doce", "Média"),
("Salgada", "Pequena"),
("Salgada", "Media"),
("Salgada", "Grande");

INSERT INTO tb_pizza (sabor, preco, borda, fk_categoria)
VALUES
("Brisadeiro", 30.00, "Sim", 2),
("Calabresa", 80.00, "Não", 5),
("Cartola", 50.00, "Sim", 1),
("Mussarela", 50.00, "Não", 4),
("Portuguesa", 80.00, "Não", 5),
("Charque", 40.00, "Sim", 3),
("Sardinha", 30.00, "Sim", 3),
("Peperoni", 90.00, "Não", 5);

SELECT * FROM tb_categoria;
SELECT * FROM tb_pizza;

SELECT * FROM tb_pizza
WHERE preco > 45;

SELECT * FROM tb_pizza
WHERE preco >= 29 AND preco <= 60;

SELECT * FROM tb_pizza where sabor LIKE 'C%';

SELECT * FROM tb_categoria AS tc
INNER JOIN tb_pizza AS tp
ON tc.ID = tp.fk_categoria;

SELECT * FROM tb_categoria AS tc
INNER JOIN tb_pizza AS tp
ON tc.ID = tp.fk_categoria
WHERE tp.tipo = "Doce";



SELECT * FROM tb_pizza WHERE fk_categoria = 1 OR fk_categoria = 2;