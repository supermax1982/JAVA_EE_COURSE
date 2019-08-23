package it.max.liste;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import it.max.oop.Smartphone;

public class CreaHashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreaHashMapMain a=new CreaHashMapMain();
		a.esempioHashMap();
	}
	
	private void esempioHashMap() {
		HashMap<String, Smartphone> mappa=new HashMap<String, Smartphone>();
		
		Smartphone s1=new Smartphone();
		s1.setNome("3A");
		s1.setDescrizione("Google pixel");
		s1.setImei("12345");
		
		
		Smartphone s2=new Smartphone();
		s2.setNome("S8 ");
		s2.setDescrizione("Samsung Galaxy");
		s2.setImei("6789");
		
		mappa.put(s1.getImei(), s1);
		mappa.put(s2.getImei(), s2);
		
		
		Set<String> chiavi=mappa.keySet();
		
		for(String chiave:chiavi) {
			System.out.println("Chiave: "+chiave);
		}
		
		
		//CICLARE SULLE CHIAVI USANDO L'iterator
		System.out.println("Con iterator");
		Iterator<String> iterator= chiavi.iterator();
		while( iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		boolean chiavetrovata= mappa.containsKey("6789");
		System.out.println("Chaive trovata:"+chiavetrovata);
		
		Smartphone s3=mappa.get("12345");
		System.out.println(s3.getDescrizione());
		
		System.out.println(mappa.size());
		mappa.remove("6789");
		System.out.println(mappa.size());
		
		
		
		
		
		
	}

}
