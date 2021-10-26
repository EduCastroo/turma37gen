CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
ID INT NOT NULL AUTO_INCREMENT,
nome_classe VARCHAR(15),
habilidade VARCHAR(15),
PRIMARY KEY (ID)
);

CREATE TABLE tb_personagem(
ID INT NOT NULL auto_increment,
nome VARCHAR(15),
ataque INT,
defesa INT,
forca INT,
fk_classe INT,
PRIMARY KEY (ID),
FOREIGN KEY (fk_classe) REFERENCES tb_classe(ID)
);

INSERT INTO tb_classe(nome_classe, habilidade)
VALUES 
("Mago", "Fogo"),
("Guerreiro", "Terra"),
("Arqueiro", "Vento"),
("Paladino", "Agua"),
("Necromante", "Odio");

INSERT INTO tb_personagem(nome, ataque, defesa, forca)
VALUES
("Eduardo", 3000, 1500, 900),
("Pedro", 3000, 2000, 1000),
("Joao", 1000, 2000, 500),
("Maria", 2000, 1200, 700),
("Severino", 1500, 1600, 800),
("Raimundo", 2000, 1500, 1000),
("Josefa", 1000, 1000, 500),
("Sebastiao", 3000, 800, 400);

SELECT * FROM tb_classe;
SELECT * FROM tb_personagem;
DROP TABLE tb_personagem;
SELECT * FROM tb_personagem;
update tb_personagem set fk_classe = 1 where ID = 1;

SELECT * FROM tb_personagem
WHERE ataque > 2000;

SELECT * FROM tb_personagem
WHERE defesa > 1000 AND defesa < 2000;

UPDATE tb_personagem set nome = "Carla" WHERE ID = 4;

SELECT * FROM tb_personagem where nome LIKE 'C%';

SELECT * FROM tb_classe
INNER JOIN tb_personagem
ON tb_classe.ID = tb_personagem.fk_classe;

SELECT * FROM tb_classe
WHERE ID = 2;