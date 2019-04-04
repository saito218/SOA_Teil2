package fahrtabruf;

import java.util.ArrayList;

import javax.jws.WebService;

import bean.Taxi;
import datenbank.Fahrtliste;

@WebService(targetNamespace = "http://fahrtabruf/", endpointInterface = "fahrtabruf.RueckmeldungSEI", portName = "RueckmeldungPort", serviceName = "RueckmeldungService")
public class Rueckmeldung implements RueckmeldungSEI {

	public ArrayList<Taxi> getFahrtlisteMitDatum (int datum){
		
		Fahrtliste fl = new Fahrtliste();
		
		
		ArrayList<Taxi> tempListe = new ArrayList<Taxi>();
		
		
		for(int i=0;i<fl.getFahrtliste().size();i++) {
			if(datum == fl.getFahrtliste().get(i).getDatum()) {
				tempListe.add(fl.getFahrtliste().get(i));
			}
		}

		return tempListe;
	}
	
	
}
