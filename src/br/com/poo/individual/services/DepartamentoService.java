package br.com.poo.individual.services;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Departamento;

public class DepartamentoService {

	public List<String> listaNomeDepartamento() {

		List<String> listaNomeDepartamento = new ArrayList<>();
		// cria um foreach para percorrer o mapa de funcionários
		for (Departamento departamento : Departamento.getMapaDepartamento().values()) {
			// Adiciona o nome do funcionário na lista listaNomesFuncionarios
			listaNomeDepartamento.add(departamento.getNome());
		}
		return listaNomeDepartamento;
	}
}
