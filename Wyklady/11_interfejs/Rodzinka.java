import java.util.Scanner;

class Rodzic
{
	int wiek;
	String plec;
	public interface Dziecko{
		void podajImie();
	}
}

class Syn implements Rodzic.Dziecko
{
	String Imie;
	public void podajImie() {
		System.out.println("Jak siê nazywasz?");
		Scanner dane = new Scanner(System.in);
		Imie = dane.next();
		dane.close();
	}
}

public class Rodzinka {
	public static void main(String[] args) {
		Rodzic mama = new Rodzic();
		mama.wiek = 30;
		mama.plec = "kobieta";
		Syn synus = new Syn();
		synus.podajImie();
		System.out.println(synus.Imie);
	}
}
