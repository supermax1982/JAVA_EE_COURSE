package it.max.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EsempiRegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EsempiRegExp es=new EsempiRegExp();
		System.out.println(es.validaMail("m.quaroni1add@gmail.com"));
		System.out.println(es.validaMail("m.quaroni1addgmail.com"));
		
		System.out.println(es.dateFormataValidator("12/09/2019"));
		System.out.println(es.dateFormataValidator("40/09/2019"));
		
	}
	
	public boolean validaMail(String email) {
		//[a-zA-Z0-9._-]--> lettere maiuscoli e minuscoli e numeri da 0 a 9 e . _ e-
		//al primo blocco viene unito la chioucciola
		//e subito dopo una sequenza di lettere e numeri
		//infine all'ultimo blocco viene aggiunto il . e una sequenza di lettere che va da 2 a 8 caratteri
		String regexp="[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[A-zA-Z]{2,8}";
		Pattern p=Pattern.compile(regexp);
		Matcher matcher=p.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean dateFormataValidator(String data) {
		String regexp="(0[1-9]|[12][0-9]|3[01])[-/.](0[1-9]|1[012])[-/.](19|20)\\d\\d";
		Pattern p=Pattern.compile(regexp);
		Matcher matcher=p.matcher(data);
		if(matcher.matches()) {
			return true;
		}
		else {
			return false;
		}
	}

}
