package it.max.interfacce;

public class FormaGeometrica implements GeneraDati {
	private double lato1;
	private double lato2;
	private double lato3;
	public double getLato1() {
		return lato1;
	}
	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}
	public double getLato2() {
		return lato2;
	}
	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}
	public double getLato3() {
		return lato3;
	}
	public void setLato3(double lato3) {
		this.lato3 = lato3;
	}
	@Override
	public String generaXML() {
		String xml="";
		xml+="<lato1>"+lato1+"</lato1>";
		xml+="<lato2>"+lato2+"</lato2>";
		// TODO Auto-generated method stub
		return xml;
	}
	
}
