import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SlownikZKoloramiFarb {

	public static void main(String[] args) {
		Map<String, Integer> farbyAkwarelowe = new HashMap<String, Integer>();
		farbyAkwarelowe.put("Cadmium Yellow Pale",5);
		farbyAkwarelowe.put("Poland Blue",23);
		farbyAkwarelowe.put("Prussian Blue", 20);
		farbyAkwarelowe.put("Sepia", 48);
		farbyAkwarelowe.put("Carmine", 14);
		System.out.println(farbyAkwarelowe);
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj nazwe farby po angielsku");
		String farba = dane.nextLine();
		System.out.println("Farba "+farba+" ma numer:"+farbyAkwarelowe.get(farba));
		dane.close();
		Random rnd = new Random();
		int wartosc = rnd.nextInt(48)+1;
		System.out.println("Sprawdzam czy jest farba o nr "+wartosc);
		System.out.println(farbyAkwarelowe.containsValue(wartosc));
		System.out.println("Sprawdzam czy jest farba o kluczu: "+farba);
		System.out.println(farbyAkwarelowe.containsKey(farba));
	}

}
