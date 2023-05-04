import java.util.Scanner;

public class Final {
	public static void main(String[] args) {
		final double PI = 3.14;
		double seltsameZahl;
		seltsameZahl = PI + 1;
		System.out.println(seltsameZahl);
		
		hausaufgabe();
	}
	
	public static void hausaufgabe() {
		Scanner s = new Scanner(System.in);
		int[] x = new int[5];
		
		for(int i = 0; i<5; i++) {
			x[i] = s.nextInt();
		}
		double derDurchschnitt = durchschnitt(x[0],x[1],x[2],x[3],x[4]);
		System.out.println(derDurchschnitt);
	}
	
	static double durchschnitt(int x, int y, int z, int z1, int z2){
		double loesung = x+y+z+z1+z2;
		loesung/=5;
		return loesung;
	}

}
