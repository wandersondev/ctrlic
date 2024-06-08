package br.com.wandersoft.ctrlic.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class EmpresaLicenciada extends Pessoa implements Serializable{

	/**
	 * @author Wanderson Santana Pinheiro
	 * Projeto: Controle de licenças
	 */
	private static final long serialVersionUID = 802311033541704156L;
	
	@OneToMany
	private List<Licenca> licencas;

	public List<Licenca> getLicencas() {
		return licencas;
	}

	public void setLicencas(List<Licenca> licencas) {
		this.licencas = licencas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(licencas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpresaLicenciada other = (EmpresaLicenciada) obj;
		return Objects.equals(licencas, other.licencas);
	}

	@Override
	public String toString() {
		return "EmpresaLicenciada [licencas=" + licencas + "]";
	}
	
	
	
}
