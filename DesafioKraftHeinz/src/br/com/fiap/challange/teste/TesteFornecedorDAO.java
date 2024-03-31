package br.com.fiap.challange.teste;

import br.com.fiap.challange.bean.Fornecedor;
import br.com.fiap.challange.dao.FornecedorDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.factory.DAOFactory;

public class TesteFornecedorDAO {

	public static void main(String[] args) {

		FornecedorDAO dao = DAOFactory.getFornecedorDAO();
		
		Fornecedor fornecedor = new Fornecedor(0, "Tomate do Jão");
		
		try {
			dao.cadastrar(fornecedor);
			System.out.println("Fornecedor cadastrado.");
		} catch (DBException e) {
			e.printStackTrace();
		}
		
	}

}
