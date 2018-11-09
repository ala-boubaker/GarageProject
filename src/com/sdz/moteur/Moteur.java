package com.sdz.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable{
	
	private TypeMoteur type;
	private String cylindre;
	private Double prix;
	
	
	public Moteur(String cylindre, Double prix) {
		super();
		this.cylindre = cylindre;
		this.prix = prix;
	}


	@Override
	public String toString() {
		StringBuffer  sb = new StringBuffer (); 
		return sb.append("Moteur ").append(this.getType().toString()).append(" ")
				.append(this.getCylindre().toString()).append(" ")
				.append("(").append(this.getPrix().toString()).append("€)").toString();
	}


	public TypeMoteur getType() {
		return type;
	}


	public void setType(TypeMoteur type) {
		this.type = type;
	}


	public String getCylindre() {
		return cylindre;
	}


	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}


	public Double getPrix() {
		return prix;
	}
	
	

}
