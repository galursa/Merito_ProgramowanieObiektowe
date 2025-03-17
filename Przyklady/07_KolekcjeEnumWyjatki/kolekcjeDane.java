import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class kolekcjeDane {
	public static void main(String[] args) {
		LinkedList <String> ksiazkiDoPrzeczytania = new LinkedList<String>();
		ksiazkiDoPrzeczytania.add("Adrian Frutiger, \"Czlowiek i jego znaki\" ");
		ksiazkiDoPrzeczytania.add("Edward L. Bernays, \"Propaganda\"");
		ksiazkiDoPrzeczytania.add("Wladyslaw Strzeminski, \"Teoria widzenia\"");
		System.out.println("Lista z ksiazkami do przeczytania");
		System.out.println(ksiazkiDoPrzeczytania);
		Set<String> jednostkiWagi = new HashSet<String>();
		jednostkiWagi.add("kg");
		jednostkiWagi.add("g");
		jednostkiWagi.add("dag");
		jednostkiWagi.add("mg");
		System.out.println("Zbior z jednostkami wagi");
		System.out.println(jednostkiWagi);
		Map<String, String> skrotyJednWag = new TreeMap<String, String>();
		skrotyJednWag.put("kg", "kilogram");
		skrotyJednWag.put("g", "gram");
		skrotyJednWag.put("dag", "dekagram");
		skrotyJednWag.put("mg", "miligram");
		System.out.println("Mapa/Slownik z jednostkami wagi i ich skrotami, ktore sa kluczami");
		System.out.println(skrotyJednWag);
		System.out.println("kg : "+ skrotyJednWag.get("kg"));
		
		
		
	}

}
