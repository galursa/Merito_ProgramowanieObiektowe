abstract class Rosliny
{
	protected String gatunek;
	protected float cena;
	protected boolean jednoRocznaCzyNie;
	protected String stanowisko;
	protected int ileNaMagazynie;
	abstract void wyswietl();
	abstract void ustalCeneZaSztuke(float cenaJednostkowa);
	abstract float rabat(float wysokosc);
}

class Drzewa extends Rosliny
{
	private String lisciasteCzyIglaste;
	private boolean czyZrzucaLiscie;
	Drzewa(String gatunek,float cena,boolean jednoRocznaCzyNie, String stanowisko,int ileNaMagazynie,String lisciasteCzyIglaste,boolean czyZrzucaLiscie){
		this.gatunek = gatunek;
		this.cena = cena;
		this.jednoRocznaCzyNie = jednoRocznaCzyNie;
		this.stanowisko = stanowisko;
		this.ileNaMagazynie = ileNaMagazynie;
		this.lisciasteCzyIglaste = lisciasteCzyIglaste;
		this.czyZrzucaLiscie = czyZrzucaLiscie;
	}
	void wyswietl() {
		System.out.println("Gatunek: "+gatunek);
		System.out.println("Cena: "+ cena);
		System.out.println("Jednorocznoœæ: ");
		if(jednoRocznaCzyNie)
			System.out.print("tak");
		else
			System.out.print("nie");
		System.out.println();
		System.out.println("Stanowisko: "+stanowisko);
		System.out.println("Ile jest w magazynie: "+ileNaMagazynie);
		System.out.println(lisciasteCzyIglaste);
		System.out.println("Czy rzuca liœcie");
		if(czyZrzucaLiscie)
			System.out.print("tak");
		else
			System.out.print("nie");
		System.out.println();
	}
	void ustalCeneZaSztuke(float cenaJednostkowa)
	{
		cena = cenaJednostkowa;
	}
	
	float rabat(float wysokosc)
	{
		return wysokosc*cena;
	}
}

/*
RoslinyKwitnace
--
kolor
czyDajeMiod
--
wyswietl()
ustalCeneZaSztuke(float cenaJednostkowa)
rabat()
*/


public class SklepOgrodniczy {
	public static void main(String[] args) {
		Drzewa modrzew = new Drzewa("Modrzew", 23.99f, false, "S³oneczne", 100, "Iglaste", true);
		modrzew.wyswietl();
		modrzew.ustalCeneZaSztuke(20.99f);
		modrzew.wyswietl();
		System.out.println("Otrzymujesz rabat w kwocie: "+modrzew.rabat(0.1f));
	}
}
