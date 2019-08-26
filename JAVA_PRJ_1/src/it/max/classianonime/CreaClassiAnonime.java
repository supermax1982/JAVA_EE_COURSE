package it.max.classianonime;

public class CreaClassiAnonime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  CreaClassiAnonime a=new CreaClassiAnonime();
		  Azione azione= a.recuperaAzione();
		  azione.eseguiAzione();

	}
	
	public Azione recuperaAzione() {
		return new Azione() {
			
			@Override
			public void eseguiAzione() {
				System.out.println("azione eseguita");
				
			}
		};
	}

}
