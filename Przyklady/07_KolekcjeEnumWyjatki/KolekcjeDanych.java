import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class KolekcjeDanych {
	public static void main(String[] args) {
		//Stale - lista
		LinkedList <String> stale = new LinkedList<String>();
		stale.add("e");
		stale.add("Z³ota œrednia");
		stale.add("pi");
		System.out.println("Wszystkie elementy listy:");
		System.out.println(stale);
		System.out.println("Pierwszy element listy");
		System.out.println(stale.getFirst());
		//formatPapieru - zbiór: A4, B1, 
		Set<String> formatPapieru = new TreeSet<String>();
		formatPapieru.add("A1");
		formatPapieru.add("A2");
		formatPapieru.add("A3");
		formatPapieru.add("A4");
		formatPapieru.add("A5");
		formatPapieru.add("A6");
		System.out.println("Formaty papieru w formie zbioru (set)");
		System.out.println(formatPapieru);
		System.out.println("Czy B1 jest w zbiorze? "+formatPapieru.contains("B1"));
		System.out.println("Czy A1 jest w zbiorze? "+formatPapieru.contains("A1"));
		//Zakupy - mapa - produkt jako klucz a ilosc jako wartosc
		Map<String, Integer> zakupy = new HashMap<String, Integer>();
		zakupy.put("mleko",2 );
		zakupy.put("chleb",1 );
		zakupy.put("jaja" ,10 );
		zakupy.put("jablka",5 );
		zakupy.put( "herbata",1);
		System.out.println("Zakupy jako mapa/slownik (map)");
		System.out.println(zakupy);
		System.out.println("Ile jab³ek mamy kupiæ: "+zakupy.get("jablka"));
	}
}

