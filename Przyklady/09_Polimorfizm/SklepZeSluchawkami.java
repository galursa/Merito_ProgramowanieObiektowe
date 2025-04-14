/*
 * Sluchawki
--
#producent: String
#cena: double
#wymiar: String
#czyPrzewodowe: Boolean
#pasmoPrzenoszeniaDol: int
#pasmoPrzenoszeniaGora: int
#rodzajWtyku: String
--
Sluchawki()
gettery
settery
wyswietlInfo():void
vat():double
*/

class Sluchawki
{
	protected String producent;
	protected double cena;
	protected String wymiar;
	protected boolean czyPrzewodowe;
	protected int pasmoPrzenoszeniaDol;
	protected int pasmoPrzenoszeniaGora;
	protected String rodzajWtyku;
	Sluchawki(String producent, double cena, String wymiar, boolean czyPrzewodowe,int pasmoPrzenoszeniaDol,int pasmoPrzenoszeniaGora,String rodzajWtyku )
	{
		this.producent = producent;
		this.cena = cena;
		this.wymiar = wymiar;
		this.czyPrzewodowe = czyPrzewodowe;
		this.pasmoPrzenoszeniaDol = pasmoPrzenoszeniaDol;
		this.pasmoPrzenoszeniaGora = pasmoPrzenoszeniaGora;
		this.rodzajWtyku = rodzajWtyku;
	}
	public String getProducent() {
		return producent;
	}
	public void setProducent(String producent) {
		this.producent = producent;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getWymiar() {
		return wymiar;
	}
	public void setWymiar(String wymiar) {
		this.wymiar = wymiar;
	}
	public boolean isCzyPrzewodowe() {
		return czyPrzewodowe;
	}
	public void setCzyPrzewodowe(boolean czyPrzewodowe) {
		this.czyPrzewodowe = czyPrzewodowe;
	}
	public int getPasmoPrzenoszeniaDol() {
		return pasmoPrzenoszeniaDol;
	}
	public void setPasmoPrzenoszeniaDol(int pasmoPrzenoszeniaDol) {
		this.pasmoPrzenoszeniaDol = pasmoPrzenoszeniaDol;
	}
	public int getPasmoPrzenoszeniaGora() {
		return pasmoPrzenoszeniaGora;
	}
	public void setPasmoPrzenoszeniaGora(int pasmoPrzenoszeniaGora) {
		this.pasmoPrzenoszeniaGora = pasmoPrzenoszeniaGora;
	}
	public String getRodzajWtyku() {
		return rodzajWtyku;
	}
	public void setRodzajWtyku(String rodzajWtyku) {
		this.rodzajWtyku = rodzajWtyku;
	}
	
	public void wyswietlInfo()
	{
		System.out.println("Producent: "+producent);
		System.out.println("Wymiary: "+wymiar);
		System.out.print("Czy przewodowe: ");
		if(czyPrzewodowe)
		{
				System.out.print("tak \n");
				System.out.println("Rodzaj styku: "+rodzajWtyku);
		}
		else
		{
			System.out.print("nie \n");
		}
		System.out.println("Pasmo przenoszenia: "+pasmoPrzenoszeniaDol+" Hz - "+pasmoPrzenoszeniaGora+" Hz");
		
		System.out.printf("Cena: %1.2f %n",cena);
	}
	public double vat()
	{
		return 0.12*cena;
	}
}



/*


Nauszne
--
#mocowanieNaGlowie: String
#rodzajSluchawkiNausznej: String
--
Nauszne()
gettery
settery
wyswietlInfo():void
 */

class Nauszne extends Sluchawki
{
	protected String mocowanieNaGlowie;
	protected String rodzajSluchawkiNausznej;
	Nauszne(String mocowanieNaGlowie,String rodzajSluchawkiNausznej,String producent, double cena, String wymiar, boolean czyPrzewodowe,int pasmoPrzenoszeniaDol,int pasmoPrzenoszeniaGora,String rodzajWtyku )
	{
		super(producent, cena, wymiar, czyPrzewodowe,pasmoPrzenoszeniaDol,pasmoPrzenoszeniaGora,rodzajWtyku);
		this.mocowanieNaGlowie = mocowanieNaGlowie;
		this.rodzajSluchawkiNausznej = rodzajSluchawkiNausznej;
	}
	public String getMocowanieNaGlowie() {
		return mocowanieNaGlowie;
	}
	public void setMocowanieNaGlowie(String mocowanieNaGlowie) {
		this.mocowanieNaGlowie = mocowanieNaGlowie;
	}
	public String getRodzajSluchawkiNausznej() {
		return rodzajSluchawkiNausznej;
	}
	public void setRodzajSluchawkiNausznej(String rodzajSluchawkiNausznej) {
		this.rodzajSluchawkiNausznej = rodzajSluchawkiNausznej;
	}
	
	public void wyswietlInfo()
	{
		super.wyswietlInfo();
		System.out.println("Mocowanie na glowie: "+mocowanieNaGlowie);
		System.out.println("Rodzaj sluchawki: "+rodzajSluchawkiNausznej);
	}
}


public class SklepZeSluchawkami {

	public static void main(String[] args) {
		Sluchawki xyz123 = new Sluchawki("Cisza", 101.99, "Wysokosc -23 cm ", true, 16, 16000, "mini Jack");  
		xyz123.wyswietlInfo();
		System.out.println("Vat: "+xyz123.vat());

		xyz123.setCena(99.99);
		System.out.println("Biezaca cena: "+xyz123.getCena() );
		Nauszne abc = new Nauszne("Skladany palak", "Obejmujaca cala malzowine uszna","Muzyka", 51.00, "Wysokosc, szerokosc, glebokosc ", false, 20, 18000, "brak" );
		abc.wyswietlInfo();
		System.out.println("Vat: "+abc.vat());
		System.out.println("Biezaca cena: "+abc.getCena() );
	}

}
