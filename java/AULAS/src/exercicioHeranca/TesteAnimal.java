package exercicioHeranca;



public class TesteAnimal {

	public static void main(String[] args) {
		// tipoDaVariavel / nomeDaVariavel
		Cachorro laila = new Cachorro();
		laila.setNome("laila");
		laila.setIdade(6);
		laila.setEmitirSom(true);
		laila.setDeveCorrer(true);
		
		System.out.printf(laila.getNome()+" " + laila.getIdade()+" " + laila.isEmitirSom()+" " + laila.isDeveCorrer()+"\n");
		
		
		Cavalo pangare = new Cavalo();
		pangare.setNome("pangare");
		pangare.setIdade(15);
		pangare.setEmitirSom(true);
		pangare.setDeveCorrer(true);
		
		System.out.printf(pangare.getNome()+" " + pangare.getIdade()+" " + pangare.isEmitirSom()+" " + pangare.isDeveCorrer()+"\n");
		
		Preguica soneca = new Preguica();
		soneca.setNome("soneca");
		soneca.setIdade(99);
		soneca.setEmitirSom(true);
		soneca.setSobeArvore(true);
		
		System.out.println(soneca.getNome()+" " + soneca.getIdade()+ " " + soneca.isEmitirSom()+" " + soneca.isSobeArvore()+" ");
		
				

	}

}
