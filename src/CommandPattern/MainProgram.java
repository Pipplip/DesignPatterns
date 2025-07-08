package CommandPattern;

public class MainProgram {

	public static void main(String[] args) {
		Fernsteuerung fernsteuerung = new Fernsteuerung();
		
		Licht wohnzimmerLicht = new Licht("Wohnzimmer");
		Licht kuechenLicht	  = new Licht("Kueche");
		// Hier kann auch andere Objekte init werden, z.B. Ventilator etc.
		
		LichtAnBefehl wohnzimmerLichtAn = new LichtAnBefehl(wohnzimmerLicht);
		LichtAusBefehl wohnzimmerLichtAus = new LichtAusBefehl(wohnzimmerLicht);
		
		LichtAnBefehl kuechenLichtAn = new LichtAnBefehl(kuechenLicht);
		LichtAusBefehl kuechenLichtAus = new LichtAusBefehl(kuechenLicht);
		
		fernsteuerung.setBefehl(0, wohnzimmerLichtAn, wohnzimmerLichtAus);
		fernsteuerung.setBefehl(1, kuechenLichtAn, kuechenLichtAus);
		
		System.out.println(fernsteuerung);
		
		fernsteuerung.anKnopfWurdeGedrueckt(0);
		fernsteuerung.ausKnopfWurdeGedrueckt(0);
		fernsteuerung.anKnopfWurdeGedrueckt(1);
		fernsteuerung.ausKnopfWurdeGedrueckt(1);
	}

}
