package it.max.oop;

public class OOPMain {

	public static void main(String[] args) {
	
//		Esempio di polimorfiso stesso metodo con due implementazioni diverse
		Smartphone sm=new Smartphone();
		sm.setDescrizione("Google Pixel");
		for (int i=0;i< sm.getStores().size();i++) {
			System.out.println(sm.getStores().get(i)); 
		}
		
		System.out.println("---------------------------");
		
		Libro libro=new Libro();
		libro.setDescrizione("Harry potter");
		for (int i=0;i< libro.getStores().size();i++) {
			System.out.println(libro.getStores().get(i)); 
		}
		
		
	}

}
