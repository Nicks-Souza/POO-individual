package br.com.poo.individual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Funcionario;
import br.com.poo.individual.io.RelatorioIO;

public class FuncionarioService {
	
	public List<Funcionario> listarFuncionarios() throws IOException {
		
		List<Funcionario> listarFuncionarios = new ArrayList<>();
		//cria um foreach para percorrer o mapa de funcionários
		for(Funcionario funcionario : Funcionario.getMapaFuncionarios().values()) {
			//Adiciona o nome do funcionário na lista listaNomesFuncionarios
			listarFuncionarios.add(funcionario);
		}
		
		RelatorioIO.relatorioListaFuncionarios(listarFuncionarios);
		return listarFuncionarios;
	}
	public List<Funcionario> listaFuncionarios() {
		List<Funcionario> listaNomesFuncionarios = new ArrayList<>();
		for(Funcionario funcionario : Funcionario.getMapaFuncionarios().values()) {
			listaNomesFuncionarios.add(funcionario);
		}
		return listaNomesFuncionarios;
	}
	
	public void listarFuncionarioDepartamento() throws IOException {
		DepartamentoService departamentoService = new DepartamentoService();
		RelatorioIO.relatorioListaFuncionarioDepartamento(listaFuncionarios(), departamentoService.listaDepartamento());
	}
}
