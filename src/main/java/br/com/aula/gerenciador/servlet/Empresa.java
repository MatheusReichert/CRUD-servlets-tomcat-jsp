package br.com.aula.gerenciador.servlet;

import java.util.Date;

public class Empresa {

	private String nome;
	private int id;
	private Date dataDeAbertura;

	public Empresa(String nome, int id, Date dataDeAbertura) {
		this.nome = nome;
		this.id = id;
		this.dataDeAbertura = dataDeAbertura;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public Date getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Date dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public void setNome(String nomeEmpresa) {
		this.nome = nomeEmpresa;
		
	}

}
