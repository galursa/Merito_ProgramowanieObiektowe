/*
 * TransportMiejski
--
#numerLini:String
#rozkladJazdy:String

--
+wyswietlInfo():void
 */
class TransportMiejski
{
	protected String numerLini;
	protected String rozkladJazdy;
	TransportMiejski(String numerLini, String rozkladJazdy)
	{
		this.numerLini = numerLini;
		this.rozkladJazdy = rozkladJazdy;
	}
	
	public void wyswietlInfo()
	{
		System.out.println("Numer lini: "+numerLini);
		System.out.println("Rozklad jazdy: "+ rozkladJazdy);
	}
}


/*
 * Autobusy
--
#kierowca: String
#uprawienia: String
#trasa: String
--
+wyswietlInfo():void
 */

class Autobusy extends TransportMiejski
{
	protected String kierowca;
	protected String uprawnienia;
	protected String trasa;
	Autobusy(String numerLini, String rozkladJazdy,	String kierowca, String uprawnienia,String trasa){
		super(numerLini, rozkladJazdy);
		this.kierowca = kierowca;
		this.uprawnienia = uprawnienia;
		this.trasa = trasa;
	}
	public void wyswietlInfo()
	{
		super.wyswietlInfo();
		System.out.println("Kierowca: "+kierowca);
		System.out.println("Prawo jazdy: "+uprawnienia);
		System.out.println("Trasa: "+trasa);
	}
}

public class Transport {
	public static void main(String[] args)
	{
		TransportMiejski warszawa = new TransportMiejski("112", "8: 23 45 23; 9: 12 45 56");
		warszawa.wyswietlInfo();
		System.out.println();
		Autobusy elektryczny = new Autobusy("114", "9: 12 34 56 12, 10: 12 23 34 45 57", "12345A", "98765ABC", "Mlociny - Brodno");
		elektryczny.wyswietlInfo();
		System.out.println();
		System.out.println(elektryczny.toString());
	}

}
