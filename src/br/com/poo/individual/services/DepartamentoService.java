package br.com.poo.individual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Departamento;
import br.com.poo.individual.io.RelatorioIO;

public class DepartamentoService {

	public List<String> listaNomeDepartamento() throws IOException {

		List<String> listaNomeDepartamento = new ArrayList<>();
		// cria um foreach para percorrer o mapa de funcionários
		for (Departamento departamento : Departamento.getMapaDepartamento().values()) {
			// Adiciona o nome do funcionário na lista listaNomesFuncionarios
			listaNomeDepartamento.add(departamento.getNome());
		}
		RelatorioIO.relatorioListaDepartamento(listaNomeDepartamento);
		return listaNomeDepartamento;
	}

	public List<Departamento> listaDepartamento() {
		List<Departamento> listaDepartamento = new ArrayList<>();
		for (Departamento departamento : Departamento.getMapaDepartamento().values()) {
			listaDepartamento.add(departamento);
		}
		return listaDepartamento;
	}
}
