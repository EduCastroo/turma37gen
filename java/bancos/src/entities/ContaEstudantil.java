package entities;

public class ContaEstudantil extends Conta{

	double limiteEstudantil;
	
	
	public ContaEstudantil(int numero, String cpf) {
		super(numero, cpf);
		// TODO Auto-generated constructor stub
	}


	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}


	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	
	public void usarEstudantil() {
		//TODO soma no saldo e tira do limite estudantil
	}
	

}
