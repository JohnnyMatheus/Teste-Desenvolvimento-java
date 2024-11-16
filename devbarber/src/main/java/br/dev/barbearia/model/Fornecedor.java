package br.dev.barbearia.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codforn;
	private String nomeforn;
	private String telforn;
	private String emailforn;
	private String enderecoforn;

	public Integer getCodforn() {
		return codforn;
	}

	public void setCodforn(Integer codforn) {
		this.codforn = codforn;
	}

	public String getNomeforn() {
		return nomeforn;
	}

	public void setNomeforn(String nomeforn) {
		this.nomeforn = nomeforn;
	}

	public String getTelforn() {
		return telforn;
	}

	public void setTelforn(String telforn) {
		this.telforn = telforn;
	}

	public String getEmailforn() {
		return emailforn;
	}

	public void setEmailforn(String emailforn) {
		this.emailforn = emailforn;
	}

	public String getEnderecoforn() {
		return enderecoforn;
	}

	public void setEnderecoforn(String enderecoforn) {
		this.enderecoforn = enderecoforn;
	}

}
