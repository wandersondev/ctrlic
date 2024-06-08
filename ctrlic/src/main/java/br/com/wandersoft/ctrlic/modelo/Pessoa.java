package br.com.wandersoft.ctrlic.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class Pessoa implements Serializable {

	/**
	 * @author Wanderson Santana Pinheiro
	 * Projeto: Controle de licenças
	 */
	private static final long serialVersionUID = 3259748512281298142L;
	
	@Id
	@SequenceGenerator(name = "pessoa_id_seq", sequenceName = "pessoa_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "pessoa_id_seq")
	private Integer id;
	private String razaoSocial;
	private String cnpj;
	private String endereco;
	private String cidade;
	private String uf;
	private String cep;
	private String bairro;
	private String email;
	private String fone;
	@Temporal(TemporalType.DATE)
	private Calendar dataCadastro = Calendar.getInstance();

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, cnpj, dataCadastro, email, endereco, fone, id, razaoSocial, uf);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(cnpj, other.cnpj)
				&& Objects.equals(dataCadastro, other.dataCadastro) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(fone, other.fone)
				&& Objects.equals(id, other.id) && Objects.equals(razaoSocial, other.razaoSocial)
				&& Objects.equals(uf, other.uf);
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", endereco=" + endereco
				+ ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + ", bairro=" + bairro + ", email=" + email
				+ ", fone=" + fone + ", dataCadastro=" + dataCadastro + "]";
	}
	
	

}
