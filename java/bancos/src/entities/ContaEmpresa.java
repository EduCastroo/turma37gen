package entities;

public class ContaEmpresa extends Conta{

	double emprestimoEmpresa;
	
	public ContaEmpresa(int numero, String cpf) {
		super(numero, cpf);
		this.emprestimoEmpresa = 10000.0;
		// TODO Auto-generated constructor stub
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public void pedirEmprestimo(double valor) {
		//TODO SOMA NO SALDO E TIRA DO EMPRESTIMO
		this.emprestimoEmpresa -= valor;
		this.saldo += valor; 
		//TODO VERIFICAR RESTRIÇÕES SOBRE VALORES NEGATIVOS E LIMITE DO EMPRÉSTIMO
	}
	
	
}
