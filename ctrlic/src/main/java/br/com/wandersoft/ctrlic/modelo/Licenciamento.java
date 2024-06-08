package br.com.wandersoft.ctrlic.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;



@Entity
public class Licenciamento implements Serializable {
	
	/**
	 * @author Wanderson Santana Pinheiro
	 * Projeto: Controle de licenças
	 */
	private static final long serialVersionUID = 9206106933568257203L;
	@Id
	private Integer id;
	@OneToOne
	private EmpresaLicenciada empresaLicenciada;
	@ManyToMany
	private List<Licenca> licencas;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public EmpresaLicenciada getEmpresaLicenciada() {
		return empresaLicenciada;
	}
	public void setEmpresaLicenciada(EmpresaLicenciada empresaLicenciada) {
		this.empresaLicenciada = empresaLicenciada;
	}
	public List<Licenca> getLicencas() {
		return licencas;
	}
	public void setLicencas(List<Licenca> licencas) {
		this.licencas = licencas;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empresaLicenciada, id, licencas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Licenciamento other = (Licenciamento) obj;
		return Objects.equals(empresaLicenciada, other.empresaLicenciada) && Objects.equals(id, other.id)
				&& Objects.equals(licencas, other.licencas);
	}
	@Override
	public String toString() {
		return "Licenciamento [id=" + id + ", empresaLicenciada=" + empresaLicenciada + ", licencas=" + licencas + "]";
	}
}
