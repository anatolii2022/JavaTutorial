import java.util.Random;

//JavaTutorial 21
public class Zufall {
	public static void main(String[] args) {
		Random wurfel = new Random();
			int y = wurfel.nextInt(6)+1;
			System.out.println(y);
	}

}
