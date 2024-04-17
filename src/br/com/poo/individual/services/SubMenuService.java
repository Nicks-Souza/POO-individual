package br.com.poo.individual.services;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//import br.com.poo.individual.controllers.AutenticacaoController;
import br.com.poo.individual.controllers.DepartamentoController;
import br.com.poo.individual.controllers.FuncionarioController;
import br.com.poo.individual.entities.Funcionario;
import br.com.poo.individual.util.Util;

public class SubMenuService {
	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	public static void subMenuImpresso(Funcionario funcionario) throws IOException, InterruptedException {
		DepartamentoController departamentoController = new DepartamentoController();
		FuncionarioController funcionarioController = new FuncionarioController();
		
		Util.customizer();
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tListar Nomes dos funcionarios
				[2]\tListar Departamentos
				[3]\tListar os funcionarios e seu departamento
				[0]\tSair
				Digite uma opção:
				""");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Util.customizer();
			logger.log(Level.INFO, "Lista dos nomes dos Funcionarios e suas funções: ");
			funcionarioController.listarFuncionarios();
			logger.log(Level.INFO, "\n\n");
			subMenuImpresso(funcionario);
			break;
		case 2:
			Util.customizer();
			logger.log(Level.INFO, "Lista do nome do departamento: ");
			departamentoController.listarDepartamento();
			logger.log(Level.INFO, "\n\n");
			subMenuImpresso(funcionario);
			break;
		case 3:
			Util.customizer();
			logger.log(Level.INFO, "Listar funcionários e seu departamento: ");
			funcionarioController.listarFuncionariosDepartamento();
			logger.log(Level.INFO, "\n\n");
			subMenuImpresso(funcionario);
			break;
		case 0:
			MenuService.menu(funcionario);
			break;
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			subMenuImpresso(funcionario);
			break;
		}

	}
	
	public static void subMenuConsole(Funcionario funcionario) throws IOException, InterruptedException {
		DepartamentoController departamentoController = new DepartamentoController();
		FuncionarioController funcionarioController = new FuncionarioController();
		
		Util.customizer();
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tListar departamento
				[2]\tListar Funcionarios
				[0]\tSair
				Digite uma opção:
				""");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Util.customizer();
			logger.log(Level.INFO, "Lista o nome do departamento");
			departamentoController.listarDepartamento();
			logger.log(Level.INFO, "\n\n");
			subMenuConsole(funcionario);
			break;
		case 2:
			Util.customizer();
			logger.log(Level.INFO, "Lista o nome dos funcionarios");
			funcionarioController.listarFuncionarios();
			logger.log(Level.INFO, "\n\n");
			subMenuConsole(funcionario);
			break;
		case 0:
			MenuService.menu(funcionario);
			break;
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			subMenuConsole(funcionario);
			break;
		}

	}
}
