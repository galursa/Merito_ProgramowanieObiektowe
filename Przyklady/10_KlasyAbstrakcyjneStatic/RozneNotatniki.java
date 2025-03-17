/*
 * Notatniki
--
#nazwa: String
#gramatura: int
#rozmiar: String
#liczbaKartek: int
#cena:double
--
/+info():void/
/+nadajCene(cena: double): void/
 */

abstract class Notatniki
{
	protected String nazwa;
	protected int gramatura;
	protected String rozmiar;
	protected int liczbaKartek;
	protected double cena;
	abstract public void into();
	abstract public void nadajCene(double cena);
}

/*
 * NotatnikiAkademickie
--
#liniatura: String
--
/+info():void/
/+nadajCene(cena: double)/
 * 
 */

class NotatnikiAkademickie extends Notatniki
{
	protected String liniatura;
	NotatnikiAkademickie(String nazwa, int gramatura, String rozmiar, int liczbaKartek, double cena, String liniatura)
	{
		this.nazwa = nazwa;
		this.gramatura = gramatura;
		this.rozmiar = rozmiar;
		this.liczbaKartek = liczbaKartek;
		this.cena = cena;
		this.liniatura = liniatura;
	}
	public void into()
	{
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Gramatura: "+gramatura);
		System.out.println("Rozmiar: "+rozmiar);
		System.out.println("Liczba kartek: "+liczbaKartek);
		System.out.println("Liniatura: "+liniatura);
		System.out.println("Cena: "+cena+" zl");
		System.out.println();
	}
	public void nadajCene(double cena)
	{
		this.cena = cena; 
	}
}

/*
 * Szkicowniki
--
#przeznaczenie: String
--
/+info():void/
/+nadajCene(cena: double)/

 */
class Szkicowniki extends Notatniki
{
	protected String przeznaczenie;
	Szkicowniki(String nazwa, int gramatura, String rozmiar, int liczbaKartek, double cena, String przeznaczenie)
	{
		this.nazwa = nazwa;
		this.gramatura = gramatura;
		this.rozmiar = rozmiar;
		this.liczbaKartek = liczbaKartek;
		this.cena = cena;
		this.przeznaczenie = przeznaczenie;
	}
	public void into()
	{
		System.out.println("Nazwa: "+nazwa);
		System.out.println("Gramatura: "+gramatura);
		System.out.println("Rozmiar: "+rozmiar);
		System.out.println("Liczba kartek: "+liczbaKartek);
		System.out.println("Przeznaczenie: "+przeznaczenie);
		System.out.println("Cena: "+cena+" zl");
		System.out.println();
	}
	public void nadajCene(double cena)
	{
		this.cena = cena*0.95; 
	}
}


public class RozneNotatniki {
	public static void main(String[] args) {
		NotatnikiAkademickie wKratke = new NotatnikiAkademickie("Zeszyt w kratke", 120, "B5", 100, 19.55, "w kratke");
		wKratke.into();
		wKratke.nadajCene(15.99);
		wKratke.into();
		Szkicowniki doRysowania = new Szkicowniki("Szkicownik", 240, "A3", 10, 8.99, "Rysunek o³ówkiem, kredkami, pastelami");
		doRysowania.into();
		doRysowania.nadajCene(10);
		doRysowania.into();	
		}
}
