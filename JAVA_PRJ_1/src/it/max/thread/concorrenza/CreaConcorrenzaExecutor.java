package it.max.thread.concorrenza;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class CreaConcorrenzaExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//GetSitePageExecutor spe=new GetSitePageExecutor("http://www.google.it/");
		//	spe.call();
			
			List<Callable<String>> siti=new ArrayList<Callable<String>>();
			siti.add(new GetSitePageExecutor("http://www.google.it/"));
			siti.add(new GetSitePageExecutor("https://www.milannews.it"));
			ExecutorService es= Executors.newSingleThreadExecutor();
			
			//per far partire l'esecuzione dei thread
			try {
				 List<Future<String>>  out= es.invokeAll(siti);
				 
				 
				 es.shutdown();
				 
				 for (Future<String> future : out) {
					System.out.println(future.get());
				}
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
