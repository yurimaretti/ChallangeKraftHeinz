package br.com.fiap.challange.factory;

import br.com.fiap.challange.dao.CertificacaoDAO;
import br.com.fiap.challange.dao.FabricaDAO;
import br.com.fiap.challange.dao.FornecedorDAO;
import br.com.fiap.challange.dao.LinhaDAO;
import br.com.fiap.challange.dao.ListaCertificacoesDAO;
import br.com.fiap.challange.dao.ProdutoDAO;
import br.com.fiap.challange.dao.RelacaoFornecedoresDAO;
import br.com.fiap.challange.dao.impl.OracleCerificacaoDAO;
import br.com.fiap.challange.dao.impl.OracleFabricaDAO;
import br.com.fiap.challange.dao.impl.OracleFornecedorDAO;
import br.com.fiap.challange.dao.impl.OracleLinhaDAO;
import br.com.fiap.challange.dao.impl.OracleListaCertificacoesDAO;
import br.com.fiap.challange.dao.impl.OracleProdutoDAO;
import br.com.fiap.challange.dao.impl.OracleRelacaoFornecedoresDAO;

public class DAOFactory {

	public static FabricaDAO getFabricaDAO() {
		return new OracleFabricaDAO();
	}
	
	public static ProdutoDAO getProdutoDAO() {
		return new OracleProdutoDAO();
	}
	
	public static FornecedorDAO getFornecedorDAO() {
		return new OracleFornecedorDAO();
	}
	
	public static CertificacaoDAO getCertificacaoDAO() {
		return new OracleCerificacaoDAO();
	}
	
	public static LinhaDAO getLinhaDAO() {
		return new OracleLinhaDAO();
	}
	
	public static RelacaoFornecedoresDAO getRelacaoFornecedoresDAO() {
		return new OracleRelacaoFornecedoresDAO();
	}
	
	public static ListaCertificacoesDAO getListaCertificacoesDAO() {
		return new OracleListaCertificacoesDAO();
	}
}
