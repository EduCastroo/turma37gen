package application;
import entities.Carro;
public class testeCarro {

	public static void main(String[] args) {
	
	Carro carro1 = new Carro("PLX-0301", "CELTA", "GM");
	
		
	carro1.ligarCarro();
	carro1.andarCarro();
	System.out.println("marcha: "+ carro1.getMarcha()+"  velocidade: "+ carro1.getVelocidade());
	

	}

}
