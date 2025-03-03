import java.util.Scanner;

public class CzytajZmienne {

	public static void main(String[] args) {
		Scanner czytaj = new Scanner(System.in);
		System.out.println("Podaj liczbe calkowita");
		int liczbaCalk = czytaj.nextInt();
		System.out.println("Podaj liczbe rzeczywista");
		float liczbaRzecz = czytaj.nextFloat();
		System.out.println("Podaj slowo");
		String slowo = czytaj.next();
		System.out.format("Slowo = %3$s, a = %2$2.2f, b= %1$d", liczbaCalk,liczbaRzecz,slowo);
		czytaj.close();
		System.out.println();
		System.out.println("Manipulacje na slowie");
		System.out.println(slowo.toUpperCase());
		System.out.println(slowo.charAt(0));
		System.out.println(slowo.length());
	}

}
