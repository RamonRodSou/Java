package RamonRodProjetos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		Double primeiroNumero = informeNumero(scanner);
		colocarTraco();
		Integer operacao = escolhaAOperacao(scanner);
		colocarTraco();
		Double segundoNumero = informeNumero(scanner);
		colocarTraco();
		Double resultado = realizarCalculo(operacao, primeiroNumero, segundoNumero);
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();
	}	
	
	static Double realizarCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero) {
		Double resultado = null;
		
		switch (operacao) {
		case 0:
			resultado = subtracao(primeiroNumero, segundoNumero);
			break;
		case 1:
			resultado = adicao(primeiroNumero, segundoNumero);
			break;
		case 2:
			resultado = multiplicacao(primeiroNumero, segundoNumero);
			break;
		case 3:
			resultado = divisao(primeiroNumero, segundoNumero);
			break;
		default:
			System.err.println("Escolha uma operação válida!");
			System.exit(0);
		}
		return resultado;
	}
	
	static Double subtracao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda - numeroDireita;
	}
	
	static Double adicao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda + numeroDireita;
	}
	static Double multiplicacao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda * numeroDireita;
	}
	static Double divisao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda / numeroDireita;
	}
	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("ESCOLHA A OPERAÇÃO");
		
		String[] operacoes = new String[] {"Subtração", "Adição","Multiplicação","Divisão"};
		for(int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "] " + operacoes[i]);
		}
		System.out.print("Digite a operação: ");
		return scanner.nextInt();
	}
	static Double informeNumero(Scanner scanner) {
		System.out.print("Informe o número: ");
		return scanner.nextDouble();
	}
	static void colocarTraco() {
		System.out.println("---------------------------------------");
	}
}
