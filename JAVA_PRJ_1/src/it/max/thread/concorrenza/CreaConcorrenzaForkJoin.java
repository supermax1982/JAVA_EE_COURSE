package it.max.thread.concorrenza;

import java.util.concurrent.ForkJoinPool;

public class CreaConcorrenzaForkJoin {

	public static void main(String[] args) {
		
		//metodo di generazione thread disponibile solo dalla java 1.7

			ForkJoinPool f=new ForkJoinPool();
			System.out.println(f.invoke(new GetSitePageForkJoin("http://www.google.it/")));
			System.out.println(f.invoke(new GetSitePageForkJoin("https://www.milannews.it")));
			
			f.shutdown();
	}

}
