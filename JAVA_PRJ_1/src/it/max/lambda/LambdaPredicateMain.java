package it.max.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaPredicateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//in generale le lambda espression servono per ridurre il codice scritto su cicli di liste
		LambdaPredicateMain main=new LambdaPredicateMain();
		
		List<Utente> utenti=new ArrayList<Utente>();
		
		utenti.add(new Utente("MAssimo", "Rossi", "30"));
		utenti.add(new Utente("Mario", "Bianchi", "32"));
		utenti.add(new Utente("Mario", "Filippi", "32"));
		utenti.add(new Utente("Giulio", "Rossi", "30"));
		
		//espressioen lambda di tipo predicate usate per applicare filtri su liste
		//hanno un oggetto di ingresso e restituiscono in uscita true/false in funzione dell'esito del test sulla condizione  lambda(utente -> utente.getNome().equals("Mario"))
		//il Predicato è un espressione lambda
		//il predicato vuole in ingresso un parametro (Predicate<Utente> p) e restituisce in uscita true o false in funzione dell'esito del test dell'espressione lambda
		//vogliamo cercare tutti gli utenti il cui nome è Mario
		//in questo modo possimoa definire un espresisoen che puo effettuare diversi test senza dover riscrivere tutti i cicli
		System.out.println(" ---------------- ESEMPIO DI PREDICATE --------------");
		List<Utente> utentiTrovati=main.cercaUtenti(utenti, utente -> utente.getNome().equals("Mario"));
		
		for (Utente utente2 : utentiTrovati) {
			System.out.println("Utente trovato:"+ utente2.getNome()+"    "+utente2.getCognome());
		}
		
		List<Utente> utentiTrovati2=main.cercaUtenti(utenti, utente -> utente.getCognome().equals("Filippi"));
		
		for (Utente utente2 : utentiTrovati2) {
			System.out.println("Utente trovato:"+ utente2.getNome()+"    "+utente2.getCognome());
		}
		
		//--------------------------------------------------------------------------------------
		
		//espressione lambda di tipo  Consumer
		//riceve un oggetto in ingresso e non restituisce nulla, in genere viene usatop per eseguire task
		//il Consumer esegue il metodo accept
		System.out.println(" ---------------- ESEMPIO DI CONSUMER --------------");
		Consumer<Utente> c= utente -> System.out.println("Nome="+ utente.getNome()+"    cognome="+utente.getCognome()+"  eta="+utente.getEta());
		utenti.forEach(c);
		//oppure al posto del foreach
		for (Utente utente2 : utenti) {
			c.accept(utente2);
		}
		
		
		//espressione lambda Supplier è l'opposto del consumer
		//non ha nessun parametro di ingresso e restituisce un oggetto tramite il metodo get()
		//possiamo usare il supplier per stampare sempre l'elemnco di utenti
		System.out.println(" ---------------- ESEMPIO DI SUPPLIER --------------");
		for (Utente utente2 : utenti) {
			main.stampaDatiUtente(()->utente2);
		}
		
		//espressione lambda function è quella più completa
		//ha un oggetto in ingresso e restituisce un valore
		//viene usata quando dobbiamo passare input D UN METODO UN BLOCCO DI CODICE
		//AD ESEMPIO DEFINIAMO UN metodo per il calcolo di un operazione generico
		System.out.println(" ---------------- ESEMPIO DI FUNCTION --------------");
		double a=12;
		main.calcolaOperazione(a, val->val *val);
		main.calcolaOperazione(a, val -> val+val);
		
		
		//espressione lambda unaryOperator estende function
		//prende in ingresso un operando e produce in uscita un risultato dello stesso tipo dell'operando
		System.out.println(" ---------------- ESEMPIO DI UNARY OPERATOR --------------");
		UnaryOperator<String> up=str -> str.toLowerCase();
		System.out.println(up.apply("CIAO MARIO"));
		
		//espressione lambda BinatyOperator estende function
		//prende in ingresso due operandandi e produce in uscita un risultato dello stesso tipo dell'operando
		double a=10;
		double b=4;
		BinaryOperator<Double> bo=(a1,a2)->a1*a2;
		System.out.println(bo.apply(a, b));
	}
	
	
	public void calcolaOperazione(double operando , Function<Double, Double> funzione) {
		double risultato = funzione.apply(operando);
		System.out.println("Il risultato è :"+risultato);
	}
	
	public void stampaDatiUtente(Supplier<Utente> u) {
		System.out.println(u.get().getNome()+"    cognome="+u.get().getCognome());
	}
	
	public List<Utente> cercaUtenti(List<Utente> utenti,Predicate<Utente> p){
		
		List<Utente> utentiTrovati=new ArrayList<Utente>();
		
		for (Utente utente : utenti) {
			if(p.test(utente)) {
				utentiTrovati.add(utente);
			}
			
		}
		
		return utentiTrovati;
		
	}

}
