package com.sdz.main;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.sdz.garage.Garage;
import com.sdz.moteur.MoteurDiesel;
import com.sdz.moteur.MoteurElectrique;
import com.sdz.moteur.MoteurEssence;
import com.sdz.moteur.MoteurHybride;
import com.sdz.option.BarreDeToit;
import com.sdz.option.Climatisation;
import com.sdz.option.GPS;
import com.sdz.option.SiegeChauffant;
import com.sdz.option.VitreElectrique;
import com.sdz.voiture.A300B;
import com.sdz.voiture.D4;
import com.sdz.voiture.Lagouna;
import com.sdz.voiture.Vehicule;

public class Main {
    
	public static void main(String[] args) {
    	
    	ObjectInputStream ois;
        File fis= new File("garage.txt"); 
        Garage garage ;   
      
     try {
 
    	if (!fis.exists()) 
    	  {
    		 System.out.println("Aucune voiture sauvegardée");
    		 System.out.println("***********************************");
          	 System.out.println("* Garage Openclassrooms           *");
          	 System.out.println("***********************************");
    		 init();
    	  }
    	
    	else
    	 { 
    		 System.out.println("***********************************");
          	 System.out.println("* Garage Openclassrooms           *");
          	 System.out.println("***********************************");
          	 
    		ois = new ObjectInputStream(

                 new BufferedInputStream(

                   new FileInputStream(fis)));
    	    
    	   garage=(Garage)ois.readObject();
    	   ois.close();
    	   garage.afficher();
    	 }
    	    
   	 
     } catch (ClassNotFoundException e) {

         e.printStackTrace();

     } catch (FileNotFoundException e) {

	      e.printStackTrace();

     } catch (IOException e) {

	      e.printStackTrace();
	} 
    }
	
	static void init() {
		
		try {
			
			ObjectOutputStream	oos = new ObjectOutputStream(

			          new BufferedOutputStream(

			            new FileOutputStream(

			              new File("garage.txt"))));
			
		 Garage garage = new Garage();
		
		 Vehicule lag1 = new Lagouna();
	   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	 garage.addVoiture(lag1);
	   		 
	   	 Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 garage.addVoiture(A300B_2);
	   	 
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 garage.addVoiture(d4_1);   	 
	   	 
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 garage.addVoiture(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 garage.addVoiture(A300B_1);
	   	 
	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	 garage.addVoiture(d4_2);
			
		 oos.writeObject(garage);
		 oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
