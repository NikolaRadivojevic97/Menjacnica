package valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijainterfejsa.Interfejs;

public class Menjacnica implements Interfejs{
	LinkedList<Valuta> valute=new LinkedList<Valuta>();
	
	public void dodajKurs(String naziv, String skraceni, double srednjiKurs, double prodajniKurs, double kupovniKurs,GregorianCalendar datum) {
		
		
	}

	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		
		
	}

	public Valuta vratiKurs(String naziv, GregorianCalendar datum) {
		
		return null;
	}

}
