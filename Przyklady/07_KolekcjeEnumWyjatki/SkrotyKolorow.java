import java.util.HashMap;
import java.util.Map;

public class SkrotyKolorow {
	public static void main(String[] args) {
		Map<String, String> skrotyKolorow = new HashMap<String, String>();
		skrotyKolorow.put("r", "FF0000");
		skrotyKolorow.put("b", "0000FF");
		skrotyKolorow.put("g", "00FF00");
		System.out.println("Slownik: ");
		System.out.println(skrotyKolorow);
	}
}
