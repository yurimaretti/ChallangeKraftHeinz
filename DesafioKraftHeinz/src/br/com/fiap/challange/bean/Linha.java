package br.com.fiap.challange.bean;

import java.io.Serializable;

public class Linha implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nome;
	private int codigoFabrica;
	private int codigoProduto;
	
	public Linha() {
		super();
	}
	
	public Linha(int codigo, String nome, int codigoFabrica, int codigoProduto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.codigoFabrica = codigoFabrica;
		this.codigoProduto = codigoProduto;
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

	public int getCodigoFabrica() {
		return codigoFabrica;
	}

	public void setCodigoFabrica(int codigoFabrica) {
		this.codigoFabrica = codigoFabrica;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
}
