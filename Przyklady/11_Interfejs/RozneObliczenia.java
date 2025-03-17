import java.util.Random;
import java.util.Scanner;

interface WejscieWyjscie
{
	public void wyswietl();
	public void pobierzDane();
}

interface Obliczenia
{
	public int suma();
	public double srednia();
}

class Liczby implements WejscieWyjscie, Obliczenia
{
	private int []wartosci;
	Liczby(int n)
	{
		wartosci = new int[n];
		Random rand = new Random();
		for(int i=0; i<n; i++)
			wartosci[i]=rand.nextInt(10);
	}
	public void wyswietl()
	{
		for(int i=0; i<wartosci.length; i++)
		{
			System.out.print(wartosci[i]+" ");
		}
		System.out.println();
	}
	public void pobierzDane()
	{
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj wartoœæ do tablicy");
		for(int i=0; i<wartosci.length; i++)
		{
			System.out.print(i+": ");
			wartosci[i] = dane.nextInt();
		}
		dane.close();
	}
	public int suma()
	{
		int sum=0;
		for(int i=0; i<wartosci.length; i++)
		{
			sum+=wartosci[i];
		}
		return sum;
	}
	public double srednia()
	{
		return (double)suma()/(double)wartosci.length;
	}
}


public class RozneObliczenia {
	public static void main(String[] args) {
		Liczby ciag1 = new Liczby(4);
		System.out.println("Konstruktor losuje liczby");
		ciag1.wyswietl();
		System.out.println("Suma: "+ciag1.suma());
		System.out.println("Œrednia: "+ciag1.srednia());
		System.out.println("A teraz pobieramy dane");
		ciag1.pobierzDane();
		ciag1.wyswietl();
		System.out.println("Suma: "+ciag1.suma());
		System.out.println("Œrednia: "+ciag1.srednia());
	}
}
