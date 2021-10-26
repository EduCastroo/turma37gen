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