import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HigherOrderFunstions {
	public static void main(String[] args) {
		
		//Function as parameters
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Carrot");
		
		Collections.sort(fruitList, (String fruitA, String fruitB) ->  {
			return fruitA.compareTo(fruitB);
		});
		
		System.out.println(fruitList);
		
		//Functions as return values
		Comparator<String> comparator = (String a, String b) -> {
			return a.compareTo(b);
		};
		
		Comparator<String>comparatorReversed = comparator.reversed();
		Collections.sort(fruitList, comparatorReversed);
		System.out.println(fruitList);
		
	}
	

	

}
