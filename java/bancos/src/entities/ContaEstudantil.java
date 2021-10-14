package entities;

public class ContaEstudantil extends Conta{

	double limiteEstudantil;
	
	
	public ContaEstudantil(int numero, String cpf) {
		super(numero, cpf);
		this.limiteEstudantil = 5000.0;
	}


	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}


	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	
	public void usarEstudantil(double valor) {
		//TODO soma no saldo e tira do limite estudantil
		this.limiteEstudantil -= valor;
		this.saldo += valor;
		//TODO VERIFICAR RESTRIÇÕES SOBRE VALORES NEGATIVOS E LIMITE DO LIMITE ESTUDANTIL
	}
	

}
