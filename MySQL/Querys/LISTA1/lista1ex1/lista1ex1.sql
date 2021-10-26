SELECT * FROM funcionarios
WHERE salario > 2000;

SELECT * FROM funcionarios
WHERE salario < 2000;

SET SQL_SAFE_UPDATES = 0;

UPDATE funcionarios SET salario = 2000 WHERE nome = "Maria";

SELECT * FROM funcionarios;