class Potrawy{
	protected String nazwa;
	protected String kategoria;
	
	Potrawy(String nazwa, String kategoria)
	{
		this.nazwa = nazwa;
		this.kategoria = kategoria;
	}
	
	public void wyswietl()
	{
		System.out.println("Potrawa: "+nazwa);
		System.out.println("Kategoria: "+kategoria);	
	}
	
	public void setNazwa(String nazwa)
	{
		this.nazwa = nazwa;
	}
	
	public void setKategoria(String kategoria)
	{
		this.kategoria = kategoria;
	}
	
	public String getNazwa()
	{
		return nazwa;
	}
	
	public String getKategoria()
	{
		return kategoria;
	}
	
}

class Salatka extends Potrawy
{
	String skladniki;
	double kalorie;
	int porcja;
	
	Salatka(String nazwa, String kategoria, String skladniki, double kalorie, int porcja)
	{
		super(nazwa, kategoria);
		this.skladniki = skladniki;
		this.kalorie = kalorie;
		this.porcja = porcja;
	}
	
	public void wyswietl()
	{
		super.wyswietl();
		System.out.println("Sk³adniki: "+skladniki);
		System.out.println("Kalorie: "+kalorie);
		System.out.println("Porcja: "+porcja);
	}
}


public class bar {
	public static void main(String[] args) {
		Potrawy p1 = new Potrawy("Potrawy", "Wszystkie");
		p1.wyswietl();
		System.out.println("Nazwa: "+p1.getNazwa());
		System.out.println("Kategoria: "+p1.getKategoria());
		p1.setNazwa("Sa³atka");
		p1.setKategoria("Bezmiêsne");
		System.out.println("Nazwa: "+p1.getNazwa());
		System.out.println("Kategoria: "+p1.getKategoria());
		Salatka marchewkowa = new Salatka("Marchewkowa", "Salatki", "1 Marchewka,1  jab³ko, 1 ³y¿eczka cukier, 1 ³y¿eczka soku z cytryny", 150, 1);
		marchewkowa.wyswietl();
	}
}
