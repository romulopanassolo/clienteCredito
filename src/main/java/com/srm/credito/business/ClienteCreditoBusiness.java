package com.srm.credito.business;

import java.math.BigDecimal;

import javax.annotation.ManagedBean;

import com.srm.credito.entity.ClienteCredito;

@ManagedBean
public class ClienteCreditoBusiness {
	
	
	public BigDecimal obterTaxaClienteCredito(ClienteCredito clienteCredito) {
		
		if(clienteCredito!=null && clienteCredito.getRisco()!=null){
			return clienteCredito.getTaxa();
		}
		
		return new BigDecimal(Integer.valueOf(1));
	}

}
