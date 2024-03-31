package br.com.fiap.challange.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.challange.bean.Produto;
import br.com.fiap.challange.dao.ProdutoDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.singleton.ConnectionManager;

public class OracleProdutoDAO implements ProdutoDAO {

	private Connection conexao;
	
	@Override
	public void cadastrar(Produto produto) throws DBException {

		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO TAB_PRODUTO (CD_PRODUTO, NM_PRODUTO, GST_ENERGIA, GST_AGUA, PRC_PERDA) VALUES (SEQ_TAB_PRODUTO.NEXTVAL, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getGastoEnergia());
			stmt.setDouble(3, produto.getGastoAgua());
			stmt.setDouble(4, produto.getPorcentagemPerda());

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
