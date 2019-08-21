package it.max.oop;

import java.util.ArrayList;

public class Libro extends Prodotto{
	
	private String autore;

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public ArrayList<String> getStores() {
		ArrayList<String> aa=new ArrayList<>();
		aa.add("cagliari");
		aa.add("Milano");
		return aa;
	}

	
}
