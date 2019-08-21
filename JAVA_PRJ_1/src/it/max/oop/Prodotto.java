package it.max.oop;

import java.util.ArrayList;

public class Prodotto {
	private String nome;
	private String descrizione;
	private ArrayList<String> stores;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public ArrayList<String> getStores() {
		return stores;
	}
	public void setStores(ArrayList<String> stores) {
		this.stores = stores;
	}

	
	
}
