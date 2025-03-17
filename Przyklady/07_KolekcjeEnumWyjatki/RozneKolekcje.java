import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class RozneKolekcje {
	public static void main(String[] args) {
		Map<String,String> slownik = new HashMap<String,String>();
		slownik.put("cat", "kot");
		slownik.put("mouse", "mysz");
		slownik.put("book", "ksiazka");
		slownik.put("mobile phone", "telefon komorkowy");
		System.out.println("Slownik angielsko-polski:");
		System.out.println(slownik);
		System.out.println(slownik.keySet());
		List <Integer> losowe = new ArrayList<Integer>();  
		Random rand = new Random();
		for(int i=0; i<10; i++)
		{
			losowe.add(rand.nextInt(10));
		}
		System.out.println();
		System.out.println("Lista z liczbami losowymi:");
		for(int liczba: losowe)
		{
			System.out.print(liczba+" ");
		}
		Set <Double> lRzeczywiste = new HashSet<Double>();
		lRzeczywiste.add(333.22);
		lRzeczywiste.add(11.22);
		lRzeczywiste.add(555.22);
		System.out.println();
		System.out.println();
		System.out.println("Zbior liczb rzeczywistych");
		System.out.println(lRzeczywiste);
	}
}
