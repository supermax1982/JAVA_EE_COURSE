package it.max.thread;

public class CreaMultithread {

	public static void main(String[] args) {
		EsempioThread et=new EsempioThread();
		et.setName("Thread 1");
		
		EsempioThread et2=new EsempioThread();
		et2.setName("Thread 2");

		
		EsempioThread et3=new EsempioThread();
		et3.setName("Thread 3");

		
		EsempioThread et4=new EsempioThread();
		et4.setName("Thread 4");
		
		EsempioThread et5=new EsempioThread();
		et5.setName("Thread 5");

		
		et.start();
		et2.start();
		et3.start();
		et4.start();
		et5.start();
	}
	
}
