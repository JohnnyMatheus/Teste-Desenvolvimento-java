package br.dev.barbearia.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "servico")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codserv;
    private String nomeserv;
    private String descserv;
    private Double precoserv;
	public Integer getCodserv() {
		return codserv;
	}
	public void setCodserv(Integer codserv) {
		this.codserv = codserv;
	}
	public String getNomeserv() {
		return nomeserv;
	}
	public void setNomeserv(String nomeserv) {
		this.nomeserv = nomeserv;
	}
	public String getDescserv() {
		return descserv;
	}
	public void setDescserv(String descserv) {
		this.descserv = descserv;
	}
	public Double getPrecoserv() {
		return precoserv;
	}
	public void setPrecoserv(Double precoserv) {
		this.precoserv = precoserv;
	}
    
}
