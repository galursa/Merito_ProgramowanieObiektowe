import java.util.ArrayList;
import java.util.List;

public class Kolory {
	public static void main(String[] args) {
		//Tworzymy listê
		List <String> naszeKolory = new ArrayList<String>();
		//Wyswietlamy elemnety
		naszeKolory.add("Bia³y");
		naszeKolory.add("Czerwony");
		naszeKolory.add("¯ó³ty");
		System.out.println("Wpisana lista");
		System.out.println(naszeKolory);
		//Pobieramy wybrany element
		System.out.println("Drugi element na liœcie: ");
		System.out.println(naszeKolory.get(1));
	}
}
