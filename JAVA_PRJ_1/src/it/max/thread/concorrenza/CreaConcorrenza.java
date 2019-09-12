package it.max.thread.concorrenza;

public class CreaConcorrenza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("STRAT CREA CONCORRENZA CON THREAD");
		GetSitePage sp=new GetSitePage("https://www.milannews.it/");
		
		
		GetSitePage sp2=new GetSitePage("http://www.google.it/");
		
		
		sp.start();
		
		
		sp2.start();
		
		
		
		try {
			sp.join();
			sp2.join();
			
			System.out.println("MILAN CONTENT="+ sp.getContent());
			System.out.println("GOOGLE CONTENT="+ sp2.getContent());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
