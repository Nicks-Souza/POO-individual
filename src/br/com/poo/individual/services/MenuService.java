package br.com.poo.individual.services;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//import br.com.poo.individual.controllers.DepartamentoController;
//import br.com.poo.individual.controllers.FuncionarioController;
import br.com.poo.individual.entities.Funcionario;
import br.com.poo.individual.util.Util;

public class MenuService {

	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	public static void menu(Funcionario funcionario) throws IOException, InterruptedException {
//		FuncionarioController funcionarioController = new FuncionarioController();
//		DepartamentoController departamentoController = new DepartamentoController();


		Util.customizer();
		logger.log(Level.INFO, () -> "Olá, " + funcionario.getNome() + "\n\n");
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tImpresso
				[2]\tConsole
				[0]\tSair
				Digite uma opção:
				""");
		try {
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				SubMenuService.subMenuImpresso(funcionario);
				break;
			case 2:
				SubMenuService.subMenuConsole(funcionario);
				break;
			case 0:
				Util.customizer();
				logger.log(Level.INFO, "Volte sempre!");
				break;
			default:
				Util.customizer();
				logger.log(Level.INFO, "Opção inválida!");
				menu(funcionario);
				break;
			}
		} catch (InputMismatchException e) {
			Util.customizer();
			logger.log(Level.INFO, "\n\nOpção inválida!\n\n");
			sc.nextLine();
			Thread.sleep(2000);
			menu(funcionario);
		}
	}
}

		
		
		
		
		
		
		
		
//		Util.customizer();
//		logger.log(Level.INFO, """
//				Menu interativo:
//				[1]\tListar Nomes dos Funcionarios
//				[2]\tListar Departamento
//				[3]\tListar os funcionarios e seu departamento
//				[0]\tSair
//				Digite uma opção:
//				""");
//
//		int opcao = -1;
//
//		try {
//			opcao = sc.nextInt();
//		} catch (InputMismatchException e) {
//			sc.next(); // limpa o buffer do scanner
//			logger.log(Level.INFO, "Você digitou um valor não esperado. Retornando ao menu...");
//		}
//
//		switch (opcao) {
//		case 1:
//			Util.customizer();
//			logger.log(Level.INFO, "Lista dos nomes dos Funcionarios e suas funções: ");
//			funcionarioController.listarFuncionarios();
//			logger.log(Level.INFO, "\n\n");
//			menu();
//			break;
//		case 2:
//			Util.customizer();
//			logger.log(Level.INFO, "Lista do nome do departamento: ");
//			departamentoController.listarDepartamento();
//			logger.log(Level.INFO, "\n\n");
//			menu();
//			break;
//		case 3:
//			Util.customizer();
//			logger.log(Level.INFO, "Listar funcionários e seu departamento: ");
//			funcionarioController.listarFuncionariosDepartamento();
//			logger.log(Level.INFO, "\n\n");
//			break;
//		case 0:
//			Util.customizer();
//			logger.log(Level.INFO, "Volte sempre!");
//			break;
//		default:
//			Util.customizer();
//			logger.log(Level.INFO, "Opção inválida!");
//			menu();
//			break;
//
//		}
//	}
//}
