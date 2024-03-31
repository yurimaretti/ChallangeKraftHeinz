package br.com.fiap.challange.bean;

import java.io.Serializable;
import java.util.Calendar;

public class ListaCertificacoes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int codigoFornecedor;
	private int codigoCertificacao;
	private Calendar dataValidade;
	
	public ListaCertificacoes() {
		super();
	}
	
	public ListaCertificacoes(int codigoFornecedor, int codigoCertificacao, Calendar dataValidade) {
		super();
		this.codigoFornecedor = codigoFornecedor;
		this.codigoCertificacao = codigoCertificacao;
		this.dataValidade = dataValidade;
	}

	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public int getCodigoCertificacao() {
		return codigoCertificacao;
	}

	public void setCodigoCertificacao(int codigoCertificacao) {
		this.codigoCertificacao = codigoCertificacao;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	
}
