package br.com.fiap.challange.bean;

import java.io.Serializable;

public class Fornecedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nome;
	
	public Fornecedor() {
		super();
	}
	public Fornecedor(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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
	
}
