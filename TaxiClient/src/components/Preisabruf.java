package components;

import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.google.gson.Gson;

public class Preisabruf {

	public Preisabruf(ArrayList<Kundenfahrt> kundenliste) {

		ArrayList<Integer> entfernung = new ArrayList<Integer>();

		for (Kundenfahrt k : kundenliste) {
			entfernung.add(k.getFahrtInformation().getGefahreneKm());
		}

		Gson gson = new Gson();

		String url = "http://localhost:8080/PreisrechnerWS/jaxrs/preisrueckgabe/" + gson.toJson(entfernung);

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target(url);

		String response = target.request("application/json").get(String.class);

		double [] preisliste = gson.fromJson(response, double[].class);
 		
		for(int i=0;i<kundenliste.size();i++) {
			kundenliste.get(i).setPreis(preisliste[i]);
		}
	}

}
