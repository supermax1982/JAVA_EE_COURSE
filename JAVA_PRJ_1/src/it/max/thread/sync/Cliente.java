package it.max.thread.sync;

public class Cliente extends Thread{
	
	private double sommaDaPrelevare;

	
	public Cliente(String nomeCliente ,double sommaDaPrelevare) {
		super();
		this.setName(nomeCliente);
		this.sommaDaPrelevare = sommaDaPrelevare;
	}

	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" arriva al bancomat");
		System.out.println("Quando arriva il saldo è "+ContoCorrente.getIstance().getSlado());
		System.out.println("La somma che vuole prelevare "+ Thread.currentThread().getName()+ "   è:"+sommaDaPrelevare);
		
		try {
			ContoCorrente.getIstance().prelievo(sommaDaPrelevare);
			System.out.println("Tutto OK importo prelevato dal cliente "+Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println("NOOOO non hai i soldo per prelevare");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public double getSommaDaPrelevare() {
		return sommaDaPrelevare;
	}

	public void setSommaDaPrelevare(double sommaDaPrelevare) {
		this.sommaDaPrelevare = sommaDaPrelevare;
	}
	
	

}
