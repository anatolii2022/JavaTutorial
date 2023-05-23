// JavaTutorial 31
public class Konstruktoren {
	public static void main(String[] args) {
		Mensch karl = new Mensch(70, 80);
		//Ohne Konstruktoren
//		karl.iq = 15;
//		karl.alter = 113;
//		karl.name = "Karl";
//		karl.haarfarbe = "Schwarz";
		System.out.println(karl.alter);
		System.out.println( karl.iq);
	}

}
