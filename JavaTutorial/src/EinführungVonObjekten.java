//JavaTutorial 29
public class EinführungVonObjekten {
	public static void main(String[] args) {
		 Mensch karl = new Mensch();
		 Mensch ute = new Mensch();
		 ute.alter = 45;
		 ute.name = "Ute";
		 karl.alter = 80;
		 karl.name = "Karl";
		 System.out.println(karl.alter + " " + karl.name);
		 System.out.println(ute.alter + " " + ute.name);
	}

}
