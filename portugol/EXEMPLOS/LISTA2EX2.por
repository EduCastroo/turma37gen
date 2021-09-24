programa
{
	
	funcao inicio()
	{

	const real VALORHORANORMAL=10.00
	const real VALORHORAEXTRA=20.00
	const inteiro HORASNORMAIS=50
	
	cadeia C
	inteiro N=0
	real salario=0.00
	inteiro E=0
	real salarioTotal=0.00
	real salarioExcedente=0.00

	escreva("DIGITE O CODIGO DO FUNCIONÁRIO: ")
	leia(C)
	escreva("DIGITE O NUMERO DE HORAS TRABALHADAS: ")
	leia(N)

	se(N > HORASNORMAIS){
		E= (N-HORASNORMAIS)
		salario = (HORASNORMAIS*VALORHORANORMAL)
		salarioExcedente = (E*VALORHORAEXTRA)
		salarioTotal = (salario+salarioExcedente)
	}
	senao {
		salario = (N*VALORHORANORMAL)
	}
	escreva("FOLHA DE PAGAMENTO")
	escreva("\nSALÁRIO R$ ",salario)
	escreva("\nNÚMERO DE HORAS EXTRAS: ",E)
	escreva("\nSALÁRIO EXCEDENTE R$ ", salarioExcedente)
	escreva("\nSALÁRIO TOTAL R$",salarioTotal)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 686; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */