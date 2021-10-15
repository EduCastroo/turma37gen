package app;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEspecial;
import entities.ContaPoupanca;

public class Testes {
//TODO Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo deseja solicitar 
//cheque, limitando em apenas 3 cheques. cada tal√£o debita a conta em R$ 30.00.

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double controle;
		double valor;
		double conversor;
		
		ContaEspecial conta = new ContaEspecial(2314, "782354256");
		
		System.out.println("DIGITE O VALOR DA OPERA«√O: ");
		valor = ler.nextDouble();
		
		
		while(conta.valorNegativo(valor)){
			System.out.println("Valor invalido, digite novamente: ");
			valor = ler.nextDouble();
		}
		
		
		if (conta.validaTransacao(valor)) {
			conta.debito(valor);
			if (conta.getSaldo() < 0) {
				
				
				controle = Math.abs(conta.getSaldo());
				
				conta.usarLimite(controle);
				conta.credito(controle);
			}
		}
		
		conta.imprimeSaldos();
		conta.imprimeTotalConta();
		
		
		ContaPoupanca contapoupa = new ContaPoupanca(123141, "267458236", 29);
		
		
		
		if(contapoupa.verificaAniversario(29)) {
			contapoupa.correcao();
		}
		
	}

}
