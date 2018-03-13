package specifikacijainterfejsa;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface Interfejs {
	public void dodajKurs(String naziv,String skraceni,double srednjiKurs,double prodajniKurs, double kupovniKurs, GregorianCalendar datum);
	public void obrisiKurs(String naziv, GregorianCalendar datum);
	public Valuta vratiKurs(String naziv, GregorianCalendar datum);
}
