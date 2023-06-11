// JavaTutorial 38
public class SpeicherAdressen {
	public static void main(String[] args) {
		Mensch karl = new Mensch();
		Mensch Ute;
		Ute = new Mensch();
		Ute.name = "Ute";
		System.out.println(karl.toString());
	}

}
