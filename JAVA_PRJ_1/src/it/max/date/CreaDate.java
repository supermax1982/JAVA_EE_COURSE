package it.max.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.sun.org.apache.bcel.internal.generic.CALOAD;

public class CreaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreaDate cd=new CreaDate();
		cd.esSimpleDateFormat();
	}
	
	private void esSimpleDateFormat() {
		Calendar c=new GregorianCalendar();
		c.set(Calendar.YEAR, 2019);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.HOUR, 10);
		c.set(Calendar.MINUTE,20);
		c.set(Calendar.SECOND, 59);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(c.getTime()));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		System.out.println(sdf2.format(c.getTime()));
		
		//la funzione parse prende in ingresso una stinga e la converte in una data
		try {
			Date dxx=sdf.parse("11/03/2018");
			System.out.println(dxx.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void esPeriodEDuration() {
		//la classe duration viene usata per calcolare un intervallo di tempo in secondi e nanoscecondi
		//ritorna un intervallo di tempo di 3 sec e 10 nano sec
		Duration d=Duration.ofSeconds(3, 10);
		System.out.println(d.getSeconds());
		System.out.println(d.getNano());


		LocalTime lt=LocalTime.of(9, 30);
		LocalTime lt2=LocalTime.of(14, 30);
		Duration d2=Duration.between(lt, lt2);
		System.out.println(d2);
		System.out.println(d2.getSeconds());
		
		//posso fare lo stesso discorso per il piriod però devo usare le localDate
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
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//classe reale che implementa tutti i metodi della classe astratta calendar
		Calendar cal2=new GregorianCalendar();
		
		//imposta la data attuale in formato gregorian calendar
		cal2.setTime(new Date());
	}
	
	private void esLocalDate() {
		//esempi di creazione della classe local date , usata a partire da JAVA 8
		//un instanz di quella classe assume valori diversi in funzione del paese in cui viene creata
		LocalDate ld=LocalDate.of(2017, Month.MAY, 31);
		LocalDate ld3=LocalDate.from(ld);
		//verifica se l'anno è bisestile
		System.out.println(ld.isLeapYear());
		//restituisce il numero di giorni del mese
		System.out.println(ld.getDayOfMonth());
		//ritorna un istanza della classe LocalDate ma con l'anno cambiato
		
		System.out.println(ld.withYear(2015));
		//aggiunge alla data due mesi
		System.out.println(ld.plusMonths(2));
		//vengono sottratti 5 giorni
		System.out.println(ld.minusDays(5));
		
		
		//La classe localTime viene usata per indicare un orario senza una data associata , viene usata quando si vuole definire ad esempio gli orari di un esercizio commerciale
		LocalTime lt=LocalTime.of(9, 30);
		System.out.println(lt.toString());
		//metodo per aggiungere hore ma cim sono anche i metodi per aggiungere minuti e secondi
		System.out.println(lt.plusHours(2));
	}
}
