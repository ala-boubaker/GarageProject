package com.sdz.garage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sdz.voiture.Vehicule;

public class Garage implements Serializable {
	
	private List<Vehicule> voitures;

	public Garage () {
		voitures=new ArrayList<Vehicule>();
	}
	
	

	public void addVoiture(Vehicule voit) {
		voitures.add(voit);
		
	}
	
	//List<? extends Vehicule> list
	public void afficher(){

		  for( Vehicule v : voitures)

		    System.out.print(v.toString());

		}
	
}
