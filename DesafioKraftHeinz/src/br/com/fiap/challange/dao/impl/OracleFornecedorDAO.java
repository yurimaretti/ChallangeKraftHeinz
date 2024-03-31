package br.com.fiap.challange.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.challange.bean.Fornecedor;
import br.com.fiap.challange.dao.FornecedorDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.singleton.ConnectionManager;

public class OracleFornecedorDAO implements FornecedorDAO {

	private Connection conexao;
	
	@Override
	public void cadastrar(Fornecedor fornecedor) throws DBException {
	
		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO TAB_FORNECEDOR (CD_FORNECEDOR, NM_FORNECEDOR) VALUES (SEQ_TAB_FORNECEDOR.NEXTVAL, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, fornecedor.getNome());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastrar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
