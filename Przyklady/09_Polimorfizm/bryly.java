class Szescian{
	protected double a;
	Szescian(double a)
	{
		this.a = a;
	}
	
	public double objetosc()
	{
		return a*a*a;
	}
	
	public double pole()
	{
		return 6*a*a;
	}
	
	void wyswietl()
	{
		System.out.println("Szescian, bok = "+a);
		System.out.println("Szescian, objetosc = "+objetosc());
		System.out.println("Szescian, pole = "+pole());
	}
}

class ProstopadloscianZKostki extends Szescian
{
	protected double b;
	protected double c;
	ProstopadloscianZKostki(double a)
	{
		super(a);
		b = a;
		c = 2*a;		
	}
	public double objetosc()
	{
		return super.objetosc()*2;
	}
	public double pole()
	{
		return 2*a*a+4*a*c;
	}
	void wyswietl()
	{
		System.out.println("Prostopadloscian, boki: a = "+a+", b = "+b+", c = "+c);
		System.out.println("Prostopadloscian, objetosc = "+objetosc());
		System.out.println("Prostopadloscian, objetosc z klasy bazowej = "+super.objetosc());
		System.out.println("Prostopadloscian, pole = "+pole());
		System.out.println("Prostopadloscian, pole z klasy bazowej= "+super.pole());	
	}	
}

public class bryly {
	public static void main(String[] args) {
		Szescian s = new Szescian(2);
		s.wyswietl();
		ProstopadloscianZKostki p = new ProstopadloscianZKostki(3);
		p.wyswietl();
	}
}
