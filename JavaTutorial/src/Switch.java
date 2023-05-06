import java.util.Scanner;

public class Switch {

	
	public static void main(String[] args) {
		// Hausaufgabe JavaTutorial 18
//		Scanner s = new Scanner(System.in);
//		int stunden = s.nextInt();
//		int minuten = s.nextInt();
//		int sekunden = s.nextInt();
//		String st = zeit(stunden, minuten, sekunden);
//		System.out.println(st);
		
		mond();

	}
	
	private static String zeit(int stunden, int minuten, int sekunden) {
		return String.format("[%2d:%2d:%2d]", stunden, minuten, sekunden);
	}
	
	
	//Switch
	public static void mond() {
		int antwort;
		Scanner s = new Scanner(System.in);
		System.out.println("Wie viele Monde hat denn die Erde?");
		antwort = s.nextInt();
		
		switch(antwort){
		case 0:
			System.out.println("Leider zu wenig!");
			break;
		case 1:
			System.out.println("Richtig!");
			break;
		case 2:
			System.out.println("Zu viel!");
			break;
		default:
			System.out.println("Wach auf!");
		}
		
	}
	

}
