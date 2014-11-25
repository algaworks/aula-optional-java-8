package com.algaworks.model;

import java.math.BigDecimal;

public class Seguro {

	private String cobertura;
	private BigDecimal valorFranquia;

	public Seguro(String cobertura, BigDecimal valorFranquia) {
		this.cobertura = cobertura;
		this.valorFranquia = valorFranquia;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public BigDecimal getValorFranquia() {
		return valorFranquia;
	}

	public void setValorFranquia(BigDecimal valorFranquia) {
		this.valorFranquia = valorFranquia;
	}

}
