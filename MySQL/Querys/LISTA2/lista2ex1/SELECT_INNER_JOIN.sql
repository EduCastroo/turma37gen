SELECT * FROM tb_classe
INNER JOIN tb_personagem
ON tb_classe.ID = tb_personagem.fk_classe;