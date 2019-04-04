package mainpkg;

import java.util.Scanner;

import components.Kundeninformation;
import components.Preisabruf;
import components.Taxiliste;

public class MyClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Datum eingeben:");
		int datum = sc.nextInt();
		
		Taxiliste t = new Taxiliste(datum);
		if(t.getTaxiliste().size() != 0) {
		Kundeninformation k = new Kundeninformation(t.getTaxiliste());
		
		new Preisabruf(k.getKundenliste());
		
		for(int i=0;i<k.getKundenliste().size();i++) {
		System.out.println("Fahrt "+ (i+1));
		System.out.println("Kundennummer: "+k.getKundenliste().get(i).getKunde().getCusId());
		System.out.println("Name: "+k.getKundenliste().get(i).getKunde().getName());
		System.out.println("Adresse: "+k.getKundenliste().get(i).getKunde().getAddress());
		
		System.out.println("\nAbfahrtsort: "+k.getKundenliste().get(i).getFahrtInformation().getVonOrt());
		
		System.out.println("Fahrtziel: "+k.getKundenliste().get(i).getFahrtInformation().getNachOrt());
		
		System.out.println("Entfernung: "+k.getKundenliste().get(i).getFahrtInformation().getGefahreneKm()+" Km");
		
		System.out.println("Preis: "+k.getKundenliste().get(i).getPreis()+" EUR \n");
			
		}
		
		}else {
			System.out.println("Keine Fahrten für dieses Datum enthalten.");
		}
		
		
	}

}
