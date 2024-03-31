package br.com.fiap.challange.dao;

import br.com.fiap.challange.bean.Linha;
import br.com.fiap.challange.exception.DBException;

public interface LinhaDAO {

	void cadastrar(Linha linha) throws DBException;
	
}
