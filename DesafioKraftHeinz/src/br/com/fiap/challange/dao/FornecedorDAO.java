package br.com.fiap.challange.dao;

import br.com.fiap.challange.bean.Fornecedor;
import br.com.fiap.challange.exception.DBException;

public interface FornecedorDAO {

	void cadastrar (Fornecedor fornecedor) throws DBException;
	
}
