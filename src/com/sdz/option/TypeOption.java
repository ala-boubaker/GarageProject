package com.sdz.option;

public enum TypeOption {
	
	GPS("GPS"),
	CLIMATISATION("Climatisation"),
	SIEGE_CHAUFFANT("Si�ge Chauffant"),
	VITRE_ELECTRIQUE("Vitre electrique"),
	BARRE_DE_TOIT("Barre de toit");
	
    private String name = "";
	
    TypeOption (String n){name = n;}

    public String toString() {return name;}
	
	
	

}
