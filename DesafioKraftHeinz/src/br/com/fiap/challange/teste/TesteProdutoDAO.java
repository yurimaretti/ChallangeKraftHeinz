package br.com.fiap.challange.teste;

import br.com.fiap.challange.bean.Produto;
import br.com.fiap.challange.dao.ProdutoDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.factory.DAOFactory;

public class TesteProdutoDAO {

	public static void main(String[] args) {

		ProdutoDAO dao = DAOFactory.getProdutoDAO();
		
		Produto produto = new Produto(0, "Ketchup", 11.2, 5.1, 23.76);
		
		try {
			dao.cadastrar(produto);
			System.out.println("Produto cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
		
	}

}
