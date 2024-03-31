package br.com.fiap.challange.teste;

import br.com.fiap.challange.bean.Linha;
import br.com.fiap.challange.dao.LinhaDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.factory.DAOFactory;

public class TesteLinhaDAO {

	public static void main(String[] args) {

		LinhaDAO dao = DAOFactory.getLinhaDAO();
		
		Linha linha = new Linha(0, "Atomatados", 1, 1);
		
		try {
			dao.cadastrar(linha);
			System.out.println("Linha cadastrada.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

}
