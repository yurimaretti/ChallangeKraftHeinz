package br.com.fiap.challange.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.challange.bean.ListaCertificacoes;
import br.com.fiap.challange.dao.ListaCertificacoesDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.singleton.ConnectionManager;

public class OracleListaCertificacoesDAO implements ListaCertificacoesDAO {

	private Connection conexao;
	
	@Override
	public void cadastrar(ListaCertificacoes listaCertificacoes) throws DBException {

		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO TAB_FORNECEDOR_CERTIFICACAO (T_FORNEC_CD_FORNECEDOR, T_CERTIF_CD_CERTIFICACAO, DT_VALIDADE) VALUES (?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, listaCertificacoes.getCodigoFornecedor());
			stmt.setInt(2, listaCertificacoes.getCodigoCertificacao());
			java.sql.Date data = new java.sql.Date(listaCertificacoes.getDataValidade().getTimeInMillis());
			stmt.setDate(3, data);
			
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
