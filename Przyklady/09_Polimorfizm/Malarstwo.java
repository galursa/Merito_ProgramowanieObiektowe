import java.util.Scanner;

class Przybory
{
	protected String producent;
	protected String kategoria;
	protected String krajPochodzenia;
	
	Przybory(String producent, String kategoria, String krajPochodzenia)
	{
		this.producent = producent;
		this.kategoria = kategoria;
		this.krajPochodzenia = krajPochodzenia;
	}
	
	Przybory()
	{
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj producenta");
		producent = dane.next();
		System.out.println("Podaj kategorie");
		kategoria= dane.next();
		System.out.println("Podaj krajPochodzenia");
		krajPochodzenia= dane.next();
	}
	
	public void wyswietl()
	{
		System.out.println("Producent: "+producent);
		System.out.println("Kraj pochodzenia: "+krajPochodzenia);
		System.out.println("Kategoria: "+kategoria);
	}
	
	String getProducent()
	{
		return producent;
	}
	
	String getKategoria()
	{
		return kategoria;
	}
	
	String getKrajPochodzenia()
	{
		return krajPochodzenia;
	}
	
	void setProducent(String producent)
	{
		this.producent = producent;
	}
	
	void setKategoria(String kategoria)
	{
		this.kategoria = kategoria;
	}
	
	void setKrajPochodzenia(String krajPochodzenia)
	{
		this.krajPochodzenia = krajPochodzenia;
	}
	
}

class PrzyboryMalarskie extends Przybory
{
	private int id;
	private String rodzaj;
	private int ileWOpakowaniu;
	private float cena;
	private float ileMiesiecyPrzydatny;
	
	PrzyboryMalarskie(int id, String rodzaj, int ileWOpakowaniu, float cena, float ileMiesiecyPrzydatny, String producent, String kategoria, String krajPochodzenia)
	{
		super(producent, kategoria, krajPochodzenia);
		this.id = id;
		this.rodzaj = rodzaj;
		this.ileWOpakowaniu = ileWOpakowaniu;
		this.cena = cena;
		this.ileMiesiecyPrzydatny = ileMiesiecyPrzydatny;
	}
	
	public void wyswietl()
	{
		super.wyswietl();
		System.out.println("Id: "+id);
		System.out.println("Rodzaj: "+rodzaj);
		System.out.println("Iloœæ w Opakowaniu"+ileWOpakowaniu);
		System.out.println("Cena: "+cena);
		System.out.println("Jak d³ugo mo¿na u¿ywaæ (w miesiacach) : "+ileMiesiecyPrzydatny);
	}
	
	public float cenaZaSztuke()
	{
		return cena / (float)ileWOpakowaniu;
	}
	
	public float jakDlugoPrzydatne()
	{
		return ileMiesiecyPrzydatny;
	}
}

public class Malarstwo {
	public static void main(String[] args) {
		Przybory farby = new Przybory("Amsterdam", "Farby", "Holandia");
		farby.wyswietl();
		System.out.println("Producent: "+farby.getProducent());
		PrzyboryMalarskie akryle = new PrzyboryMalarskie(1, "Akrylowe", 12, 33.99f, 24, "Happy Color", "Farby", "Chiny");
		akryle.wyswietl();
		System.out.println("Cena za sztukê: "+ akryle.cenaZaSztuke());
		System.out.println("Mo¿na korzystaæ: "+akryle.jakDlugoPrzydatne()+" miesiec(e/y)");
	}
}
