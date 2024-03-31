package br.com.fiap.challange.dao;

import br.com.fiap.challange.bean.ListaCertificacoes;
import br.com.fiap.challange.exception.DBException;

public interface ListaCertificacoesDAO {

	void cadastrar(ListaCertificacoes listaCertificacoes) throws DBException;
	
}
