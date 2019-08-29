package it.max.thread;

public class CreaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EsempioThread et=new EsempioThread();
		et.start();
		
		
		Thread t = new Thread(new EsempioRunnable());
		t.start();
	}

}
