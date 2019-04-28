package com.srm.credito;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.srm.credito.business.ClienteCreditoBusiness;
import com.srm.credito.entity.ClienteCredito;
import com.srm.credito.enumeration.EnumTipoRisco;

public class AllTestes {

	
	
	private ClienteCreditoBusiness business = new ClienteCreditoBusiness();
	
	private ClienteCredito c1 = new ClienteCredito();
	
	
	@Test
	public void testTipoACorreto() {
		c1.setNome("A");
		c1.setRisco(EnumTipoRisco.A);
		assertEquals(new BigDecimal(Integer.valueOf(1)), this.business.obterTaxaClienteCredito(c1));
	}

	
	@Test
	public void testTipoBCorreto() {
		c1.setNome("B");
		c1.setRisco(EnumTipoRisco.B);
		assertEquals(new BigDecimal(Double.valueOf(0.1)), this.business.obterTaxaClienteCredito(c1));
	}
	
	@Test
	public void testTipoCCorreto() {
		c1.setNome("C");
		c1.setRisco(EnumTipoRisco.C);
		assertEquals(new BigDecimal(Double.valueOf(0.2)), this.business.obterTaxaClienteCredito(c1));
	}
}
