package rechner;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.*;

@Path("/preisrueckgabe/")
public class Preisrueckgabe {

	@GET
	@Produces("application/json")
	@Path("{liste}")
	public String getPreisliste(@PathParam("liste") String kundenliste) {

		System.out.println("PreisService gestartet.");
		System.out.println(kundenliste);

		ArrayList<Double> pListe = new ArrayList<Double>();
		int[] kListe = new Gson().fromJson(kundenliste, int[].class);

		for (int k : kListe) {
			pListe.add(berechnePreis(k));
		}

		return new Gson().toJson(pListe);

	}

	private double berechnePreis(int entfernung) {
		double preis = 0;

		if (entfernung < 20) {
			preis = 8;
		} else if (entfernung < 30) {
			preis = 4.11 + (entfernung * 1.07);
		} else {
			preis = 4.11 + (entfernung * 0.63);
		}

		return preis;
	}

}
