package entities;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(int numero, String cpf) {
		super(numero, cpf);
		// TODO SOMAR O SALDO COM O LIMITE NO CONSTRUTOR? ACHO QUE NAO
		this.limite = 1000.0;
		// TODO Auto-generated constructor stub

	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void usarLimite(double valor) {
		// TODO IMPLEMENTAR RESTRIÇÕES
		this.saldo += valor;
		this.limite -= valor;
	}

	@Override
	public void debito(double valor) {
		this.saldo -= valor;

	}
	
	public boolean validaTransacao(double valor) {
		boolean temSaldo;
		if ((this.saldo + this.limite) > valor) {
			temSaldo = true;
		} else {
			temSaldo = false;
		}
		
		return temSaldo;
	}

	public double imprimeTotalConta() {
		System.out.println("Saldo total em conta: " + (this.getLimite() + this.getSaldo()));
		return this.getLimite() + this.getSaldo();

	}

	public void imprimeSaldos() {
		System.out.println("Saldo em conta: " + this.getSaldo() + "\nCheque Especial: " + this.getLimite());
	}

}
