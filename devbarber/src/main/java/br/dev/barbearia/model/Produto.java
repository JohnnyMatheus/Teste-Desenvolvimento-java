package br.dev.barbearia.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codprod;
    private String nomeprod;
    private String descprod;
    private Integer qtdprod;
    private Double precoprod;

    @ManyToOne
    @JoinColumn(name = "fornecedorcodforn")
    private Fornecedor fornecedor;

	public Integer getCodprod() {
		return codprod;
	}

	public void setCodprod(Integer codprod) {
		this.codprod = codprod;
	}

	public String getNomeprod() {
		return nomeprod;
	}

	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public String getDescprod() {
		return descprod;
	}

	public void setDescprod(String descprod) {
		this.descprod = descprod;
	}

	public Integer getQtdprod() {
		return qtdprod;
	}

	public void setQtdprod(Integer qtdprod) {
		this.qtdprod = qtdprod;
	}

	public Double getPrecoprod() {
		return precoprod;
	}

	public void setPrecoprod(Double precoprod) {
		this.precoprod = precoprod;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
    
}
