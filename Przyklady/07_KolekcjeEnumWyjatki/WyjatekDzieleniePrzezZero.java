import java.util.Scanner;

public class WyjatekDzieleniePrzezZero {
	public static void main(String[] args) {
		System.out.println("Podaj dwie liczby: ");
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj pierwsza liczbe");
		int dzielna = dane.nextInt();
		System.out.println("Podaj druga liczbe");
		int dzielnik = dane.nextInt();
		try {
			System.out.println("Dzielenie: "+dzielna+"/"+dzielnik+"="+(dzielna/dzielnik));
		}catch(Exception except)
		{
			System.out.println("Wystapil blad. Nie moge wykonac dzielenia");
			except.getMessage();
			System.out.println("Na podanych liczbach mozna wykonac dodawanie");
			System.out.println(dzielna+"+"+dzielnik+"="+(dzielna+dzielnik));
		}finally
		{
			System.out.println("Dziekuje za skorzystanie z programu");
		}
	}
}
