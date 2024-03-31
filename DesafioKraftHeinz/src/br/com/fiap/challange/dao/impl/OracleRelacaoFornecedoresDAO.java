package br.com.fiap.challange.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.challange.bean.RelacaoFornecedores;
import br.com.fiap.challange.dao.RelacaoFornecedoresDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.singleton.ConnectionManager;

public class OracleRelacaoFornecedoresDAO implements RelacaoFornecedoresDAO {

	private Connection conexao;
	
	@Override
	public void cadastrar(RelacaoFornecedores relacaoFornecedores) throws DBException {

		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO TAB_FABRICA_FORNECEDOR (TAB_FABRICA_CD_FABRICA, TAB_FORNEC_CD_FORNECEDOR) VALUES (?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, relacaoFornecedores.getCodigoFabrica());
			stmt.setInt(2, relacaoFornecedores.getCodigoFornecedor());
			
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
