package br.com.poo.individual.entities;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Funcionario {

	private Integer id;
	private String nome;
	private String funcao;
	private String genero;
	private LocalDate dataNasc;
	private String cpf;
	private String telefone;
	private String email;
	private String senha;
	private Float salario;
	private String permissao;
	private Integer fkDep;
	
	static Map<Integer, Funcionario> mapaFuncionarios = new HashMap<>();
	
	//metodo especial chamado construtor default
	public Funcionario() {
		super();//herança
	}

	public Funcionario(Integer id, String nome, String funcao, String genero, LocalDate dataNasc, String cpf,
			String telefone, String email, String senha, Float salario, String permissao, Integer fkDep) {
		super();
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
		this.genero = genero;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.salario = salario;
		this.permissao = permissao;
		this.fkDep = fkDep;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}

	public Float getSalario() {
		return salario;
	}

	public Integer getFkDep() {
		return fkDep;
	}
	
	public static Map<Integer, Funcionario> getMapaFuncionarios() {
		return mapaFuncionarios;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", funcao=" + funcao + ", genero=" + genero + ", dataNasc="
				+ dataNasc + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", senha=" + senha
				+ ", salario=" + salario + ", permissao=" + permissao + ", fkDep=" + fkDep + "]";
	}
	
}
