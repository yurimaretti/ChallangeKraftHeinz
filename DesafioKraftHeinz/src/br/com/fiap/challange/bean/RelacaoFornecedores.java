package br.com.fiap.challange.bean;

import java.io.Serializable;

public class RelacaoFornecedores implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int codigoFabrica;
	private int codigoFornecedor;
	
	public RelacaoFornecedores() {
		super();
	}
	
	public RelacaoFornecedores(int codigoFabrica, int codigoFornecedor) {
		super();
		this.codigoFabrica = codigoFabrica;
		this.codigoFornecedor = codigoFornecedor;
	}

	public int getCodigoFabrica() {
		return codigoFabrica;
	}

	public void setCodigoFabrica(int codigoFabrica) {
		this.codigoFabrica = codigoFabrica;
	}

	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}
	
}
