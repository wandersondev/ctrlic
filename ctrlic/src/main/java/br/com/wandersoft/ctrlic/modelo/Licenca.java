package br.com.wandersoft.ctrlic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Licenca implements Serializable {

	
	/**
	 * @author Wanderson Santana Pinheiro
	 * Projeto: Controle de licenças
	 */
	private static final long serialVersionUID = 1535046727577037749L;
	
	@Id
	@SequenceGenerator(name = "licenca_id_seq", sequenceName = "licenca_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "licenca_id_seq")
	private Integer id;
	@Temporal(TemporalType.DATE)
	private Calendar dataCadastro = Calendar.getInstance();
	@Temporal(TemporalType.DATE)
	private Calendar dataValidade = Calendar.getInstance();
	private boolean bloqueia;
	private Integer quantidadeTerminais;
	@ManyToOne
	private Classificacao classificacao;
	@OneToMany
	private List<Terminal> terminais = new ArrayList<Terminal>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Calendar getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	public boolean isBloqueia() {
		return bloqueia;
	}
	public void setBloqueia(boolean bloqueia) {
		this.bloqueia = bloqueia;
	}
	public Integer getQuantidadeTerminais() {
		return quantidadeTerminais;
	}
	public void setQuantidadeTerminais(Integer quantidadeTerminais) {
		this.quantidadeTerminais = quantidadeTerminais;
	}
	public List<Terminal> getTerminais() {
		return terminais;
	}
	public void setTerminais(List<Terminal> terminais) {
		this.terminais = terminais;
	}
	
}
