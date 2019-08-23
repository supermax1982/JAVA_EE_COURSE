package it.max.interfacce;

public class Prodotto  implements GeneraDati{
	private String id;
	private String nome;
	private String codice;
	private double prezzo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String generaXML() {
		String xml="";
		xml+="<nome>"+nome+"</nome>";
		xml+="<codice>"+codice+"</codice>";
		// TODO Auto-generated method stub
		return xml;
	}
	
	
	
}
