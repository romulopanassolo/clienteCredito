package com.srm.credito.enumeration;

public enum EnumTipoRisco {

	A("A"),B("B"),C("C");
	
	private String value;

	
	EnumTipoRisco(String value){
		this.value = value;
	}
	
	public String value() {
		
		return value;
	}

	
	
	
	
	
}
