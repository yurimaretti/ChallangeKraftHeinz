package br.com.fiap.challange.dao;

import br.com.fiap.challange.bean.Produto;
import br.com.fiap.challange.exception.DBException;

public interface ProdutoDAO {

	void cadastrar (Produto produto) throws DBException;
	
}
