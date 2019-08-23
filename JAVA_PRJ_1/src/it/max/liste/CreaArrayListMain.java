package it.max.liste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreaArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreaArrayListMain m=new CreaArrayListMain();
		m.esempioArrayList();
	}
	
	  public void esempioArrayList() {
		  List<String> lista=new ArrayList<String>();
		  // o
		  List<String> lista2=new ArrayList<String>();
		  
		  lista.add("Paolo");
		  lista.add("Mario");
		  lista.add("Valerio");
		  
		  System.out.println("ESEMPIO DI CICLO CON FOREACH---------------");
		  for (String s:lista) {
			  System.out.println(s);
		  }
		  System.out.println("FINE ESEMPIO DI CICLO CON FOREACH---------------");
		  
		  System.out.println("ESEMPIO DI CICLO CON ITERATOR---------------");
		  Iterator<String> iterator= lista.iterator();
		  while (iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
		  System.out.println("FINE  ESEMPIO DI CICLO CON ITERATOR---------------");
		  
		  lista.remove(2);
		  
		  
		  System.out.println("DOPO REMOVE---------------");
		  for (String s:lista) {
			  System.out.println(s);
		  }
		  
		  System.out.println("DOPO REMOVE---------------");
		  
		  lista.set(1, "Paperino");
		  
		  
		  System.out.println("DOPO SET usato per sostituire un valore---------------");
		  for (String s:lista) {
			  System.out.println(s);
		  }
		  
		  
		  System.out.println("DOPO INDEXOF usato per cercare un valore---------------");
		  System.out.println("Si trova alla posizione "+lista.indexOf("Paperino"));
	  }
}
