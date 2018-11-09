package com.sdz.moteur;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		setType(TypeMoteur.ELECTRIQUE);
	}

}
