package br.com.fiap.challange.teste;

import java.util.Calendar;
import br.com.fiap.challange.bean.ListaCertificacoes;
import br.com.fiap.challange.dao.ListaCertificacoesDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.factory.DAOFactory;

public class TesteListaCertificacaoes {

	public static void main(String[] args) {

		ListaCertificacoesDAO dao = DAOFactory.getListaCertificacoesDAO();
		
		ListaCertificacoes lista = new ListaCertificacoes(1, 1, Calendar.getInstance());
		
		try {
			dao.cadastrar(lista);
			System.out.println("Lista cadastrada.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

}
