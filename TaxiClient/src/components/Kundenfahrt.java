package components;

import com.sap.persistence.j.Customer;

import fahrtabruf.Taxi;

public class Kundenfahrt {

	private Customer kunde;
	private Taxi fahrtInformation;
	private double Preis;

	public Kundenfahrt(Customer kunde, Taxi fahrtInformation) {
		this.kunde = kunde;
		this.fahrtInformation = fahrtInformation;
	}

	public Customer getKunde() {
		return kunde;
	}

	public void setKunde(Customer kunde) {
		this.kunde = kunde;
	}

	public Taxi getFahrtInformation() {
		return fahrtInformation;
	}

	public void setFahrtInformation(Taxi fahrtInformation) {
		this.fahrtInformation = fahrtInformation;
	}

	public double getPreis() {
		return Preis;
	}

	public void setPreis(double preis) {
		Preis = preis;
	}

}
