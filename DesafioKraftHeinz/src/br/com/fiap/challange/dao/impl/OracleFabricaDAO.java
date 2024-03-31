package br.com.fiap.challange.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.challange.bean.Fabrica;
import br.com.fiap.challange.dao.FabricaDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.singleton.ConnectionManager;

public class OracleFabricaDAO implements FabricaDAO {
	
	private Connection conexao;
	
	@Override
	public void cadastrar(Fabrica fabrica) throws DBException {
		
		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO TAB_FABRICA (CD_FABRICA, NM_FABRICA, DS_CIDADE, QT_TON_PRODUCAO) VALUES (SEQ_TAB_FABRICA.NEXTVAL, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, fabrica.getNome());
			stmt.setString(2, fabrica.getCidade());
			stmt.setDouble(3, fabrica.getQuantidadeTonProd());

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
