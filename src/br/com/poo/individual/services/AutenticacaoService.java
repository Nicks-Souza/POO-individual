package br.com.poo.individual.services;


import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.time.LocalDate;
import br.com.poo.individual.entities.Funcionario;
//import br.com.poo.individual.io.RelatorioIO;
import br.com.poo.individual.util.Util;

public class AutenticacaoService {
	
	static Scanner sc = new Scanner(System.in);
	static Logger logger = Util.setupLogger();
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public Funcionario credenciais() {
		Util.customizer();
		logger.log(Level.INFO, "Digite seu cpf: ");
		String cpf = sc.nextLine();
		logger.log(Level.INFO, "Digite sua senha: ");
		String senha = sc.nextLine();
		return login(cpf, senha);
	}

	public Funcionario login(String cpf, String senha) {
		for(Funcionario funcionario : Funcionario.getMapaFuncionarios().values()) {
			if(funcionario.getCpf().equals(cpf) && funcionario.getSenha().equals(senha)) {
				return funcionario;
				
			}
		}
		return null;
	}
}
//public void cadastrarFuncionario() {
////	private Integer id;
////	private String nome;
////	private String funcao;
////	private String genero;
////	private LocalDate dataNasc;
////	private String cpf;
////	private String telefone;
////	private String email;
////	private String senha;
////	private Float salario;
////	private String permissao;
////	private Integer fkDep;
//	Util.customizer();
//	logger.log(Level.INFO, "Digite o id: ");
//	Integer id = sc.nextInt();
//	sc.nextLine();
//	logger.log(Level.INFO, "Digite o nome: ");
//	String nome = sc.nextLine();
//	logger.log(Level.INFO, "Digite a funcao: ");
//	String funcao = sc.nextLine();
//	logger.log(Level.INFO, "Digite o genero: ");
//	String genero = sc.nextLine();
//	logger.log(Level.INFO, "Digite a idade: ");
//	Integer dataNasc = sc.nextInt();
//	logger.log(Level.INFO, "Digite o cpf: ");
//	String cpf = sc.nextLine();
//	logger.log(Level.INFO, "Digite o telefone: ");
//	String telefone = sc.nextLine();
//	logger.log(Level.INFO, "Digite o email: ");
//	String email = sc.nextLine();
//	logger.log(Level.INFO, "Digite a senha: ");
//	String senha = sc.nextLine();
//	logger.log(Level.INFO, "Digite o salario: ");
//	Float salario = sc.nextFloat();
//	logger.log(Level.INFO, "Digite a permissao: ");
//	String permissao = sc.nextLine();
//	logger.log(Level.INFO, "Digite o IDdepartamento: ");
//	Integer idDepartamento = sc.nextInt();
//	sc.nextLine();
//	Funcionario funcionario = new Funcionario(id , nome, funcao, genero, dataNasc, cpf,
//			telefone,  email, senha, salario, permissao, idDepartamento);
//	RelatorioIO.cadastrarFuncionario(funcionario);
//	}
//}
