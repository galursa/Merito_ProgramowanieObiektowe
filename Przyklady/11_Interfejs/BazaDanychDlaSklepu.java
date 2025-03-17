import java.util.Scanner;

interface ObslugaBazyDanych
{
	void zapiszDoBazy();
	void wyswietlDane();
	void wyszukajDane();
}

interface  CenaMarzaVat
{
	void ustawCeneBazowa(double cena);
	void ustawCene(double narzut);
	double obliczVat(double wielkosc);
	double obliczRabat(double wielkosc);
	double pokazMinCenaZ30Dni();
}
/*
 * Ubrania
--
#nazwa: String
#producent: String
#rozmiar: String
#material: String
#cena: double
#vatProcent: int
#minCenaZ30Dni: double
#narzut: double
 */
class Ubrania implements ObslugaBazyDanych, CenaMarzaVat
{
	protected String nazwa;
	protected String producent;
	protected String rozmiar;
	protected String material;
	protected double cena;
	protected int vatProcent;
	protected double minCenaZ30Dni;
	protected double narzut;
	public void zapiszDoBazy()
	{
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj dane:");
		System.out.println("Nazwa:");
		nazwa = dane.nextLine();
		System.out.println("Producent:");
		producent = dane.nextLine();
		System.out.println("Rozmiar:");
		rozmiar = dane.next();
		System.out.println("Material:");
		material = dane.nextLine();
		System.out.println("Cena: ");
		cena = dane.nextDouble();
		System.out.println("Vat w procentach: ");
		vatProcent = dane.nextInt();
		System.out.println("Minimalna cena z ostatnich 30 dni:");
		minCenaZ30Dni = dane.nextDouble();
		System.out.println("Narzut: ");
		narzut = dane.nextDouble();
	}
	public void wyswietlDane()
	{
		System.out.println("Nazwa: "+nazwa );
		System.out.println("Producent: "+producent);
		System.out.println("Rozmiar: "+ rozmiar);
		System.out.println("Material: "+ material);
		System.out.println("Cena: "+cena);
		System.out.println("Vat w procentach: "+vatProcent);
		System.out.println("Minimalna cena z ostatnich 30 dni: "+minCenaZ30Dni);
		System.out.println("Narzut: "+narzut);
	}
	public void wyszukajDane()
	{
		Scanner data = new Scanner(System.in);
		System.out.println("Podaj nazwe ubrania: ");
		String uNazwa;
		uNazwa=data.nextLine();
		if(nazwa == uNazwa)
		{
			System.out.println("Mamy ubranie w ofercie.");
		} else
		{ 
			System.out.println("W ofercie mamy jedynie: "+nazwa);
		}
	}
	public void ustawCeneBazowa(double cena)
	{
		this.cena = cena;
	}
	public void ustawCene(double narzut)
	{
		cena +=narzut;
	}
	public double obliczVat(double wielkosc)
	{
		return cena*wielkosc;
	}
	public double obliczRabat(double wielkosc)
	{
		return cena*wielkosc;
	}
	public double pokazMinCenaZ30Dni()
	{
		return minCenaZ30Dni;
	}
	
}


public class BazaDanychDlaSklepu {
	public static void main(String[] args) {
		Ubrania bluzka = new Ubrania();
		bluzka.zapiszDoBazy();
		bluzka.wyswietlDane();
		bluzka.wyszukajDane();
		bluzka.ustawCene(30);
		bluzka.wyswietlDane();
		bluzka.ustawCene(20);
		bluzka.wyswietlDane();
		System.out.println("Vat: "+bluzka.obliczVat(0.1));
		System.out.println("Rabat: "+bluzka.obliczRabat(0.1));
		System.out.println("Najni¿sza cena z 30 dni: "+bluzka.pokazMinCenaZ30Dni());
	}
}
