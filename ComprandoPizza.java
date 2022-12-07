package RamonRodProjetos;

import java.util.Scanner;

public class ComprandoPizza {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//-------------------------------------------Usuario--------------------------------------------------------	
		colocarTraco();
		
		imprimirMesmaLinha("Digite seu nome: ");
		String nomeUsuario = scanner.next();
		
		imprimirMesmaLinha("Olá " + nomeUsuario + " informe seu endereço: ");
		String enderecoUsuario = scanner.next();
		
		imprimirMesmaLinha("Informe o numero da sua residência: ");
		Integer numeroCasaUsuario = scanner.nextInt();
		
		int dDD = (21);
		imprimirMesmaLinha("Informe o telefone celular para contato: " + dDD + " " );
		Integer telefoneUsuario = scanner.nextInt();
		telefoneValido(telefoneUsuario);
		

		
	
//--------------------------------------------TAMANHO-------------------------------------------------------	
		colocarTraco();
		
		String[] tamanho = new String[] {"Pequena", "Média", "Família","Grande"};

		imprimir("Escolha o tamanho da pizza: ");
		loopVetor(tamanho);
		
		Integer tamanhoEscolhido = escolha("Qual é o tamanho da Pizza? ", scanner);
		Double valorTamanho = valorPeloTamanho(tamanhoEscolhido);
		Boolean pararTamanho = verificarEscolha(tamanhoEscolhido, tamanho);
		
		if (!pararTamanho) {
			
			escolhaInvalida();
		}

		colocarTraco();	
		
//---------------------------------------------SABOR--------------------------------------------------------	
		
		String[] sabor = new String [] {"Calabresa", "Mussarela", "Bacon","Frango"};

		imprimir("Escolha o sabor da pizza: ");
		loopVetor(sabor);
		
		Integer saborEscolhido = escolha("Qual é o sabor da Pizza? ", scanner);
		Double valorSabor = valorPeloDoSabor(saborEscolhido);
		Boolean pararSabor = verificarEscolha(saborEscolhido, sabor);
		
		if (!pararSabor) {
			
			escolhaInvalida();
		}

		colocarTraco();
		
//-------------------------------------------PAGAMENTO------------------------------------------------------	
		
		String[] pagamento = new String [] {"Dinheiro", "Pix", "Credito","Debito"};

		imprimir("Escolha a forma de pagamento: ");
		loopVetor(pagamento);
		
		Integer pagamentoEscolhido = escolha("Qual é a forma de pagamento? ", scanner);
		Boolean pararPagamento = verificarEscolha(pagamentoEscolhido, pagamento);
		
		if (!pararPagamento) {
			
			escolhaInvalida();
		}
		
		Double valor = 0.0; 
		Double pagamentoNaHora = 0.0;
		Double valorTotal = valorSabor + valorTamanho;
		
		if (pagamentoEscolhido.equals(2)) {
			valor = (3.0/100);
			valorTotal = valorTotal + valor;
		}
		
		if (pagamentoEscolhido.equals(3)) {
			valor = (3.0/100);
			valorTotal = valorTotal - valor;
		}
		
		colocarTraco();	
	
		String exibirTamanho = tamanho[tamanhoEscolhido];
		String exibirSabor = sabor[saborEscolhido];
		String exibirPagamento = pagamento[pagamentoEscolhido];

		imprimir(nomeUsuario + " finalizamos seu pedido.");
		imprimir("A entrega será no endereço " + enderecoUsuario + " " + numeroCasaUsuario);
		imprimir("Telefone para contato " + dDD + telefoneUsuario);
		
		imprimir("Pizza tamanho " + exibirTamanho + ".");
		imprimir("Com recheio de " + exibirSabor + ".");
		imprimir("Forma de pagamento em " + exibirPagamento + ".");
		imprimir("Total a pagar: R$ " + valorTotal);
		
		if (pagamentoEscolhido.equals(0)) {
			
			imprimirMesmaLinha("Troco para quanto? ");
			pagamentoNaHora = scanner.nextDouble();
			Double calculoDeTroco = pagamentoNaHora - valorTotal ;
			imprimirMesmaLinha("Seu troco é de R$ " + calculoDeTroco);

		}
		if (pagamentoEscolhido.equals(1)) {
			imprimir("Chave Pix: 21 987654321");
		}
		colocarTraco();		

	scanner.close();
	

	}
	
//--------------------------------------------FUNÇÕES---------------------------------------------------------	

	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public static void imprimirMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void colocarTraco() {
		imprimir("---------------------------------------------------");
	}
	
	static void escolhaInvalida() {
		System.err.println("Opção Invalida!");
		System.exit(1);
	}
	
	static Boolean verificarEscolha(Integer escolha, String[] vetor) {
		Boolean valida = escolha >= 0 && escolha < vetor.length;
		return valida;
		
}
	static void telefoneValido (Integer telefoneUsuario) {
		
		Integer numeroMinimo = 100000000;
		Integer numeroMaximo = 1000000000;
		
			if((telefoneUsuario < numeroMinimo || telefoneUsuario >= numeroMaximo)) {
				System.err.println("Numero de Telefone Celular Invalido!");
				System.exit(1);
		
				}
			
	}

	static void loopVetor (String[] vetor) {
		
		for(int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "] " + vetor[i]);
		}
	}
	
	static Integer escolha(String texto, Scanner scanner) {
			
			imprimirMesmaLinha(texto);
			Integer numero = scanner.nextInt();
			
		return numero;
	
	}
	
	static Double valorPeloTamanho(Integer escolha) {
		Double valor = 0.0;
		
		switch(escolha){
		case 0: 
			valor = 20.0;
			break;
		case 1: 
			valor = 30.0;
			break;
		case 2: 
			valor = 40.0;
			break;
		case 3: 
			valor = 50.0;
			break;
		case 4: 

		}
		return valor;
	}
	
	static Double valorPeloDoSabor(Integer escolha) {
		Double valor = 0.0;
		
		switch(escolha){
		case 0: 
			valor = 2.0;
			break;
		case 1: 
			valor = 2.0;

			break;
		case 2: 
			valor = 6.0;

			break;
		case 3: 
			valor = 6.0;

			break;
		}
		return valor;
	}
}

	
