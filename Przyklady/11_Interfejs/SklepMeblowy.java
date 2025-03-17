import java.util.Scanner;

interface szczegoloweDane
{
	public void WyswietlDane();
	public void UstalCene(float cena);
	public float UstalRabat(float rabat);
	public void NadajNazwê(String nazwa);
	public void UstawWymiary(float wysokosc, float szerokosc, float glebokosc);
	float gruboscSiedziska = 30.0f;
	float gruboscPlyty = 25.0f;
}


class Stol implements szczegoloweDane
{
	String blat;
	float wysokosc;
	float szerokosc;
	float glebokosc;
	String nazwa;
	float cena;
	float rabat;
	Stol(String blat)
	{
		this.blat = blat;
	}
	public void WyswietlDane() 
	{
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Wysokoœæ: "+wysokosc+" mm, szerokoœæ: "+szerokosc+" mm, g³êbokoœæ: "+glebokosc+" mm.");
		System.out.println("Cena: "+cena);
		System.out.println("Rabat: "+rabat);
		System.out.println("Rodzaj blatu: "+blat);
	}
	public void UstalCene(float cena)
	{
		this.cena = cena;
	}
	public float UstalRabat(float rabat)
	{
		this.rabat = rabat;
		return this.rabat;
	}
	public void NadajNazwê(String nazwa)
	{
		this.nazwa = nazwa;
	}
	public void UstawWymiary(float wysokosc, float szerokosc, float glebokosc)
	{
		this.wysokosc = wysokosc;
		this.szerokosc = szerokosc;
		this.glebokosc = glebokosc;
	}
}

class Krzeslo implements szczegoloweDane
{
	String siedzisko;
	float wysokosc;
	float szerokosc;
	float glebokosc;
	String nazwa;
	float cena;
	float rabat;
	Krzeslo(String siedzisko)
	{
		this.siedzisko = siedzisko;
	}
	public void WyswietlDane() 
	{
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Wysokoœæ: "+wysokosc+" mm, szerokoœæ: "+szerokosc+" mm, g³êbokoœæ: "+glebokosc+" mm.");
		System.out.println("Cena: "+cena);
		System.out.println("Rabat: "+rabat);
		System.out.println("Rodzaj siedziska: "+siedzisko);
	}
	public void UstalCene(float cena)
	{
		this.cena = cena;
	}
	public float UstalRabat(float rabat)
	{
		this.rabat = rabat*this.cena;
		return this.rabat;
	}
	public void NadajNazwê(String nazwa)
	{
		this.nazwa = nazwa;
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj numer");
		nazwa = dane.next();
		this.nazwa+=" ";
		this.nazwa+=nazwa;
	}
	public void UstawWymiary(float wysokosc, float szerokosc, float glebokosc)
	{
		this.wysokosc = wysokosc;
		this.szerokosc = szerokosc;
		this.glebokosc = glebokosc;
	}
}


public class SklepMeblowy {
	public static void main(String[] args) {
		Stol jadalny = new Stol("Drewniany");
		jadalny.UstalCene(199.99f);
		jadalny.UstalRabat(0.10f);
		jadalny.UstawWymiary(100, 100, 100);
		jadalny.NadajNazwê("Stó³ Jadalny Maj");
		jadalny.WyswietlDane();
		Krzeslo krzeselko = new Krzeslo("Tapicerowany");
		krzeselko.UstalCene(19.99f);
		krzeselko.UstalRabat(0.15f);
		krzeselko.UstawWymiary(100, 50, 50);
		krzeselko.NadajNazwê("Dla dziecko");
		krzeselko.WyswietlDane();
	}
}
