package entities;

public class ContaCorrente extends Conta {
	private int contadorTalao;

	public ContaCorrente(int numero, String cpf) {
		super(numero, cpf);
		// TODO Auto-generated constructor stub
	}

	public int pediTalao() {

		this.debito(30); // TODO confirmar com o professor

		return this.contadorTalao + 1;
	}
	// TODO IMPLEMENTAR NO PROGRAMA LIMITE DE 3 CHEQUES

	public int getContadorTalao() {
		return contadorTalao;
	}

}
