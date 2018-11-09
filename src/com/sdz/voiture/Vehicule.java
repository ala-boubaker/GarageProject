package com.sdz.voiture;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sdz.moteur.Moteur;
import com.sdz.option.Option;

public abstract class Vehicule implements Serializable {
	
	private Double prix;
	private Double prixOptions;
	private NomVoiture nomVoiture;
	private List<Option> options;
	private Marque nomMarque;
	private Moteur moteur;
		
	public Vehicule() {
		prixOptions=0d;
		prix=0d;
		options= new ArrayList<Option>();
	}
	
	
	@Override
	public String toString() {
		StringBuffer  sb = new StringBuffer (); 
		return sb.append("+ Voiture ").append(this.getNomMarque().toString()).append(" : ")
				.append(this.getNomVoiture().toString()).append(" ")
				.append(this.getMoteur().toString()).append(" ")
				.append(afficherListOptions(options).toString())
				.append("d´une valeur totale de ")
				.append(getPrix().toString()).append("€")
				.append("\n").toString();
	}


	public NomVoiture getNomVoiture() {
		return nomVoiture;
	}

	public void setNomVoiture(NomVoiture nomVoiture) {
		this.nomVoiture = nomVoiture;
	}


	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public List<Option> getOptions() {
		
		return options;
	}

	public void addOption(Option opt){
		options.add(opt);
	}

	public Double getPrix() {
		return getPrixOptions()+moteur.getPrix();
	}

	
	public Double getPrixOptions() {
		
		for (Option option:options) {
			prixOptions+=option.getPrix();
		}
		return prixOptions;
	}


	public void setPrixOptions(Double prixOptions) {
		this.prixOptions = prixOptions;
	}


	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public Moteur getMoteur() {
		return moteur;
	}
	
	
	 public String afficherListOptions(List<Option> options) {
		StringBuffer  sb = new StringBuffer (); 
		 sb.append("[");
		int i=0;
		for (Option option:options) {
			i++;
			sb.append(option.getTypeOption().toString()).append("(").append(option.getPrix().toString()).append("€)");
			if(i<options.size())
			sb.append(",");
		}
		sb.append("]");
		//System.out.println(sb.toString());
		return sb.toString();
		 
	 }
	

}
