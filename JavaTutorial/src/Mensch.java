//JavaTutorial 29
public class Mensch {
	int alter;
	int iq = 0;
	String name;
	String haarfarbe;
	
	void bildung() {
		iq+=5;
	}
	
	void bildung(int wieviel) {
		iq+=wieviel;
	}
	
	//Konstruktor
	Mensch (int wieAlt, int welcherIQ){
		alter = wieAlt;
		iq = welcherIQ;
	}
	
	Mensch (String welcherName, String welcheHaarfarbe){
		welcherName = name;
		welcheHaarfarbe = haarfarbe;
	}
	
	//Default Konstruktor
	Mensch (){}
	

}
