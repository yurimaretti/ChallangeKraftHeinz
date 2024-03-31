package br.com.fiap.challange.dao;

import br.com.fiap.challange.bean.RelacaoFornecedores;
import br.com.fiap.challange.exception.DBException;

public interface RelacaoFornecedoresDAO {

	void cadastrar(RelacaoFornecedores relacaoFornecedores) throws DBException;
	
}
