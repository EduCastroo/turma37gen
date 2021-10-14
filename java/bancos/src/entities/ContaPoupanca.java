package entities;

public class ContaPoupanca extends Conta{

	int diaAniversarioPoupanca;
	
	public ContaPoupanca(int numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversario;
	}
	
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	
	public void correcao() {
		
		this.saldo += this.saldo * 0.05;
		
	}
	
	public boolean verificaAniversario(int dia) {
		boolean aniversario;
		
		if(this.diaAniversarioPoupanca == dia) {
			aniversario = true;
		} else {
			aniversario = false;
		}
		
		return aniversario;
	}	
		
	
	//TODO Comparar se a data informada pelo usuario é a mesma data do aniversário, 
	//     se for corrigir o valor em 0,05%  saldo = (saldo * 0.05)+saldo. 
	//TODO ANALISAR ONDE COLOCAR A COLETA DA DATA AO USUARIO
	//TODO VERIFICAR SE É A MESMA DATA DO ANIVERSARIO DA POUPANÇA, CASO SEJA, CORRIGIR O VALOR (CHAMA METODO correcao())
}
