package com.sdz.moteur;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		setType(TypeMoteur.ESSENCE);
	}

}
