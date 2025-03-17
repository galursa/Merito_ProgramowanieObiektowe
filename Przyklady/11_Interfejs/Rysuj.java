import java.util.Scanner;

abstract class PrzyboryDoRysowania
{
	public float CenaZaOpakownie;
	public int iloscWOpakowaniu;
	public String marka;
	abstract float CenaZaSztuke();
	abstract void wyswietlInfo();
}
interface IRysowanie
{
	int ilosckolorow = 100;
	public void wyswietlTechniki();
	public void gdzieMoznaRysowac();	
}

class Flamastry extends PrzyboryDoRysowania implements IRysowanie{
	int ileWytrzymujaBezZatyczki;
	boolean czyMoznaWyprobowac;
	Flamastry(float CenaZaOpakownie, int iloscWOpakowaniu, String marka, int ileWytrzymujaBezZatyczki, boolean czyMoznaWyprobowac)
	{
		this.CenaZaOpakownie = CenaZaOpakownie;
		this.iloscWOpakowaniu = iloscWOpakowaniu;
		this.marka = marka;
		this.ileWytrzymujaBezZatyczki = ileWytrzymujaBezZatyczki;
		this.czyMoznaWyprobowac = czyMoznaWyprobowac;
	}
	boolean czyMoznaWyprobowac()
	{
		return czyMoznaWyprobowac;
	}
	float CenaZaSztuke()
	{
		return CenaZaOpakownie/(float)iloscWOpakowaniu;
	}
	void wyswietlInfo()
	{
		System.out.println("Flamastry");
		System.out.println("Marka: "+marka);
		System.out.println("Cena: "+CenaZaOpakownie);
		System.out.println("Cena jednej sztuki: "+CenaZaSztuke());
		System.out.println("Ile godzin wytrzymaj¹ bez zatyczki: "+ileWytrzymujaBezZatyczki);
		System.out.print("Czy mo¿na wypróbowaæ? ");
		if(czyMoznaWyprobowac())
			System.out.print("Tak.");
		else
			System.out.print("Nie.");
	}
	public void wyswietlTechniki()
	{
		System.out.println("Mo¿na rysowaæ po powierzchni, mo¿na rozpuszczaæ alkoholem");
	}
	public void gdzieMoznaRysowac() 
	{
		System.out.println("Mo¿na rysowaæ na specjalnym papierze do pisaków alkoholowych, na ceramice, na szkle, na drewnie");
	}
}


class Kredki extends PrzyboryDoRysowania{
	String oprawka;
	Kredki(float CenaZaOpakownie, int iloscWOpakowaniu, String marka, String oprawka)
	{
		this.CenaZaOpakownie = CenaZaOpakownie;
		this.iloscWOpakowaniu = iloscWOpakowaniu;
		this.marka = marka;
		this.oprawka = oprawka;
	}

	float CenaZaSztuke()
	{
		return CenaZaOpakownie/(float)iloscWOpakowaniu;
	}
	boolean czyLamiaSie()
	{
		System.out.println("Czy kredki siê ³ami¹? T/N");
		Scanner dane = new Scanner(System.in);
		String tak;
		tak = dane.next();
		if (tak=="T")
			return true;
		else
			return false;
	}
	
	void wyswietlInfo()
	{
		System.out.println("Kredki");
		System.out.println("Marka: "+marka);
		System.out.println("Cena: "+CenaZaOpakownie);
		System.out.println("Cena jednej sztuki: "+CenaZaSztuke());
		System.out.println("Czy ³ami¹ siê? ");
		if(czyLamiaSie())
			System.out.println("Tak.");
		else
			System.out.println("Nie.");
	}
}

public class Rysuj {
	public static void main(String[] args) {
		Flamastry promarker = new Flamastry(59.99f, 6, "ProMarker", 1, true);
		System.out.println("To s¹ informacje dotycz¹ce flamastrów");
		System.out.println("Czy mo¿na pisaæ zanim siê kupi" + promarker.czyMoznaWyprobowac());
		System.out.println("Cena: "+promarker.CenaZaSztuke());
		promarker.wyswietlInfo();
		promarker.gdzieMoznaRysowac();
		promarker.wyswietlTechniki();
		System.out.println();
		System.out.println("To s¹ informacje dotycz¹ce kredek");
		Kredki kolorowe = new Kredki(60,24, "Koh-I-Nor","Drewniana");
		System.out.println("Czy siê ³ami¹ "+kolorowe.czyLamiaSie());
		System.out.println("Cena: "+kolorowe.CenaZaSztuke());
		kolorowe.wyswietlInfo();
	}
}
