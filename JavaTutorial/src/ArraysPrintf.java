
//JavaTutorial 18
public class ArraysPrintf {
	public static void main(String[] args) {
		// Array
		int[] zahlen = new int[10];
		
		zahlen[0]=1;
		System.out.println(zahlen[0]);
		seltsam(zahlen);
		System.out.println(zahlen[0]);
		
		// Printf
		int x = 1;
		String s = String.format("Hallo!%d", x);
		//System.out.printf("Hallo!%d", x);
		System.out.println(s);
		
	}
	
	static void seltsam(int[] x) {
		x[0]++;
	}

}
