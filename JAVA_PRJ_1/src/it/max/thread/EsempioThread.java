package it.max.thread;

public class EsempioThread extends Thread {

	@Override
	public void run() {
		System.out.println("Ho appena creato un thread"+this.getName());
		for (int i=0; i<=10; i++) {
			System.out.println("ciclo "+i +"     del thread="+this.getName());
		}
	}

}
