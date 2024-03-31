package br.com.fiap.challange.teste;

import br.com.fiap.challange.bean.RelacaoFornecedores;
import br.com.fiap.challange.dao.RelacaoFornecedoresDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.factory.DAOFactory;

public class TesteRelacaoFornecedoresDAO {

	public static void main(String[] args) {

		RelacaoFornecedoresDAO dao = DAOFactory.getRelacaoFornecedoresDAO();
		
		RelacaoFornecedores relacao = new RelacaoFornecedores(1, 1);
		
		try {
			dao.cadastrar(relacao);
			System.out.println("Relação de forncedores cadastrada.");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

}
