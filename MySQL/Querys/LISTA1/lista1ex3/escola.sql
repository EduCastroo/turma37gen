CREATE DATABASE escola;
USE escola;
CREATE TABLE estudantes(
    matricula INT,
    nome VARCHAR(20),
    sexo VARCHAR(20),
    nota INT,
    idade INT
);
INSERT INTO estudantes
VALUES (1, "Eduardo", "masculino", 7, 30),
(2, "Pedro","masculino", 10, 32),
(3, "João", "masculino", 8, 25),
(4, "Maria", "feminino", 4, 33),
(5, "Josefa", "feminino", 9, 24),
(6, "Biu", "masculino", 3, 13),
(7, "Geraldo", "masculino", 6, 19),
(8, "Natalia", "feminino", 1, 17);
SELECT * FROM estudantes;
SELECT * FROM estudantes
WHERE nota > 7;
SELECT * FROM estudantes
WHERE nota < 7;
UPDATE estudantes
SET nota = 9
WHERE matricula = 8;
SELECT * FROM estudantes;