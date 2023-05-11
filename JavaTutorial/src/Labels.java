import java.util.Scanner;

//JavaTutorial 20
public class Labels {
	public static void main(String[] args) {
		 hausaufgabe();
		//label();
	}

	// Hausaufgabe
	public static void hausaufgabe() {
		Scanner s = new Scanner(System.in);
		long wieviele = s.nextLong();  
		long primzahlenAnzahl = 0;  
		long beiZahl = 1; // 
		int zeilenumbruch = 0; 
		boolean isPrim = true;

		final int MAXINZEILE = 3;

		while (true) {
			if (primzahlenAnzahl >= wieviele) {
				break;    
			}
			beiZahl++;  
			isPrim = true;

			for (int i = 2; i < beiZahl; i++) {    
				if (beiZahl % i == 0) {     
					isPrim = false;
				}
			}

			if (isPrim) {
				System.out.print(beiZahl + " ; ");
				primzahlenAnzahl++;
				zeilenumbruch++;
			}
			if (zeilenumbruch >= MAXINZEILE) {
				zeilenumbruch = 0;
				System.out.println();
			}
		}
		System.out.println("Done!");
	}

	// Labels
	public static void label() {
		long primzahlenAnzahl = 0;
		long beiZahl = 1;
		int zeilenumbruch = 0;

		final int MAXINZEILE = 300;

		DieWhileSchleife: while (true) {
			beiZahl++;

			for (int i = 2; i < beiZahl; i++) {
				if (beiZahl % i == 0) {
					continue DieWhileSchleife;
				}
			}
			System.out.print(beiZahl + " ; ");
			primzahlenAnzahl++;
			zeilenumbruch++;

			if (zeilenumbruch >= MAXINZEILE) {
				zeilenumbruch = 0;
				System.out.println();
			}
		}
	}

}
