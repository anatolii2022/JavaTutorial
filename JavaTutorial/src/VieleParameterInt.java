
public class VieleParameterInt {

	public static void main(String[] args) {
		int x, y, z, z1;
		x = 3;
		y = 5;
		z = 9;
		z1 = rechnen(x, y, z, 10,102,22);
		System.out.println(z1);
	}

	public static int rechnen(int... x) {
		int z = 0;
		for (int i = 0; i < x.length; i++) {
			z += x[i];
		}
		return z;
	}

}
