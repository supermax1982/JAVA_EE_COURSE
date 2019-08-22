package it.max.liste;

import java.util.ArrayList;

import it.max.oop.Smartphone;

public class CreaArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CreaArrayMain am=new CreaArrayMain();
			am.creaArray();
	}
  private void creaArray() {
	  int[] array=new int[6];
	  
	  array[0]=1;
	  array[1]=2;
	  array[2]=3;
	  array[3]=4;
	  array[4]=5;
	  array[5]=6;
	  
	  for (int i=0; i<array.length;i++) {
		  System.out.println(array[i]);
	  }
	  
	  //oppure
	  ArrayList<Smartphone> smartphoneList=new ArrayList<>();
	  
	  Smartphone sm1=new Smartphone();
	  sm1.setNome("Google Pixel");
	  sm1.setDescrizione("pippo");
	  
	  Smartphone sm2=new Smartphone();
	  sm2.setNome("Samsung Galaxy");
	  sm2.setDescrizione("pluto");
	  
	  smartphoneList.add(sm1);
	  smartphoneList.add(sm2);
	  
	  for(Smartphone s:smartphoneList) {
		  System.out.println(s.getNome());
	  }
  }
}
