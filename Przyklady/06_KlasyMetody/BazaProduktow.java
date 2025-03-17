/*
 * Produkt
--
nazwa: String
cena: double
waga: double
--
info():void
vat(double procent): double
pakujProdukty(double wagaPojemnika): int
 */
class Produkty
{
	String nazwa;
	double cena;
	double waga;
	void info()
	{
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Cena: "+cena);
		System.out.println("Waga: "+waga);
	}
	
	double vat(double procent)
	{
		return cena*procent;
	}
	
	int pakujProdukty(double wagaPojemnika)
	{
		double sumaWag = 0.0;
		int i = 0;
		while(sumaWag <= wagaPojemnika)
		{
			sumaWag+=waga;
			i++;
		}
		i--;
		return i;
	}
}



public class BazaProduktow {
	public static void main(String[] args) {
		Produkty zeszyt = new Produkty();
		zeszyt.nazwa = "zeszyt w kratke";
		zeszyt.cena = 4.99;
		zeszyt.waga = 20;
		zeszyt.info();
		System.out.println("Vat :"+zeszyt.vat(0.22));
		double wagaPojemnika = 70.0;
		System.out.println("Do pojemnika o wadze: "+wagaPojemnika+" mozna zapakowac "+ zeszyt.pakujProdukty(wagaPojemnika)+"produkt(ow)");
	}
}
