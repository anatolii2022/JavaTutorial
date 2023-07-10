import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class DateiErstellen {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\\\Users\\\\WorkstationVMServer\\\\Documents\\\\Webentwicklung Beispiele\\\\apfel.txt");
		if(!file.exists()) {
			try {
				Formatter format = new Formatter("C:\\Users\\WorkstationVMServer\\Documents\\Webentwicklung Beispiele\\apfel.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Datei mit dem Namen bereits existiert");

	}

}
