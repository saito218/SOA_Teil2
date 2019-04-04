package bean;

import java.io.Serializable;

public class Taxi implements Serializable {

	private int cusId, datum, gefahreneKm;
	private String vonOrt, nachOrt;
	
	public Taxi() {
	}

	public Taxi(int cusId, int datum, String vonOrt, String nachOrt, int gefahreneKm) {
		this.cusId = cusId;
		this.datum = datum;
		this.gefahreneKm = gefahreneKm;
		this.vonOrt = vonOrt;
		this.nachOrt = nachOrt;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public int getDatum() {
		return datum;
	}

	public void setDatum(int datum) {
		this.datum = datum;
	}

	public int getGefahreneKm() {
		return gefahreneKm;
	}

	public void setGefahreneKm(int gefahreneKm) {
		this.gefahreneKm = gefahreneKm;
	}

	public String getVonOrt() {
		return vonOrt;
	}

	public void setVonOrt(String vonOrt) {
		this.vonOrt = vonOrt;
	}

	public String getNachOrt() {
		return nachOrt;
	}

	public void setNachOrt(String nachOrt) {
		this.nachOrt = nachOrt;
	}
}
