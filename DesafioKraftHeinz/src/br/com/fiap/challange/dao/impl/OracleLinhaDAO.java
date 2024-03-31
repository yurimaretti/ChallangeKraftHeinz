package br.com.fiap.challange.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.challange.bean.Linha;
import br.com.fiap.challange.dao.LinhaDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.singleton.ConnectionManager;

public class OracleLinhaDAO implements LinhaDAO {

	private Connection conexao;
	
	@Override
	public void cadastrar(Linha linha) throws DBException {

		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO TAB_LINHA (CD_LINHA, NM_LINHA, TAB_FABRICA_CD_FABRICA, TAB_PRODUTO_CD_PRODUTO) VALUES (SEQ_TAB_LINHA.NEXTVAL, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, linha.getNome());
			stmt.setInt(2, linha.getCodigoFabrica());
			stmt.setInt(3, linha.getCodigoProduto());
			
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
