/*
 * Herbata
--
nazwa:String
rodzaj: String
cenaZaGram: double
waga: double
krajPochodzenia: String
--
Herbata()
Herbata(nazwa:String, rodzaj: String, cenaZa100gram: double,waga: double, krajPochodzenia: String)
sredniaCena(double[] cena ):double
obliczCene():double

 */

import java.util.Scanner;

class Herbata
{
	String nazwa;
	String rodzaj;
	double cenaZaGram; 
	double waga; 
	String krajPochodzenia;
	Herbata()
	{
		System.out.println("Tworze nowy wpis o herbacie. Podaj dane");
		System.out.println("Nazwa: ");
		Scanner dane = new Scanner(System.in);
		nazwa = dane.nextLine();
		System.out.println("Rodzaj: ");
		rodzaj = dane.nextLine();
		System.out.println("Cena za 1 gram herbaty: ");
		cenaZaGram = dane.nextDouble();
		System.out.println("Waga: ");
		waga = dane.nextDouble();
		System.out.println("Kraj pochodzenia: ");
		krajPochodzenia = dane.next();		
	}
	Herbata(String nazwa, String rodzaj, double cenaZaGram, double waga, String krajPochodzenia)
	{
		this.nazwa = nazwa;
		this.rodzaj = rodzaj;
		this.cenaZaGram = cenaZaGram;
		this.waga = waga;
		this.krajPochodzenia = krajPochodzenia;
	}
	void wyswietlDane()
	{
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Rodzaj: "+rodzaj);
		System.out.println("Cena za 1 gram herbaty:" + cenaZaGram);
		System.out.println("Waga w opakowaniu: "+ waga);
		System.out.println("Kraj pochodzenia: "+krajPochodzenia);
	}
	double sredniaCena(double ... cena)
	{
		int liczbaElementow=0;
		double suma =0.0;
		for(double element: cena)
		{
			suma+=element;
			liczbaElementow++;
		}
		return suma/liczbaElementow;
	}
	double obliczCene()
	{
		return cenaZaGram*waga;
	}
}


public class SklepZHerbatami {
	public static void main(String[] args) {
		Herbata zielona = new Herbata();
		zielona.wyswietlDane();
		System.out.println("Cena za calosc: "+zielona.obliczCene());
		Herbata czarna = new Herbata("Earl Grey", "Czarna", 2.0, 100, "Indie" );
		czarna.wyswietlDane();
		System.out.println("Cena za calosc: "+czarna.obliczCene());
		System.out.println("Srednia z kilku cen: "+czarna.sredniaCena(2,2,2));
		System.out.println("Srednia z kilku cen: "+czarna.sredniaCena(1,2,3,4));
		System.out.println("Srednia z kilku cen: "+czarna.sredniaCena(6.02,4.03,5.01,6.01,3.04));
		
	}
}
