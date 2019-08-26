package it.max.classiinnerlocali;

import java.util.List;

public class Appartamento {
	private int piani;
	private List<StanzaInner> stanze;
	
	class StanzaInner{
		private int mq;
		private String nomeStanza;
		
		
		public StanzaInner(int mq, String nomeStanza) {
			super();
			this.mq = mq;
			this.nomeStanza = nomeStanza;
		}
		
	}
	
	public int getPiani() {
		return piani;
	}

	public void setPiani(int piani) {
		this.piani = piani;
	}

	public List<StanzaInner> getStanze() {
		return stanze;
	}

	public void setStanze(List<StanzaInner> stanze) {
		this.stanze = stanze;
	}

	public void aggiungiStanza(int mq, String nome){
		getStanze().add(new StanzaInner(mq, nome));
		
	}
	
	
}
