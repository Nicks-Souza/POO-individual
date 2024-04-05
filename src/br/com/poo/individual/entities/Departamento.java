package br.com.poo.individual.entities;

public class Departamento {

	private int id;
	private String nome;
	private String regiao;
	private String sigla;
	private String funcao;
	private String turnoServico;
	
	
	public Departamento() {
		super();
	
	}
	

	public Departamento(int id, String nome, String regiao, String sigla, String funcao, String turnoServico) {
		super();
		this.id = id;
		this.nome = nome;
		this.regiao = regiao;
		this.sigla = sigla;
		this.funcao = funcao;
		this.turnoServico = turnoServico;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public String getTurnoServico() {
		return turnoServico;
	}


	public void setTurnoServico(String turnoServico) {
		this.turnoServico = turnoServico;
	}


	public String getRegiao() {
		return regiao;
	}


	public String getSigla() {
		return sigla;
	}
	
}
