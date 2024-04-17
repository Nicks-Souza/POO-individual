package br.com.poo.individual.controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.entities.Funcionario;
import br.com.poo.individual.services.AutenticacaoService;
import br.com.poo.individual.services.MenuService;
import br.com.poo.individual.util.Util;

public class AutenticacaoController {
	AutenticacaoService autenticacaoService = new AutenticacaoService();
	static Logger logger = Util.setupLogger();
	
	public Funcionario login() throws IOException, InterruptedException {
		Funcionario funcionario;
		do {
			
		
		funcionario = autenticacaoService.credenciais();
		if(funcionario != null) {
			Thread.sleep(2000);
			logger.log(Level.INFO, "\n\nLogin realizado com sucesso!");
			Thread.sleep(2000);
			MenuService.menu(funcionario);
		}else {
			Thread.sleep(2000);
			logger.log(Level.INFO, "Login não realizado com sucesso...");
			Thread.sleep(2000);
			}
		} while(funcionario == null);
		return funcionario;
	}
}
//	public void cadastrarFuncionario(Funcionario funcionario) throws IOException, InterruptedException {
//		autenticacaoService.cadastrarFuncionario();
//		MenuService.menu(funcionario);

	

