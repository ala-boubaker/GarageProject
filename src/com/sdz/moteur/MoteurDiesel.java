package com.sdz.moteur;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		setType(TypeMoteur.DIESEL);
	}

}
