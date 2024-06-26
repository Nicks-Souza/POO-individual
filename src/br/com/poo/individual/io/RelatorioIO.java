package br.com.poo.individual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
//import java.util.logging.Level;
//import java.util.logging.Logger;

import br.com.poo.individual.entities.Departamento;
import br.com.poo.individual.entities.Funcionario;
import br.com.poo.individual.enums.TipoRegistro;
import br.com.poo.individual.util.Util;

public class RelatorioIO extends Funcionario {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
//	private static Logger logger = Util.setupLogger();
	
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	static DateTimeFormatter dtfBr = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				Util.customizer();
				String[] dados = linha.split(";");

				if (dados[0].equalsIgnoreCase(TipoRegistro.FUNCIONARIO.name())) {

					Funcionario funcionario = new Funcionario(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4],
							LocalDate.parse(dados[5], dtf), dados[6], dados[7], dados[8], dados[9],
							Float.parseFloat(dados[10]), dados[11], Integer.parseInt(dados[12]));

					Funcionario.getMapaFuncionarios().put(Integer.parseInt(dados[1]), funcionario);

//					logger.log(Level.INFO, funcionario::toString);
				} else if (dados[0].equalsIgnoreCase(TipoRegistro.DEPARTAMENTO.name())) {

					Departamento departamento = new Departamento(Integer.parseInt(dados[1]), dados[2], dados[3],
							dados[4], dados[5], dados[6]);

					Departamento.getMapaDepartamento().put(Integer.parseInt(dados[1]), departamento);
//					logger.log(Level.INFO, departamento::toString);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void relatorioListaFuncionarios(List<Funcionario> Funcionarios) throws IOException {
		String nome = "Lista-nomes-funcionarios";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-----RELATORIO: LISTA FUNCIONÁRIOS-----\n");
		if (!Funcionarios.isEmpty()) {
			buffWrite.append("Nome dos Funcionarios: \n");
			for (Funcionario Funcionario : Funcionarios) {
				buffWrite.append("\tnome: " + Funcionario.getNome() + "\tFunção: " + Funcionario.getFuncao() + "\n");
			}
		}
		buffWrite.append("");
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da análise: " + dtfBr.format(ldt));
		buffWrite.append("\n\n-----FIM DA LISTA FUNCIONARIOS-----\n");
		buffWrite.close();

	}

	public static void relatorioListaDepartamento(List<String> nomesDepartamento) throws IOException {
		String nome = "Lista-nomes-Departamento";
		;

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-----RELATORIO: LISTA DEPARTAMENTO-----\n");
		if (!nomesDepartamento.isEmpty()) {
			buffWrite.append("Nome do departamento: \n");
			for (String nomeDepartamento : nomesDepartamento) {
				buffWrite.append(nomeDepartamento + "\n");
			}
		}
		buffWrite.append("");
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da análise: " + dtfBr.format(ldt));
		buffWrite.append("\n\n-----FIM DA LISTA DEPARTAMENTO-----\n");
		buffWrite.close();

	}

	public static void relatorioListaFuncionarioDepartamento(List<Funcionario> Funcionario,
			List<Departamento> Departamento) throws IOException {
		String nome = "Lista-nomes-FuncionarioDepartamento";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-----RELATORIO: LISTA Funcionario-DEPARTAMENTO-----\n");
		if (!Departamento.isEmpty() && !Funcionario.isEmpty()) {
			buffWrite.append("Nome do departamento: \n");
			for (Departamento departamento : Departamento) {
				for (Funcionario funcionario : Funcionario) {
					if (Objects.equals(funcionario.getFkDep(), departamento.getId())) {
						buffWrite.append("Nome do funcionario: " + funcionario.getNome() + "\t\tNome do departamento: "
								+ departamento.getNome() + "\n");
					}
				}
			}
		}
		buffWrite.append("");
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da análise: " + dtfBr.format(ldt));
		buffWrite.append("\n\n-----FIM DA LISTA Pessoa-DEPARTAMENTO-----\n");
		buffWrite.close();

	}
}


//public static void cadastrarFuncionario(Funcionario funcionario) {
//	String nome = "banco";
//
//	try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true))) {
//		// Pet;2;Pastel;felino;gato preto;5;preto;pequeno;3.5;5;2020-02-17 00:00:00;
//		String linha = "Funcionario;" + funcionario.getId() + ";" + funcionario.getNome() + ";" + funcionario.getFuncao() + ";" + funcionario.getGenero()
//				+ ";" + funcionario.getDataNasc() + ";" + funcionario.getCpf() + ";" + funcionario.getTelefone() + ";" + funcionario.getEmail() + ";"
//				+ funcionario.getSenha() + ";" + funcionario.getSalario() + ";" + funcionario.getPermissao() + ";" + funcionario.getFkDep() + ";";
//		buffWrite.append("\n").append(linha);
//		buffWrite.flush();
//	} catch (IOException e) {
//		logger.log(Level.INFO, "Erro ao salvar no arquivo!");
		
	

//	public static void escritor(String path) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		Util.customizer();
//		logger.log(Level.INFO, () -> "Escreva o nome do arquivo: ");
//		String nome = sc.next();
//
//		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));
//		String linha = "";
//
//		Util.customizer();
//		logger.log(Level.INFO, () -> "Escreva algo: ");
//		Scanner sc1 = new Scanner(System.in);
//		linha = sc1.nextLine();
//		buffWrite.append(linha + "\n");
//		buffWrite.close();
//		sc.close();
//		sc1.close();
//
//	}
//}