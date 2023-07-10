
public class PureFunction {
	public static void main(String[] args) {
		System.out.println(checknum(3));
		
		
	}
	
	public static String checknum(int num) {
		return num%2==0? "Even" : "Odd";
	}

}
