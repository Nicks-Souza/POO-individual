package br.com.poo.individual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.entities.Funcionario;
import br.com.poo.individual.services.FuncionarioService;
import br.com.poo.individual.util.Util;

public class FuncionarioController {
	
FuncionarioService funcionarioService = new FuncionarioService();
static Logger logger = Util.setupLogger();

	public void listarFuncionarios() throws IOException {
	
				List<Funcionario> funcionarios = funcionarioService.listarFuncionarios();
				Util.customizer();
				logger.log(Level.INFO, () -> funcionarios + "\n\nLista gerada com sucesso!");
	}
	
	public void listarFuncionariosDepartamento() throws IOException {
		
		funcionarioService.listarFuncionarioDepartamento();
		Util.customizer();
		logger.log(Level.INFO, () -> "\n\nLista gerada com sucesso!");
}

}
