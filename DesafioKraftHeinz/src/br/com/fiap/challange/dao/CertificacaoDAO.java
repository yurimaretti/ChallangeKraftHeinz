package br.com.fiap.challange.dao;

import br.com.fiap.challange.bean.Certificacao;
import br.com.fiap.challange.exception.DBException;

public interface CertificacaoDAO {

	void cadastrar(Certificacao certificacao) throws DBException;
	
}
