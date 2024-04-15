package br.com.poo.individual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.poo.individual.services.DepartamentoService;
import br.com.poo.individual.util.Util;

public class DepartamentoController {
	DepartamentoService departamentoService = new DepartamentoService();
	static Logger logger = Util.setupLogger();

		public void listarDepartamento() throws IOException {
		
					List<String> departamento = departamentoService.listaNomeDepartamento();
					Util.customizer();
					logger.log(Level.INFO, () -> departamento + "\n\nLista gerada com sucesso!");
		}
	}

