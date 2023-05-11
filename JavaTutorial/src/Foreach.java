//JavaTutorial 22
public class Foreach {
	public static void main(String[] args) {
		int[] x = new int[10];
		for(int i = 0; i<x.length; i++) {
			x[i] = i;
		}
		for(int j: x) {
			System.out.println(j);
		}
	}

}
