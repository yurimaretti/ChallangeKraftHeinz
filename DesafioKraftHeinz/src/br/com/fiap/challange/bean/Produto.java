package br.com.fiap.challange.bean;

import java.io.Serializable;

public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nome;
	private double gastoEnergia;
	private double gastoAgua;
	private double porcentagemPerda;
	
	public Produto() {
		super();
	}
	
	public Produto(int codigo, String nome, double gastoEnergia, double gastoAgua, double porcentagemPerda) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.gastoEnergia = gastoEnergia;
		this.gastoAgua = gastoAgua;
		this.porcentagemPerda = porcentagemPerda;
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

	public double getGastoEnergia() {
		return gastoEnergia;
	}

	public void setGastoEnergia(double gastoEnergia) {
		this.gastoEnergia = gastoEnergia;
	}

	public double getGastoAgua() {
		return gastoAgua;
	}

	public void setGastoAgua(double gastoAgua) {
		this.gastoAgua = gastoAgua;
	}

	public double getPorcentagemPerda() {
		return porcentagemPerda;
	}

	public void setPorcentagemPerda(double porcentagemPerda) {
		this.porcentagemPerda = porcentagemPerda;
	}
	
}
