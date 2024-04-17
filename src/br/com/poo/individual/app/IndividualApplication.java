package br.com.poo.individual.app;

import java.io.IOException;
import java.util.Scanner;

import br.com.poo.individual.controllers.AutenticacaoController;
import br.com.poo.individual.io.RelatorioIO;
//import br.com.poo.individual.services.MenuService;

public class IndividualApplication {
	public static Scanner sc = new Scanner(System.in);
	
//	public static void main (String[] args) throws IOException {
		
		
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


	public static void main(String[] args) throws IOException {
			AutenticacaoController autenticacaoController = new AutenticacaoController();
			
			try {
				RelatorioIO.leitor("banco");
				autenticacaoController.login();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}

//		int opcao;
//		do {
//			limparTela();
//			logger.info("======= Menu =======");
//			logger.info("1. Relatório na tela");
//			logger.info("2. Relatório impresso");
//			logger.info("3. Sair");
//			logger.info("Escolha uma opção: ");
//			opcao = scanner.nextInt();
//
//			switch (opcao) {
//			case 1:
//				exibirRelatoriosNaTela();
//				break;
//			case 2:
//				exibirRelatoriosImpressos();
//				break;
//			case 3:
//				logger.info("Saindo do programa...");
//				break;
//			default:
//				logger.warning("Opção inválida. Tente novamente.");
//			}
//		} while (opcao != 3);
//	}
//
//	public static void exibirRelatoriosNaTela() throws IOException {
//		int opcao;
//		do {
//			limparTela();
//			logger.info("======= Relatório na tela =======");
//			logger.info("1. Relatório 1");
//			logger.info("2. Voltar ao menu anterior");
//			logger.info("Escolha uma opção: ");
//			opcao = scanner.nextInt();
//
//			switch (opcao) {
//			case 1:
//				logger.info("Exibindo Relatório 1 na tela...");
//				RelatorioIO.leitor("banco");
//				// Aqui você pode chamar o método para gerar o relatório 1
//				break;
//			case 2:
//				logger.info("Voltando ao menu anterior...");
//				break;
//			default:
//				logger.warning("Opção inválida. Tente novamente.");
//			}
//		} while (opcao != 2);
//	}
//
//	public static void exibirRelatoriosImpressos() throws IOException {
//		int opcao;
//		do {
//			limparTela();
//			logger.info("======= Relatório impresso =======");
//			logger.info("1. Relatório 1");
//			logger.info("2. Relatório 2");
//			logger.info("3. Voltar ao menu anterior");
//			logger.info("Escolha uma opção: ");
//			opcao = scanner.nextInt();
//
//			switch (opcao) {
//			case 1:
//				logger.info("Imprimindo Relatório 1...");
//				FuncionarioService funcionarioservice = new FuncionarioService();
//
//				RelatorioIO.leitor("banco");
//				RelatorioIO.relatorioListaFuncionários(funcionarioservice.listaNomesFuncionarios());
//					sc.close();
//					
//				// Aqui você pode chamar o método para gerar o relatório 1
//				break;
//			case 2:
//				logger.info("Imprimindo Relatório 2...");
//				DepartamentoService departamentoservice = new DepartamentoService();
//				RelatorioIO.leitor("banco");
//				RelatorioIO.relatorioListaDepartamento(departamentoservice.listaNomeDepartamento());
//				// Aqui você pode chamar o método para gerar o relatório 2
//				break;
//			case 3:
//				logger.info("Voltando ao menu anterior...");
//				break;
//			default:
//				logger.warning("Opção inválida. Tente novamente.");
//			}
//		} while (opcao != 3);
//	}
//
//	// Método para gerar o relatório 1
//	public static void gerarRelatorio1() {
//		// Implementação para gerar o relatório 1
//		logger.info("Gerando Relatório 1...");
//	}
//
//	// Método para gerar o relatório 2
//	public static void gerarRelatorio2() {
//		// Implementação para gerar o relatório 2
//		logger.info("Gerando Relatório 2...");
//	}
//
//	public static void limparTela() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println();
//		}
//	}
//}