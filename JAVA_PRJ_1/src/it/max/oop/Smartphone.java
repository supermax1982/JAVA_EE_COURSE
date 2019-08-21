package it.max.oop;

import java.util.ArrayList;

public class Smartphone extends Prodotto{
	private String imei;

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@Override
	public ArrayList<String> getStores() {
		ArrayList<String> aa=new ArrayList<>();
		aa.add("Roma");
		aa.add("palermo");
		return aa;
	}
	
	
	
}
