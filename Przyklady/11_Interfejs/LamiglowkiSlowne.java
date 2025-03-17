import java.util.Scanner;

interface WejscieWyjscieSlowa
{
	public void wyswietl();
	public void pobierzDane();
}

interface Lamiglowki
{
	public void czyPierwszeLiteryTakieSame();
	public void czyDlugoscSlowTakaSama();
}

class SlowoDoSlowa implements  WejscieWyjscieSlowa,Lamiglowki
{
	protected String[] slowa;
	SlowoDoSlowa(int rozmiar)
	{
		slowa = new String[rozmiar];
	}
	public void pobierzDane()
	{
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj s³owa");
		for(int i=0; i<slowa.length; i++)
		{
			System.out.print(i+": ");
			slowa[i] = dane.next();
		}
		dane.close();
	}
	public void wyswietl()
	{
		for(int i=0; i<slowa.length; i++)
		{
			System.out.println(slowa[i]);
		}
		System.out.println();
	}
	public void czyPierwszeLiteryTakieSame()
	{
		Boolean tak=true;
		for(int i=1; i<slowa.length; i++)
		{
			if(slowa[i-1].charAt(0)!=slowa[i].charAt(0))
			{
				tak=false;
				break;
			}
		}
		if(tak)
		{
			System.out.println("Wszystkie s³owa zaczynaj¹ siê t¹ sam¹ liter¹");
		} else
		{
			System.out.println("Niektóre s³owa zaczynaj¹ siê inn¹ liter¹");
		}
	}
	public void czyDlugoscSlowTakaSama()
	{
		Boolean tak=true;
		for(int i=1; i<slowa.length; i++)
		{
			if(slowa[i-1].length()!=slowa[i].length() )
			{
				tak=false;
				break;
			}
		}
		if(tak)
		{
			System.out.println("Wszystkie s³owa maj¹ te sam¹ d³ugoœæ");
		} else
		{
			System.out.println("S³owa s¹ ró¿nej d³ugoœci");
		}
	}
}

public class LamiglowkiSlowne {
	public static void main(String[] args) {
		SlowoDoSlowa test = new SlowoDoSlowa(4);
		test.pobierzDane();
		test.wyswietl();
		test.czyPierwszeLiteryTakieSame();
		test.czyDlugoscSlowTakaSama();
	}
}
