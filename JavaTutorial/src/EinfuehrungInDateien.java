import java.io.File;

//JavaTutorial 44
public class EinfuehrungInDateien {

	public static void main(String[] args) {
		File file = new File("C://Users//WorkstationVMServer//Documents//Webentwicklung Beispiele//anatolii.txt");
		if(file.exists()) {
			System.out.println("Die Datei " + file.getName() + " gibt es");
		} else {
			System.out.println("Die Datei " + file.getName() + " gibt es nicht");
		}
	}
}
