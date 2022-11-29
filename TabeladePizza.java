package RamonRodProjetos;

import java.util.Scanner;

public class TabeladePizza {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		colocarTraco();

		String pizzaEscolhida = pizza(scanner);

		String pagamentoEscolhido = pagamento(scanner, pizzaEscolhida);

		colocarTraco();

		scanner.close();
	}

	static String pizza(Scanner scanner) {
		String[] qualPizza = new String[] { "Calabresa ", "Mussarela", "Bacon", "Frango" };
		mensagem("Escolha qual o Sabor: ");

		iterarEExibirPosicoesDoVetorString(qualPizza);
		
			Integer saborEscolhido = escolhaNumeroInteiro("Qual é o sabor da Pizza? ", scanner);
			
		colocarTraco();

		if (!verificarPosicaoEscolhida(saborEscolhido, qualPizza)) {
			escolhaInvalida();
		}
		return qualPizza[saborEscolhido];
	}

	static String pagamento(Scanner scanner, String pizzaEscolhida) {
		String[] formaDePagamento = new String[] { "Cartão Credito", "Cartao Debito", "Dinheiro", "Pix" };
		mensagem("Escolha a forma de Pagamento: ");

		iterarEExibirPosicoesDoVetorString(formaDePagamento);

			Integer formaPagamentoEscolhida = escolhaNumeroInteiro("Qual forma de Pagamento? ", scanner);

			if (!verificarPosicaoEscolhida(formaPagamentoEscolhida,formaDePagamento)) {
				escolhaInvalida();
			}
		colocarTraco();
		
		String pagamentoEscolhido = formaDePagamento[formaPagamentoEscolhida];
		mensagem("Voce Escolheu Pizza de: " + pizzaEscolhida + ".");
		mensagem("Forma de Pagamento: " + pagamentoEscolhido + ".");
		
		if (formaPagamentoEscolhida.equals(3)) {
			mensagem("Chave Pix: 21 987654321");
		}
		return pagamentoEscolhido;
	}

	static Integer escolhaNumeroInteiro(String texto, Scanner scanner) {
		mensagemNaMesmaLinha(texto);
			Integer numero = scanner.nextInt();
		return numero;
	}

	static Boolean verificarPosicaoEscolhida(Integer posicao, String[] vetor) {
			Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}

	static void colocarTraco() {
		System.out.println("-----------------------------------------");
	}

	static void escolhaInvalida() {
		System.err.println("Opção Invalida!");
		System.exit(1);
	}

	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
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