package com.sdz.voiture;

public enum Marque {
	
	RENO ("RENO"),
	PIGEOT("PIGEOT"),
	TROEN("TROEN");
	
	private String name = "";
	
	Marque (String n){name = n;}

    public String toString() {return name;}

}
