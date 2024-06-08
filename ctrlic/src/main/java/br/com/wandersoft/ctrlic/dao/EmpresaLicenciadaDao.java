package br.com.wandersoft.ctrlic.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.wandersoft.ctrlic.modelo.EmpresaLicenciada;

public class EmpresaLicenciadaDao implements IDao<EmpresaLicenciada>, Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -5807352192389495323L;

	@Inject
	EntityManager manager;
	
	private DAO<EmpresaLicenciada> dao;
	
	@PostConstruct
	void init() {
		this.dao = new DAO<EmpresaLicenciada>(manager, EmpresaLicenciada.class);
	}

	@Override
	public void adiciona(EmpresaLicenciada t) {
		dao.adiciona(t);
		
	}

	
	@Override
	public void remove(EmpresaLicenciada t) {
		dao.remove(t);
	}

	@Override
	public void atualiza(EmpresaLicenciada t) {
		dao.atualiza(t);
		
	}

	@Override
	public List<EmpresaLicenciada> listaTodos() {
		return dao.listaTodos();
	}

	@Override
	public EmpresaLicenciada buscaPorId(Integer id) {
		
		return dao.buscaPorId(id);
	}

	@Override
	public List<EmpresaLicenciada> listaPaginada(int firstResult, int maxResults) {
		return dao.listaPaginada(firstResult, maxResults);
	}
	


	

}
