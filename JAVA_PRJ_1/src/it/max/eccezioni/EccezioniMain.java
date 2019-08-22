package it.max.eccezioni;

public class EccezioniMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			EccezioniMain em= new EccezioniMain();
			try {
				em.stampaTesto2(null);
			} catch (CorsoJavaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	}
	
	private void stampaTesto(String testo) {
		String testo2= testo.concat("...");
		System.out.println(testo2);
	}
//	eccezioni personalizzate
	private void stampaTesto2(String testo) throws CorsoJavaException {
		if(testo==null) {
			throw new CorsoJavaException();
		}
		String testo2= testo.concat("...");
		System.out.println(testo2);
	}

}
