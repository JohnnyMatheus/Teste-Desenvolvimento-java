package br.dev.barbearia.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codfun;
	private String nomefun;
	private String telfun;
	private String emailfun;
	private String cargofun;
	private Double salariofun;

	public Integer getCodfun() {
		return codfun;
	}

	public void setCodfun(Integer codfun) {
		this.codfun = codfun;
	}

	public String getNomefun() {
		return nomefun;
	}

	public void setNomefun(String nomefun) {
		this.nomefun = nomefun;
	}

	public String getTelfun() {
		return telfun;
	}

	public void setTelfun(String telfun) {
		this.telfun = telfun;
	}

	public String getEmailfun() {
		return emailfun;
	}

	public void setEmailfun(String emailfun) {
		this.emailfun = emailfun;
	}

	public String getCargofun() {
		return cargofun;
	}

	public void setCargofun(String cargofun) {
		this.cargofun = cargofun;
	}

	public Double getSalariofun() {
		return salariofun;
	}

	public void setSalariofun(Double salariofun) {
		this.salariofun = salariofun;
	}
}
