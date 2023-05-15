
public class Ueberladungen {
	public static void main(String[] args) {
		int x,y,z, z1;
		x = 3;
		y = 5;
		z = rechnen(x,y);
		z1 = rechnen(x,y,false);
		System.out.println(z);
		System.out.println(z1);
		
	}
	
	public static int rechnen(int x, int y) {
		int z;
		z = x+y;
		return z;
	}
	
	public static int rechnen(int x, int y, boolean plus) {
		int z;
		if(plus) {
			z = rechnen(x,y);
			return z;
		}
		else {
			z=x-y;
			return z;
		}
	}

}
