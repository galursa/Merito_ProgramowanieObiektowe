import java.util.LinkedList;


public class Farby {
	public static void main(String[] args) {
		LinkedList <String> rodzajeFarb = new LinkedList<String>();
		rodzajeFarb.add("Akrylowe");
		rodzajeFarb.add("Akwarelowe");
		rodzajeFarb.add("Olejne");
		System.out.println("Wpisana lista");
		System.out.println(rodzajeFarb);
		//Pobieramy wybrany element
		System.out.println("Drugi element na liœcie: ");
		System.out.println(rodzajeFarb.get(1));
		//wybrane funkcje
		System.out.println("Ostatni element na liœcie: ");
		System.out.println(rodzajeFarb.getLast());
		System.out.println("Dodaje jako pierwszy");
		rodzajeFarb.addFirst("Gwasze");
		System.out.println("Uzupe³niona lista");
		System.out.println(rodzajeFarb);
	}
}
