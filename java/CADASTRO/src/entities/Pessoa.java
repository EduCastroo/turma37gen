package entities;

public class Pessoa {
	
	//atributos // o que o objeto �, tem, estar
	public String nome;
	public int anoNasc;
	public boolean viva;
	public String email;
	public char pronome;
	
	//metodo
	public int calculaIdade() {
	return 2021 - anoNasc;
	}
	
}
