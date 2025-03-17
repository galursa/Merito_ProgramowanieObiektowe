/*
 * Stoly
--
String: materialy
int: liczbaNog
double: cena
double: wysokosc
double: szerokosc
double: dlugosc
String: ksztaltBlatu
--
wyswietlInfo():void
vat():double
marza(double procent):double
powierzchniaBlatu():double

 */

class Stolik
{
	String materialy;
	int liczbaNog;
	double cena;
	double wysokosc;
	double szerokoscPromien;
	double dlugosc;
	String ksztaltBlatu;
	
	void wyswietlInfo()
	{
		System.out.println("Stol");
		System.out.println("Utworzony z :"+materialy+".");
		System.out.println("Posiada "+liczbaNog+" nog.");
		System.out.println("Koszt "+cena+".");
		System.out.println("Wysokosc: "+wysokosc+".");
		System.out.println("Blat: ksztalt - "+ksztaltBlatu+", szerokosc/Promien - "+szerokoscPromien+", dlugosc"+dlugosc+".");
		System.out.println();
	}
	double vat()
	{
		return 0.2*cena; 
	}
	
	double marza(double procent)
	{
		return procent*cena;
	}
	double powierzchniaBlatu()
	{
		if (ksztaltBlatu=="prostokat")
			return szerokoscPromien*dlugosc;
		else
			return Math.PI*Math.pow(szerokoscPromien, 2);
	}
}

public class Stoly {
	public static void main(String[] args) {
		Stolik drewniany = new Stolik();
		drewniany.materialy = "drewno, stal";
		drewniany.cena = 99.99;
		drewniany.wysokosc = 80.00;
		drewniany.liczbaNog = 4;
		drewniany.dlugosc = 100.00;
		drewniany.szerokoscPromien = 80.00;
		drewniany.ksztaltBlatu = "prostokat";
		drewniany.wyswietlInfo();
		System.out.println("Vat: "+drewniany.vat());
		System.out.println("Marza: "+drewniany.marza(0.3));
		System.out.println("Powierzchnia blatu: "+ drewniany.powierzchniaBlatu());
		
	}
}
