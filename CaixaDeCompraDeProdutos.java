package RamonRodProjetos;

import java.util.Scanner;

public class CaixaDeCompraDeProdutos {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			Double valorProduto = mensagemMaisScanner("Digite o valor do produto: ", scanner);
			Double quantidadeProduto = mensagemMaisScanner("Digite o numero de produtos iguais: ", scanner);
			Double valorPago = mensagemMaisScanner("Digite Valor Pago: ", scanner);;

			Double valorSubtotal = valorProduto * quantidadeProduto;
			Boolean quantidadeMaiorOuIgualDez = quantidadeProduto >= 10;
			Double percentualDesconto = 0.0;
			Boolean dinheiroInsuficiente = valorSubtotal > valorPago;
			
			if (dinheiroInsuficiente) {
				mensagemErro();
			}
			else if(quantidadeMaiorOuIgualDez) {
				percentualDesconto = 10.0;
				Double desconto = valorSubtotal * percentualDesconto / 100;
				Double valorTotalComDesconto = valorSubtotal - desconto;
				Double troco = valorPago - valorTotalComDesconto;

				mensagem("Valor com desconto: " + valorTotalComDesconto);
				mensagem("Troco: " + troco);
			}
			else {
				Double trocoSemDesconto = valorPago - valorSubtotal;
				mensagem("Valor sem desconto: " + valorSubtotal);
				mensagem("Troco: " + trocoSemDesconto);
			}
			scanner.close();
		}
		static void mensagemErro () {
			System.err.println("Dinheiro Insuficiente!");
			System.exit(1);
			}
		static Double mensagemMaisScanner (String texto, Scanner scanner) {
			mensagemNaMesmaLinha(texto);
			Double numero = scanner.nextDouble();
			return numero;
		}
		static void mensagem(String texto) {
			System.out.println(texto);
		}
		static void mensagemNaMesmaLinha(String texto) {
			System.out.print(texto);
		}
	}
