package com.sdz.moteur;

public enum TypeMoteur {
	
	
	DIESEL("DIESEL"),
	ESSENCE("ESSENCE"),
	HYBRIDE("HYBRIDE"),
	ELECTRIQUE("ELECTRIQUE");
	
	private String name = "";
	
	TypeMoteur (String n){name = n;}

    public String toString() {return name;}

}
