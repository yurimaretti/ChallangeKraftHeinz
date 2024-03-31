package br.com.fiap.challange.teste;

import br.com.fiap.challange.bean.Certificacao;
import br.com.fiap.challange.dao.CertificacaoDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.factory.DAOFactory;

public class TesteCertificacaoDAO {

	public static void main(String[] args) {

		CertificacaoDAO dao = DAOFactory.getCertificacaoDAO();
		
		Certificacao certificacao = new Certificacao(0, "ISO 22000");
		
		try {
			dao.cadastrar(certificacao);
			System.out.println("Certificação cadastrada.");
		} catch (DBException e) {
			e.printStackTrace();
		}
		
	}

}
