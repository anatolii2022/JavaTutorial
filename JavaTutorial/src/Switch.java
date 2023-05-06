import java.util.Scanner;

public class Switch {

	// Hausaufgabe JavaTutorial 18
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int stunden = s.nextInt();
		int minuten = s.nextInt();
		int sekunden = s.nextInt();
		String st = zeit(stunden, minuten, sekunden);
		System.out.println(st);

	}
	
	private static String zeit(int stunden, int minuten, int sekunden) {
		return String.format("[%2d:%2d:%2d]", stunden, minuten, sekunden);
	}

}
