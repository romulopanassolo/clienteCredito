package com.srm.credito.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.srm.credito.enumeration.EnumTipoRisco;


@Entity
public class ClienteCredito{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private	BigDecimal limite ;
	
	@Enumerated(EnumType.STRING)
	private EnumTipoRisco risco;
	
	
	private BigDecimal taxa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

	public EnumTipoRisco getRisco() {
		return risco;
	}

	public void setRisco(EnumTipoRisco risco) {
		this.risco = risco;
	}

	public BigDecimal getTaxa() {
		switch(this.risco.toString()) {
		case "A" : return new BigDecimal(Integer.valueOf(1)); 
		case "B" : return new BigDecimal(Double.valueOf(0.1));
		case "C" : return new BigDecimal(Double.valueOf(0.2));
		default : return new BigDecimal(Integer.valueOf(1));
		}
	}

	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((limite == null) ? 0 : limite.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((risco == null) ? 0 : risco.hashCode());
		result = prime * result + ((taxa == null) ? 0 : taxa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteCredito other = (ClienteCredito) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (limite == null) {
			if (other.limite != null)
				return false;
		} else if (!limite.equals(other.limite))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (risco != other.risco)
			return false;
		if (taxa == null) {
			if (other.taxa != null)
				return false;
		} else if (!taxa.equals(other.taxa))
			return false;
		return true;
	}

	

}
