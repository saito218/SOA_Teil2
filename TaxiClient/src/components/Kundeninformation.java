package components;

import java.util.ArrayList;

import com.sap.persistence.j.Jc;
import com.sap.persistence.j.Jcus;

import fahrtabruf.Taxi;

public class Kundeninformation {
	
	private ArrayList<Kundenfahrt> kundenliste = new ArrayList<Kundenfahrt>();
	
	public Kundeninformation(ArrayList<Taxi> taxiliste){
        Jc ss = new Jc();
        Jcus port = ss.getJcusPort();
		
        for(Taxi k : taxiliste) {
        	kundenliste.add(new Kundenfahrt(port.findCUSTOMERByCusId(k.getCusId()).get(0),k));
        }
	}

	public ArrayList<Kundenfahrt> getKundenliste() {
		return kundenliste;
	}

	public void setKundenliste(ArrayList<Kundenfahrt> kundenliste) {
		this.kundenliste = kundenliste;
	}
	
	
}
