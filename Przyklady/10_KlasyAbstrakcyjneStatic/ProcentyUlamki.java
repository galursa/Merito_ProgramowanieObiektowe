import java.util.Scanner;

public class ProcentyUlamki {
	
	static double e = 2.718281828;
	static double zamienProcent(double procent)
	{
		return procent/100;
	}
	
	static {
		Scanner dane = new Scanner(System.in);
		System.out.println("Napisz slowo: ");
		String slowo;
		slowo=dane.next();
		System.out.println(slowo.toUpperCase());
	}
	
	public static void main(String[] args) {
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj procent: ");
		double procent;
		procent = dane.nextDouble();
		System.out.println("Obliczony procent = "+zamienProcent(procent));
		System.out.println();
		System.out.println("Stala e = "+e);
		dane.close();
	}
}
