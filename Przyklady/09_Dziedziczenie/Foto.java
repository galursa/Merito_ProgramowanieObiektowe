/*
 * Aparaty
--
#cena : double
#obiektyw : String
#rodzaj: String
#rokProdukcji: int
--
+info: void

A
|
|

Analogowy
--
#rodzajKliszy : String
#wielkoscKliszy: double
#mierzenieEkspozycji: boolean
--
+analogowyInfo: void
+rabat : double

 */

class Aparaty{
	protected double cena; 
	protected String obiektyw;
	protected String rodzaj; 
	protected int rokProdukcji;
	Aparaty(double cena,String obiektyw, String rodzaj, int rokProdukcji ){
		this.cena = cena;
		this.obiektyw = obiektyw;
		this.rodzaj = rodzaj;
		this.rokProdukcji = rokProdukcji;
	}
	public void info()
	{
		System.out.println("Rodzaj: "+rodzaj);
		System.out.println("Rok produkcji: "+rokProdukcji);
		System.out.println("Zawiera obiektyw: "+obiektyw);
		System.out.println("Cena: "+cena+" zl.");
	}
	public double getCena()
	{
		return cena;
	}
	public String getObiektyw()
	{
		return obiektyw;
	}
	public String getRodzaj()
	{
		return rodzaj;
	}
	public int getRokProdukcji()
	{
		return rokProdukcji;
	}
}

class Analogowy extends Aparaty
{
	protected String rodzajKliszy;
	protected double wielkoscKliszy;
	protected boolean czyMaSwiatlomierz;
	Analogowy(String rodzajKliszy, double wielkoscKliszy, boolean czyMaSwiatlomierz, double cena,String obiektyw, String rodzaj, int rokProdukcji )
	{
		super(cena,obiektyw, rodzaj, rokProdukcji);
		this.rodzajKliszy = rodzajKliszy;
		this.wielkoscKliszy = wielkoscKliszy;
		this.czyMaSwiatlomierz = czyMaSwiatlomierz;
	}
	public void analogowyInfo()
	{
		System.out.println("Rodzaj kliszy: "+rodzajKliszy);
		System.out.println("Wielkoœæ kliszy: "+wielkoscKliszy);
		System.out.print("Czy ma swiatlomierz: ");
		if(czyMaSwiatlomierz)
		{
			System.out.print("tak");
		} else
		{
			System.out.print("nie");
		}
		System.out.println();
	}
	public double rabat(double procent)
	{
		return procent*cena;
	}
	
	public String getRodzajKliszy()
	{
		return rodzajKliszy;
	}
	public double getWielkoscKliszy()
	{
		return wielkoscKliszy;
	}
	public boolean getCzyMaSwiatlomierz()
	{
		return czyMaSwiatlomierz;
	}
	
}

public class Foto {
	public static void main(String[] args) {
		Aparaty aparat1 = new Aparaty(1999.99,"Staly", "cyfrowy", 2000);
		aparat1.info();
		Analogowy aparat2 = new Analogowy("czarno-biala", 120, false, 999.99, "staly", "analogowy",1965);
		aparat2.info();
		aparat2.analogowyInfo();
		System.out.println("Przyklad uzycia gettera dla zmiennej cena: "+aparat2.getCena());
		
	}
}
