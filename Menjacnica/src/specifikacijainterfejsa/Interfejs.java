package specifikacijainterfejsa;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface Interfejs {
	public void dodajKurs(Valuta valuta);
	public void obrisiKurs(Valuta valuta);
	public Valuta vratiKurs(String naziv, GregorianCalendar datum);
}
