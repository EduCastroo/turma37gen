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