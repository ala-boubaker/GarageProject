package com.sdz.voiture;

public enum NomVoiture {
	
	A300B("A300B"),
	D4("D4"),
	Lagouna("Lagouna");
	
    private String name = "";
	
    NomVoiture (String n){name = n;}

    public String toString() {return name;}

}
