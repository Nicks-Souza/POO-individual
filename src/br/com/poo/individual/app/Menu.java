package br.com.poo.individual.app;

import java.io.IOException;
import java.util.Scanner;
import br.com.poo.individual.io.RelatorioIO;
import br.com.poo.individual.util.Util;

import java.util.logging.Logger;

//public class Menu {
//	
//	public static void main (String[] args) throws IOException {
//		
//		
//		Scanner teclado = new Scanner(System.in);
//		
//		int escolha = 0;
//		do {
//			System.out.println("1 - Consultar");
//			escolha = teclado.nextInt();
//			
//			if(escolha == 1)
//			RelatorioIO.leitor("banco");
//			RelatorioIO.escritor("banco");
//		}while(escolha !=0);			
//	}
//}


public class Menu {

	
	private static Logger logger = Util.setupLogger();
	private static final Scanner scanner = new Scanner(System.in);

	public static void main (String[] args) throws IOException {
		int opcao;
		do {
			limparTela();
			logger.info("======= Menu =======");
			logger.info("1. Relatório na tela");
			logger.info("2. Relatório impresso");
			logger.info("3. Sair");
			logger.info("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				exibirRelatoriosNaTela();
				break;
			case 2:
				exibirRelatoriosImpressos();
				break;
			case 3:
				logger.info("Saindo do programa...");
				break;
			default:
				logger.warning("Opção inválida. Tente novamente.");
			}
		} while (opcao != 3);
	}

	public static void exibirRelatoriosNaTela() throws IOException {
		int opcao;
		do {
			limparTela();
			logger.info("======= Relatório na tela =======");
			logger.info("1. Relatório 1");
			logger.info("2. Relatório 2");
			logger.info("3. Voltar ao menu anterior");
			logger.info("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				logger.info("Exibindo Relatório 1 na tela...");
				RelatorioIO.leitor("banco");
				// Aqui você pode chamar o método para gerar o relatório 1
				break;
			case 2:
				logger.info("Exibindo Relatório 2 na tela...");
				// Aqui você pode chamar o método para gerar o relatório 2
				break;
			case 3:
				logger.info("Voltando ao menu anterior...");
				break;
			default:
				logger.warning("Opção inválida. Tente novamente.");
			}
		} while (opcao != 3);
	}

	public static void exibirRelatoriosImpressos() {
		int opcao;
		do {
			limparTela();
			logger.info("======= Relatório impresso =======");
			logger.info("1. Relatório 1");
			logger.info("2. Relatório 2");
			logger.info("3. Voltar ao menu anterior");
			logger.info("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				logger.info("Imprimindo Relatório 1...");
				// Aqui você pode chamar o método para gerar o relatório 1
				break;
			case 2:
				logger.info("Imprimindo Relatório 2...");
				// Aqui você pode chamar o método para gerar o relatório 2
				break;
			case 3:
				logger.info("Voltando ao menu anterior...");
				break;
			default:
				logger.warning("Opção inválida. Tente novamente.");
			}
		} while (opcao != 3);
	}

	// Método para gerar o relatório 1
	public static void gerarRelatorio1() {
		// Implementação para gerar o relatório 1
		logger.info("Gerando Relatório 1...");
	}

	// Método para gerar o relatório 2
	public static void gerarRelatorio2() {
		// Implementação para gerar o relatório 2
		logger.info("Gerando Relatório 2...");
	}

	public static void limparTela() {
		for (int i = 0; i < 5; i++) {
			System.out.println();
		}
	}
}
