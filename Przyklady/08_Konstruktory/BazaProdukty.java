import java.util.Scanner;

/*
 * Produkt
--
nazwa: String
cena: double
vat: double
waga: double
producent: String
trzymajWLodowce: Boolean
--
Produkt()
Produkt(String nazwa, double cena, double vat, double waga, String producent, trzymajWLodowce: Boolean)
void info()
void wyswietlCene()
 */

class ProduktWSklepie
{
	String nazwa;
	double cena; 
	double vat; 
	double waga;
	String producent; 
	Boolean trzymajWLodowce;
	ProduktWSklepie()
	{
		Scanner dane = new Scanner(System.in);
		System.out.println("Prosze podac wartosci:");
		System.out.println("Nazwa: ");
		nazwa = dane.next();
		System.out.println("Cena: ");
		cena = dane.nextDouble();
		System.out.println("Vat - procent jako ulamek dziesietny:");
		vat = dane.nextDouble();
		System.out.println("Waga: ");
		waga = dane.nextDouble();
		System.out.println("Producent: ");
		producent = dane.next();
		System.out.println("Czy nalezy trzymac w lodowce t-tak, n-nie");
		String sprawdzenie = dane.next();
		if (sprawdzenie =="t")
			trzymajWLodowce = true;
		else 
			trzymajWLodowce = false;		
	}
	ProduktWSklepie(String nazwa, double cena, double vat, double waga, String producent, Boolean trzymajWLodowce)
	{
		this.nazwa = nazwa;
		this.cena = cena;
		this.vat = vat;
		this.waga = waga;
		this.producent = producent;
		this.trzymajWLodowce = trzymajWLodowce;
	}
	
	void info()
	{
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Cena: "+cena);
		System.out.println("Vat: "+vat);
		System.out.println("Waga: "+waga+" g");
		System.out.println("Producent: "+producent);
		if(trzymajWLodowce)
			System.out.println("Produkt nalezy trzymac w lodowce");
		else
			System.out.println("Produktu nie trzeba trzymac w lodowce");
	}
	
	void wyswietlCene()
	{
		System.out.println("Cena przed podatkiem:"+cena*(1-vat));
		System.out.println("VAT: "+vat*100+"%");
		System.out.println("Cena z podatkiem VAT: "+cena);
	}
	double sredniaWaga(double ... wagi)
	{
		double suma = 0.0;
		int i=0;
		for(double element: wagi)
		{
			suma+=element;
			i++;
		}
		return suma/i;
	}
}


public class BazaProdukty {
	public static void main(String[] args) {
		ProduktWSklepie ksiazka = new ProduktWSklepie();
		ksiazka.info();
		ksiazka.wyswietlCene();
		System.out.println("Srednia waga:"+ksiazka.sredniaWaga(200,150.33,222));
		ProduktWSklepie mleko = new ProduktWSklepie("mleko",4, 0, 444.88, "Mleko dla Ciebie",true);
		mleko.info();
		mleko.wyswietlCene();
	}
}
