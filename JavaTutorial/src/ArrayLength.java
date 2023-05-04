import java.util.Scanner;

public class ArrayLength {
	
	public static void main(String[] args) {
		arrayLength();
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


}
