package it.max.regexp;

public class RegExpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testo="Loren Ipsum doloro 123 sit anment LLL é§°G";
		
		// [...]
		//Rimpiazza tutti i caratteri all'interno delle [] con H
		System.out.println(testo.replaceAll("[aeiou]", "H"));
		
		//[^...]
		//rimpiazza tutti i caratteri che non sono inseriti tra []
		System.out.println(testo.replaceAll("[^aeiou]", "H"));
		
		//[... - ....]
		//rimpiazza tutti i caratteri inseriti nell'intervallo [... - ....]
		//in questo caso individua e rimpiazza tutti i caratteri che vano dalla lettera a alla lettera e
		System.out.println(testo.replaceAll("[a-e]", "H"));
		
		
		//[...&&[...]]
		//rimpiazza solo l'intersezione degli insiemi cioè i carattari che stanno nel primo e nel secondo insieme
		//in questo caso individua e rimpiazza tutti i caratteri che vano dalla lettera A alla lettera Z e la L 
		System.out.println(testo.replaceAll("[A-Z&&[L]]", "H"));
		
		//[...&&[...]]
		//rimpiazza solo l'intersezione degli insiemi cioè i carattari che stanno nel primo e nel secondo insieme
		//in questo caso l'intersezione è l'insieme vuoto e quindi non rimpiazza nulla
		System.out.println(testo.replaceAll("[A-Z&&[a-z]]", "H"));
				
		//.
		//individua tutti i carattari numerici e alfanumerici e li rimpiazza lettera H
		System.out.println(testo.replaceAll(".", "H"));

		//[...+[...]]
		//rimpiazza l'unione  degli insiemi 
		//in questo caso individua e rimpiazza tutti i caratteri alfanumerici maiuscoli e minuscoli
		System.out.println(testo.replaceAll("[A-Z+[a-z]]", "k"));

		//[^[...]
		//rimpiazza il primo carattere all'inizio della linea compreso nell'intervallo A-Z con la lettera H
		System.out.println(testo.replaceAll("^[A-Z]", "H"));
		//[...]$
		//rimpiazza l'ultimo carattere di fine linea se è compreso nell'intervallo A-Z con la lettera H
		System.out.println(testo.replaceAll("[A-Z]$", "H"));
		
		// Lo*
		//rimpiazza zero o piu occorrenze dell'espressione regolare Lo con la lettera H
		System.out.println(testo.replaceAll("Lo*", "H"));
		
		//L{2}
		//rimpiazza all'interno della stringa due L attaccate con la lettera H
		System.out.println(testo.replaceAll("L{2}", "H"));
		
		//L{2,}
		//rimpiazza all'interno della stringa almeno due L attaccate con la lettera H
		System.out.println(testo.replaceAll("L{2,}", "H"));
		
		//L{2,4}
		//rimpiazza all'interno della stringa almeno due L  e meno di 4  L  attaccate con la lettera H
		System.out.println(testo.replaceAll("L{2,4}", "H"));
		
		// \d  forma abbreviata
		//si tratta di una forma abbreviata che rimpiazza tutti i numeri  con la lettera H
		System.out.println(testo.replaceAll("\\d", "H"));
		
		// \D  forma abbreviata
		//si tratta di una forma abbreviata che rimpiazza tutti i caratteri alfanumerici e speciali ad esclusione dei numeri  con la lettera H
		System.out.println(testo.replaceAll("\\D", "H"));
		
		// \s  forma abbreviata
		//si tratta di una forma abbreviata che rimpiazza tutti gli spazi  con la lettera H
		System.out.println(testo.replaceAll("\\s", "H"));
		
		// \S forma abbreviata
		//si tratta di una forma abbreviata che rimpiazza tutti i caratteri  ad esclusione degli spazi  con la lettera H
		System.out.println(testo.replaceAll("\\S", "H"));
		
		// \w  forma abbreviata
		//si tratta di una forma abbreviata che rimpiazza tutti i caratteri alfanumerici ad esclusione dei caratteri speciali  con la lettera H
		System.out.println(testo.replaceAll("\\w", "H"));
		
		// \W  forma abbreviata
		//si tratta di una forma abbreviata che rimpiazza tutti i caratteri speciali e spazi con la lettera H
		System.out.println(testo.replaceAll("\\W", "H"));
		
		
	}

}
