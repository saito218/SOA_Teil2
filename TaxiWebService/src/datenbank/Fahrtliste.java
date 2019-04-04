package datenbank;

import java.util.ArrayList;

import bean.Taxi;

public class Fahrtliste {

	ArrayList<Taxi> fahrtliste = new ArrayList<Taxi>();
	
	public Fahrtliste(){
		
		fahrtliste.add(new Taxi(4711, 18,"Frankfurt", "Offenbach", 10));
		fahrtliste.add(new Taxi(4712, 25,"Mainz", "Frankfurt", 45));
		fahrtliste.add(new Taxi(4713, 36,"Darmstadt", "Mainz", 50));
		fahrtliste.add(new Taxi(4714, 15,"Frankfurt", "Offenbach", 10));
		fahrtliste.add(new Taxi(4715, 29,"Frankfurt", "Offenbach", 10));
		fahrtliste.add(new Taxi(4716, 110,"Frankfurt", "Offenbach", 10));
		fahrtliste.add(new Taxi(4717, 14,"Frankfurt", "Offenbach", 10));
		fahrtliste.add(new Taxi(4718, 14,"Offenbach", "Frankfurt", 10));
		fahrtliste.add(new Taxi(4719, 14,"Frankfurt", "Mainz", 45));
		fahrtliste.add(new Taxi(4713, 14,"Mainz", "Darmstadt", 50));
		
	}

	public ArrayList<Taxi> getFahrtliste() {
		return fahrtliste;
	}

	public void setFahrtliste(ArrayList<Taxi> fahrtliste) {
		this.fahrtliste = fahrtliste;
	}
	
}
