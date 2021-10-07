package app;

import entities.Pessoa;

public class CadAmigo {

	public static void main(String[] args) {
		
		//variaveis
		Pessoa p1 = new Pessoa();
		
		p1.nome = "EPAMINONDAS";
		p1.email = "epa@gmail.com";
		p1.pronome = 'o';
		p1.anoNasc = 1970;
		
		System.out.println(p1.nome);
		System.out.println(p1.nome+" sua idade é "+p1.calculaIdade());
	}

}
