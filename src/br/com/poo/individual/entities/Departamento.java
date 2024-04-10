package br.com.poo.individual.entities;

import java.util.HashMap;
import java.util.Map;

public class Departamento {

	private Integer id;
	private String nome;
	private String regiao;
	private String sigla;
	private String funcao;
	private String turnoServico;
	
	
	static Map<Integer, Departamento> mapaDepartamento = new HashMap<>();
	
	public Departamento() {
		super();
	
	}
	

	public Departamento(Integer id, String nome, String regiao, String sigla, String funcao, String turnoServico) {
		super();
		this.id = id;
		this.nome = nome;
		this.regiao = regiao;
		this.sigla = sigla;
		this.funcao = funcao;
		this.turnoServico = turnoServico;
	}


	public Integer getId() {
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


	public static Map<Integer, Departamento> getMapaDepartamento() {
		return mapaDepartamento;
	}


	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + ", regiao=" + regiao + ", sigla=" + sigla + ", funcao="
				+ funcao + ", turnoServico=" + turnoServico + "]";
	}
	
}
