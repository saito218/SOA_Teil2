package components;

import java.util.ArrayList;

import fahrtabruf.RueckmeldungSEI;
import fahrtabruf.RueckmeldungService;
import fahrtabruf.Taxi;

public class Taxiliste {
	

    private ArrayList<Taxi> taxiliste;
    
    public Taxiliste(int datum){
        RueckmeldungService ss = new RueckmeldungService();
        RueckmeldungSEI port = ss.getRueckmeldungPort();
        
    	taxiliste = (ArrayList<Taxi>) port.getFahrtlisteMitDatum(datum);
    }


	public ArrayList<Taxi> getTaxiliste() {
		return taxiliste;
	}


	public void setTaxiliste(ArrayList<Taxi> taxiliste) {
		this.taxiliste = taxiliste;
	}
    
    
    
    
}
