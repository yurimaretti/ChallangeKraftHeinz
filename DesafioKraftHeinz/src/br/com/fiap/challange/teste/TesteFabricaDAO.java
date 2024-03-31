package br.com.fiap.challange.teste;

import br.com.fiap.challange.bean.Fabrica;
import br.com.fiap.challange.dao.FabricaDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.factory.DAOFactory;

public class TesteFabricaDAO {

	public static void main(String[] args) {

		FabricaDAO dao = DAOFactory.getFabricaDAO();
	
		Fabrica fabrica = new Fabrica(0, "BR Spices", "Jandira", 110.55);
		
		try {
			dao.cadastrar(fabrica);
			System.out.println("Fábrica cadastrada!");
		} catch (DBException e) {
			e.printStackTrace();
		}
		
	}
}
