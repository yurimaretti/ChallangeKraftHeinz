package br.com.fiap.challange.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.challange.bean.Certificacao;
import br.com.fiap.challange.dao.CertificacaoDAO;
import br.com.fiap.challange.exception.DBException;
import br.com.fiap.challange.singleton.ConnectionManager;

public class OracleCerificacaoDAO implements CertificacaoDAO {

	private Connection conexao;
	
	@Override
	public void cadastrar(Certificacao certificacao) throws DBException {

		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO TAB_CERTIFICACAO (CD_CERTIFICACAO, NM_CERTIFICACAO) VALUES (SEQ_TAB_CERTIFICACAO.NEXTVAL, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, certificacao.getNome());
			
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
