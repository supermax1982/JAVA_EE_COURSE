package it.max.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CreaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreaDate cd=new CreaDate();
		cd.esDataGregorianCalendar();
	}
	
	private void esData() {
		//la classe Date è stata deprecata
		Date data=new Date();
		System.out.println("data="+data.toString());
		//ritorna il timestamp
		System.out.println(data.getTime());
	}

	private void esDataGregorianCalendar() {//la classe Date è stata deprecata
		//la classe calendar è astratta 
		//attenzione il mese parte da 0 quindi 10 indica novembre
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DATE, 29);
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.MONTH));
		//classe reale che implementa tutti i metodi della classe astratta calendar
		Calendar cal2=new GregorianCalendar();
		
		//imposta la data attuale in formato gregorian calendar
		cal2.setTime(new Date());
	}
}
