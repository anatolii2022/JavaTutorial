//JavaTutorial 29
public class Mensch extends Lebewesen {

	int iq = 0;
	int hausnummer;
	int groesse;

	private static int anzahlMenschen = 0;

	static int getAnzahlMenschen() {
		return anzahlMenschen;
	}

	void bildung() {
		iq += 5;
	}

	void bildung(int wieviel) {
		iq += wieviel;
	}

	// Konstruktor
	Mensch(int wieAlt, int welcherIQ) {
		alter = wieAlt;
		iq = welcherIQ;
	}

	Mensch(String welcherName, String welcheHaarfarbe) {
		welcherName = name;
		welcheHaarfarbe = haarfarbe;
	}

	Mensch(int alter, int hausnummer, int groesse) {
		this.alter = alter;
		this.hausnummer = hausnummer;
		this.groesse = groesse;
	}

	Mensch(int alter, int iq, String name, String haarfarbe) {
		this.alter = alter;
		this.iq = iq;
		this.name = name;
		this.haarfarbe = haarfarbe;
		anzahlMenschen++;
	}
	
	// Default Konstruktor
	Mensch() {
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\nAlter: %s\nIQ: %s\nHaarfarbe: %s\nSpeicheradresse: %s", name, alter, iq, haarfarbe, super.toString());
	}

}
