package com.sap.persistence.j;

public class MuenchenClient {

	public static void main(String[] args) {

		Jc ss = new Jc();
		Jcus port = ss.getJcusPort();

		for (int i = 0; i < port.findAllCUSTOMER().size(); i++) {
			System.out.println(port.findAllCUSTOMER().get(i).getName());
			System.out.println(port.findAllCUSTOMER().get(i).getCusId());
		}
	}
}
