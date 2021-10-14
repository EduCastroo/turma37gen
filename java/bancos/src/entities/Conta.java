package entities;

public abstract class Conta {
	private int numero;
	private String cpf;
	protected double saldo; // TODO alterado o saldo o mesmo não pode ser ajustado por setter. 
	private boolean ativo;
	
	public Conta(int numero, String cpf){
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void credito(double valor) {
		this.saldo += valor;
		// TODO implementar regras de para deposito
	}
	
	
	
	
	public void debito(double valor) {
		if (this.saldo >= valor) {
		this.saldo -= valor;
			// TODO implementar regras de para saque
		}
	}
	
	// VERIFICA SE O VALOR DIGITADO FOI NEGATIVO
	public boolean valorNegativo(double valor) {
		boolean negativo;
		if (valor < 0) {
			negativo = true;
		} else {
			negativo = false;
		}
		return negativo;
	}
	

	public boolean isAtivo() {
		return ativo;
	}

	public void ativarConta(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void mostraTela() {
		System.out.println("NOME DO BANCO");
		System.out.println("SLOGAN\n\n");
		System.out.println("CONTA POUPANÇA");
		System.out.println("\n\nSaldo Atual: R$ " + this.getSaldo());	
	}
	
	
	
}
