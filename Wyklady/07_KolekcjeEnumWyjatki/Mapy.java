import java.util.HashMap;
import java.util.Map;

public class Mapy {
	public static void main(String[] args) {
		Map<String, String> muzycy = new HashMap<String, String>();
		muzycy.put("DM", "Depeche Mode");
		muzycy.put("JLo", "Jennifer Lopez");
		System.out.print("Pierwszy artysta: ");
		System.out.println(muzycy.get("DM"));
		System.out.println("Ca³a mapa");
		System.out.println(muzycy);
		Map<String, Integer> rozrywka = new HashMap<String, Integer>();
		rozrywka.put("TV", 2);
		rozrywka.put("ksi¹¿ki", 3);
		rozrywka.put("Gry", 1);
		System.out.print("Ile czasu spêdzam na grach? ");
		System.out.print(rozrywka.get("Gry"));
	}
}
