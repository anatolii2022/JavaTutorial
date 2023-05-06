import java.util.Scanner;

//JavaTutorial 17
public class ArrayLength {
	
	public static void main(String[] args) {
		//arrayLength();
		hausaufgabe();
	}
	
	public static void arrayLength() {
		Scanner s = new Scanner(System.in);
		int[] x = new int[5];
		
		for(int i = 0; i<x.length; i++) {
			x[i] = s.nextInt();
		}
		double derDurchschnitt = durchschnitt(x);
		System.out.println(derDurchschnitt);
	}
	
	static double durchschnitt(int[] x){
		double loesung = 0;
		for(int i = 0; i<x.length; i++) {
			loesung+=x[i];
		}
		loesung/=x.length;
		return loesung;
	}
	
	public static void hausaufgabe() {
		Scanner s = new Scanner(System.in);
		int anzahl = s.nextInt();
		int[] zahlen = new int [anzahl]; // 5
		for(int i = 0; i < zahlen.length; i++) {
			zahlen[i]=s.nextInt();
		}
		System.out.print("[");
		for(int i = 0; i<zahlen.length; i++) {
			System.out.print(zahlen[i]);
			if(i<zahlen.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}


}
