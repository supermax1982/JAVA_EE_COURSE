package it.max.thread.sync;

public class CreaSyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		cliente ca=new cliente("marco", 30.0);
//		cliente ca2=new cliente("luca", 40.0);
//		//avvio i threads
//		ca.start();
//		ca2.start();
//		
//		//attendo il completamento
//		try {
//			ca.join();
//			ca2.join();
//		} catch (interruptedexception e) {
//			// todo auto-generated catch block
//			e.printstacktrace();
//		}
		
		
		ClienteNonSync ca=new ClienteNonSync("marco", 30.0);
		ClienteNonSync ca2=new ClienteNonSync("luca", 40.0);
		//avvio i threads
		ca.start();
		ca2.start();
		
		//attendo il completamento
		try {
			ca.join();
			ca2.join();
		} catch (Exception e) {
			// todo auto-generated catch block
			
		}
	
	}

}
