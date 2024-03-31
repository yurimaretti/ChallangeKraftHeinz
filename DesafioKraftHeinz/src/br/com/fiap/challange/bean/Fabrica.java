package br.com.fiap.challange.bean;

import java.io.Serializable;

public class Fabrica implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private int codigo;
	private String nome;
	private String cidade;
	private double quantidadeTonProd;
		
	public Fabrica() {
		super();
	}

	public Fabrica(int codigo, String nome, String cidade, double quantidadeTonProd) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.quantidadeTonProd = quantidadeTonProd;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public double getQuantidadeTonProd() {
		return quantidadeTonProd;
	}

	public void setQuantidadeTonProd(double quantidadeTonProd) {
		this.quantidadeTonProd = quantidadeTonProd;
	}
	
}
