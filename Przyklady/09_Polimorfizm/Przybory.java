import java.util.Scanner;

class PrzyboryDoRysowania
{
	protected String kategoria;
	protected String producent;
	PrzyboryDoRysowania()
	{
		System.out.println("Podaj kategoriê: ");
		Scanner dane = new Scanner(System.in);
		kategoria = dane.next();
		System.out.println("Podaj producenta ");
		producent = dane.next();
	}
	PrzyboryDoRysowania(String kategoria, String producent)
	{
		this.kategoria = kategoria;
		this.producent = producent;
	}
	
	public void wyswietl()
	{
		System.out.println("Kategoria: "+kategoria);
		System.out.println("Producent: "+producent);
	}
	final void krajProdukcji()
	{
		System.out.println("Czechy ");
	}
}

class Kredki extends PrzyboryDoRysowania
{
	protected int id;
	protected String rodzaj;
	protected int ileWOpakowaniu;
	protected float cena;
	Kredki(int id, String rodzaj, int ileWOpakowaniu, float cena)
	{
		this.id = id;
		this.rodzaj = rodzaj;
		this.ileWOpakowaniu = ileWOpakowaniu;
		this.cena = cena;
		super.kategoria = "a";
		super.producent = "a";
	}
	Kredki(int id, String rodzaj, int ileWOpakowaniu, float cena, String kategoria, String producent)
	{
		super(kategoria,producent);
		this.id = id;
		this.rodzaj = rodzaj;
		this.ileWOpakowaniu = ileWOpakowaniu;
		this.cena = cena;
	}
	public void wyswietl()
	{
		System.out.println("ID: "+id);
		super.wyswietl();
		System.out.println("Rodzaj: "+rodzaj);
		System.out.println("Iloœæ w opakowaniu: "+ileWOpakowaniu);
		System.out.println("Cena: "+cena);
	}
	public float kosztJednejKredki()
	{
		return cena/(float)ileWOpakowaniu;
	}
}

public class Przybory {
	public static void main(String[] args) {
		PrzyboryDoRysowania olowki = new PrzyboryDoRysowania();
		olowki.wyswietl();
		olowki.krajProdukcji();
		Kredki swiecowe = new Kredki(1, "Swiecowe", 12, 13.99f);
		swiecowe.wyswietl();
		Kredki bezOprawy = new Kredki(2, "Bez Oprawy", 24, 49.99f, "Kredki", "Koh-I-Noor");
		bezOprawy.wyswietl();
		System.out.println("Cena za jedn¹ kredkê: "+bezOprawy.kosztJednejKredki());
	}
}
