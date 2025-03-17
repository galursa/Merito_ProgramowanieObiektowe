//Chcemy przechowywaæ informacje o przyborach do rysowania
interface IPrzybory
{
	public void wyswietlNazwe();
	public int ilosc();
	public double cenaZaOpakowanie();
	public double cenaZaSztuke();
	public void tworzenieEtykiety();
}

class Kredka implements IPrzybory
{
	private String nazwa;
	private int iloscWOpakowaniu;
	private String firma; 
	private double cenaZaOpakowanie;
	Kredka(String nazwa,int iloscWOpakowaniu, String firma, double cenaZaOpakowanie)
	{
		this.nazwa = nazwa;
		this.iloscWOpakowaniu = iloscWOpakowaniu;
		this.firma = firma;
		this.cenaZaOpakowanie = cenaZaOpakowanie;
	}
	public void wyswietlNazwe()
	{
		System.out.println("Nazwa produktu "+nazwa);
	}
	public int ilosc()
	{
		return iloscWOpakowaniu;
	}
	public double cenaZaOpakowanie()
	{
		return cenaZaOpakowanie;
	}
	public double cenaZaSztuke()
	{
		return cenaZaOpakowanie/iloscWOpakowaniu;
	}
	public String zwrocNazwe()
	{
		return nazwa;
	}
	
	public String zwrocFirme()
	{
		return firma;
	}
	public void tworzenieEtykiety()
	{
		System.out.println(firma);
		System.out.println();
		System.out.println(nazwa+" "+cenaZaOpakowanie);
		System.out.println();
		System.out.println("1 sztuka / " + cenaZaSztuke());
	}
}


public class artysta {
	public static void main(String[] args) {
		Kredka swiecowe = new Kredka("Œwiecowe", 12, "Kolorowe Kredki", 5.0);
		swiecowe.wyswietlNazwe();
		System.out.println("Ilosc w opakowaniu: "+swiecowe.ilosc());
		System.out.println("Cena za opakowanie: "+swiecowe.cenaZaOpakowanie());
		System.out.println("Cena za sztuke: "+swiecowe.cenaZaSztuke());
		System.out.println("Nazwa: "+swiecowe.zwrocNazwe());
		System.out.println("Firma: "+swiecowe.zwrocFirme());
		System.out.println();
		swiecowe.tworzenieEtykiety();	
		
	}
}
