package vorlage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bestellung {
     int bestellnummer;
     Date bestelldatum;
     List<Gericht> gerichte;
     Kunde kunde;
     Kellner kellner;
     double gesamtbetrag;

    // Konstruktor, Getter und Setter

    public double getGesamtbetrag() {
 
		return gesamtbetrag;
	}

	public void gerichtHinzufuegen(Gericht gericht) {
  
    }

    public void gesamtbetragBerechnen() {
   
    }

	public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde, Kellner kellner) {
		super();
		this.bestellnummer = bestellnummer;
		this.bestelldatum = bestelldatum;
		this.gerichte = new ArrayList<Gericht>();
		this.kunde = kunde;
		this.kellner = kellner;
	}

	public Object getGerichte() {
		// TODO Auto-generated method stub
		return gerichte;
	}

	public Integer bestellnummer() {
		// TODO Auto-generated method stub
		return bestellnummer;
	}

	public Object bestelldatum() {
		// TODO Auto-generated method stub
		return bestelldatum;
	}

	public Object getKunde() {
		// TODO Auto-generated method stub
		return kunde;
	}

	public Object getKellner() {
		// TODO Auto-generated method stub
		return kellner;
	}
}