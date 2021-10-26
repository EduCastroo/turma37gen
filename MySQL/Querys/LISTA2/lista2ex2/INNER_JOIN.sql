SELECT * FROM tb_categoria AS tc
INNER JOIN tb_pizza AS tp
ON tc.ID = tp.fk_categoria;