package valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijainterfejsa.Interfejs;

public class Menjacnica implements Interfejs{
	LinkedList<Valuta> valute=new LinkedList<Valuta>();
	
	public void dodajKurs(Valuta valuta) {
		if(valuta==null || valute.contains(valuta))
			throw new RuntimeException("Objekat je null ili taj kurs vec postoji");
		valute.add(valuta);
	}

	public void obrisiKurs(Valuta valuta) {
		if(valuta==null)
			throw new RuntimeException("Uneti objekart je null");
		valute.remove(valuta);
		
	}

	public Valuta vratiKurs(String naziv, GregorianCalendar datum) {
		if(naziv==null || datum.after(new GregorianCalendar()))
			throw new RuntimeException("naziv je prazan ili je datum posle trenutnog");
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum))
				return valute.get(i);
		}
		return null;
	}

}
