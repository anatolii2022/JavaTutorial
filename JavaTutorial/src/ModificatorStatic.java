//JavaTutorial 33
public class ModificatorStatic {
	public static void main(String[] args) {
		Mensch karl = new Mensch(70, 80, "Karl", "Schwarz");
		System.out.println(Mensch.getAnzahlMenschen());
		
		Mensch ute = new Mensch(70,80, "Ute", "Blond");
		System.out.println(Mensch.getAnzahlMenschen());
	}

}
