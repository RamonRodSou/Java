package RamonRodProjetos;

import java.util.Scanner;

public class TabeladePizza {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				colocarTraco ();

		String [] qualPizza = new  String[] { "Calabresa ","Mussarela", "Bacon", "Frango"};
			mensagem ("Escolha qual o Sabor: " );
		
				iterarEExibirPosicoesDoVetorString(qualPizza);	
				
			Integer saborEscolhido = escolhaNumeroInteiro ("Voce escolheu o sabor: ", scanner );
			Boolean escolhaValida = verificarPosicaoEscolhida(saborEscolhido,qualPizza);{
			}
				colocarTraco ();
	
			if(!escolhaValida) {
				escolhaInvalida();
			}
			
			String [] formaDePagamento = new String [] {"Cartão Credito", "Cartao Debito", "Dinheiro","Pix"};
			mensagem("Escolha a forma de Pagamento: ");
			
				iterarEExibirPosicoesDoVetorString(formaDePagamento);
				
			Integer formaPagamentoEscolhida = escolhaNumeroInteiro("Sua forma de pagamento escolhida é: ", scanner);
			Boolean Pagamento = verificarPosicaoEscolhida(formaPagamentoEscolhida,formaDePagamento);{
			}
			Boolean pagamentoEmPix = true;
			
			if(!Pagamento) {
				escolhaInvalida();
			}
			
			String pizzaEscolhida = qualPizza[saborEscolhido] ;
			String pagamentoEscolhido = formaDePagamento[formaPagamentoEscolhida];
				colocarTraco ();	

			mensagem("Voce Escolheu Pizza de: " + pizzaEscolhida + ".");
			mensagem( "Forma de Pagamento: " + pagamentoEscolhido + ".");
			if (pagamentoEmPix) {
				formaPagamentoEscolhida = 3;
			mensagem("Pix: 21 972923210");
			}
			
colocarTraco ();	

		scanner.close();
	}
	static Integer escolhaNumeroInteiro (String texto, Scanner scanner) {
		mensagemNaMesmaLinha (texto);
		Integer numero = scanner.nextInt();
		return numero;
	}
	static Boolean verificarPosicaoEscolhida (Integer posicao, String [] vetor  ) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	static void colocarTraco () {
		System.out.println("-----------------------------------------");
	}	
	static void escolhaInvalida () {
		System.err.println("Opção Invalida!");
		System.exit(1);
	}
	static void  iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for ( int i = 0 ; i < vetor.length; i++) {
			System.out.println("[ " + i + " ]" + vetor[i]);
		}
	}
	static void mensagem(String texto) {
		System.out.println(texto);
	}
	static void mensagemNaMesmaLinha(String texto1) {
		System.out.print(texto1);
	}

}

