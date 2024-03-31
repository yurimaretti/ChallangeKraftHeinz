package br.com.fiap.challange.dao;

import br.com.fiap.challange.bean.Fabrica;
import br.com.fiap.challange.exception.DBException;

public interface FabricaDAO {

	void cadastrar (Fabrica fabrica) throws DBException;
	
}
