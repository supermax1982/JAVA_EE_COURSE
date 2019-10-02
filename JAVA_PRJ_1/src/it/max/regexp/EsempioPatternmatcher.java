package it.max.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EsempioPatternmatcher {

	public static void main(String[] args) {
		//il metodo compile compila la regExp rendendola disponibile come oggetto da richiamre dove sio vuole
		Pattern p=Pattern.compile("\\d"); //cerca tutti i numeri
		String elenco="1.Juve, 2.Milan, 3.Lazio";
		
		String[] elencoSquadre=p.split(elenco);
		for (String squadra : elencoSquadre) {
			System.out.println(squadra.replaceAll(",",""));
		}
		
		//il metodo matches rfestituisce true o folse se trova /non trova la regolar expression
		String testo="m.quaro@gmail.com";
		boolean match=Pattern.matches(".*@.*", testo);
		System.out.println("la chiocciola è stata trovata?? "+match);

		p=Pattern.compile("QUARO", Pattern.CASE_INSENSITIVE);
		String[] elencoArray= p.split(testo);
		for (String string : elencoArray) {
			System.out.println(string);
		}
		
		//--------------CLASSE MATCHER-----------------------------------
		//le parentesi rotonde identificano i gruppi all'interno di un espressione regolare
		String testo2="<H1>Titolo1</H1><p>Testo 1</p><H2>Titolo 2</H2><p>Testo 2</p>";
		String regexp="(<p>([^<]+)</p>)";
		Pattern pattern=Pattern.compile(regexp);
		Matcher matcher=pattern.matcher(testo2);
		
		System.out.println("Gruppi presenti nell'espresione regolare Matcher="+ matcher.groupCount());
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}

}
