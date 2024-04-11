package br.com.poo.individual.services;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Funcionario;

public class FuncionarioService {
	
	public List<String> listaNomesFuncionarios() {
		
		List<String> listaNomesFuncionarios = new ArrayList<>();
		//cria um foreach para percorrer o mapa de funcionários
		for(Funcionario funcionario : Funcionario.getMapaFuncionarios().values()) {
			//Adiciona o nome do funcionário na lista listaNomesFuncionarios
			listaNomesFuncionarios.add(funcionario.getNome());
		}
		return listaNomesFuncionarios;
	}
	
	
}
