package entities;

public class ContaEmpresa extends Conta{

	double emprestimoEmpresa;
	
	public ContaEmpresa(int numero, String cpf) {
		super(numero, cpf);
		// TODO Auto-generated constructor stub
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public void pedirEmprestimo() {
		//TODO SOMA NO SALDO E TIRA DO EMPRESTIMO
	}
	
	
}
