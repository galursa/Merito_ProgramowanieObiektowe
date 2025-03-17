interface Ssaki
{
	void dajGlos();
	double masa();
	static void info()
	{
		System.out.println();
		System.out.println("To jest Metoda Statyczna");
	}
}

interface Psy extends Ssaki
{
	void merdajOgonem();
	default void sprzatnij()
	{
		System.out.print("Woreczek, ³opatka, kosz");	
	}
}

class Ratlerek implements Psy
{
	public void dajGlos() {
		System.out.println("HAUUUU, HAUUUUU, HAUUUU");
	}
	public double masa()
	{
		return 4.5;
	}
	public void merdajOgonem()
	{
		System.out.println("\\ / \\ / \\ / \\ /");
	}
}

public class Zwierzaki {
	public static void main(String[] args) {
		Ratlerek reksio = new Ratlerek();
		reksio.dajGlos();
		System.out.println("Waga "+reksio.masa());
		reksio.merdajOgonem();	
		reksio.sprzatnij();
		Ssaki.info();
	}
}
