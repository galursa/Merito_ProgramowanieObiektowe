import java.util.Scanner;

public class slowoStatic {
	   final static double ZLOTA_LICZBA = 1.618;
	   static double stPi = 3.14;
	    static void wyswietlStale()
	    {
	    	System.out.println("Sta³a = "+stPi);
	    }
	    static {
	    	Scanner dane = new Scanner(System.in);
	    	System.out.println("Podaj dane");
	    	double a, wynik;
			a = dane.nextInt();
			wynik = a+stPi;
			System.out.println("a + pi = "+ wynik);
			dane.close();
	    }
		public static void main(String[] args) {
			wyswietlStale();
			System.out.println(ZLOTA_LICZBA);
		}
}
