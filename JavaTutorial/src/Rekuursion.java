//JavaTutorial 28
public class Rekuursion {
	public static void main(String[] args) {
		int y = 5;
		int z = fakultaet(y);
		System.out.println(z);
		
	}
	public static int fakultaet(int x) {
		if(x == 1) {
			return 1;
		}
		else {
			return fakultaet(x-1) * x;  
		}
	}
}

/**
 * fakultaet(int x) {
 * 
 * fakultaet (int 5)
 * fakultaet (int 4)
 * fakultaet (int 3)
 * fakultaet (int 2)
 * fakultaet (int 1)
 * }
 * 
 * 
 * else {
 * return 5* fakultaet(5-1)
 * return 4* fakultaet(4-1)
 * return 3* fakultaet(3-1)
 * return 2* fakultaet(2-1)
 * }
 * Ergebnis
 * 5*4*3*2* fakultaet(1)
 * 5*4*3*2*1 = 120
 * 
**/
