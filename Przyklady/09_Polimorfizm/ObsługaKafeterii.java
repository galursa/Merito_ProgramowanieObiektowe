/*
 * Kafeteria
--
#nazwa: String
#godzinyOtwarcia: String
#liczbaMiejsc: Integer
--
+wyswietlInfo(): void
+setGodzinyOtwarcia(String godzinyOtwarcia): void
+setLiczbaMiejsc(int ile)
+wyswietlGodzinyOtwarcia():void
+getLiczbaMiejsc(): integer
*
**
 */
class Kafeteria
{
	protected String nazwa;
	protected String godzinyOtwarcia;
	protected int liczbaMiejsc;
	Kafeteria(String nazwa, String godzinyOtwarcia, int liczbaMiejsc)
	{
		this.nazwa = nazwa;
		this.godzinyOtwarcia = godzinyOtwarcia;
		this.liczbaMiejsc = liczbaMiejsc;
	}
	public void wyswietlInfo()
	{
		System.out.println("Kafeteria: "+ nazwa);
		System.out.println("Godziny otwarcia: "+godzinyOtwarcia);
		System.out.println("W lokalu mo¿e przebywaæ: "+liczbaMiejsc+" goœci");
	}
	public void setGodzinyOtwarcia(String godzinyOtwarcia)
	{
		this.godzinyOtwarcia = godzinyOtwarcia;
	}
	public void setLiczbaMiejsc(int ile)
	{
		liczbaMiejsc = ile;
	}
	public void wyswietlGodzinyOtwarcia()
	{
		System.out.println("Lokal "+nazwa+" jest otwarty w godzinach: "+godzinyOtwarcia);
	}
	public int getLiczbaMiejsc()
	{
		return liczbaMiejsc;
	}
}


/*
 * KawaHerbata
--
#rodzajNapoju: String
#pojemnoscFilizanki: integer
#dodatki: String
#godzinyOtwarcia: String
--
+wyswietlInfo():void

 */

class KawaHerbata extends Kafeteria
{
	protected String rodzajNapoju;
	protected int pojemnoscFilizanki;
	protected String dodatki;
	protected String godzinyOtwarcia;
	KawaHerbata(String nazwa, String godzinyOtwarcia, String godzinyOtwarcia2, int liczbaMiejsc,String rodzajNapoju,int pojemnoscFilizanki, String dodatki)
	{
		super(nazwa, godzinyOtwarcia,liczbaMiejsc );
		this.rodzajNapoju = rodzajNapoju;
		this.pojemnoscFilizanki = pojemnoscFilizanki;
		this.dodatki = dodatki;
		this.godzinyOtwarcia = godzinyOtwarcia2;
	}
	public void wyswietlInfo()
	{
		super.wyswietlInfo();
		System.out.println("Wybrano napoj: "+rodzajNapoju+" o pojemnosci+ "+pojemnoscFilizanki+ " ml.");
		System.out.println("Dodatki: "+dodatki);
		System.out.println("Napoj dostepny w godzinach: "+godzinyOtwarcia);
		System.out.println("Dziêkujemy i zapraszamy ponownie");
	}
	
}

public class Obs³ugaKafeterii {
	public static void main(String[] args) {
		KawaHerbata herbata = new KawaHerbata("Herbata i Kawa dla wszystkich", "10.00-21.00", "11.00-20.00", 20, "herbata z imbirem", 330, "imbir, cukier");
		herbata.wyswietlInfo();
		herbata.wyswietlGodzinyOtwarcia();
		System.out.println("Ile miejsc jest dostepnych: "+herbata.getLiczbaMiejsc());
	}
}
