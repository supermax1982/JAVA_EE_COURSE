package it.max.classiastratte;

public class CreaAstratteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prodotto p=new Televisore();
		System.out.println(p.calcolaVendite());
		
		Prodotto p1=new Autoradio();
		System.out.println(p1.calcolaVendite());
	}

}
