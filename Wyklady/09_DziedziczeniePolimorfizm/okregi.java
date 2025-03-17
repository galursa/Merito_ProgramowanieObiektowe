class Okrag
{
	protected int r;
	Okrag(int r)
	{
		this.r = r;
	}
	final void wypiszDane()
	{
		System.out.println("Promieñ  = "+r);
	}
}

class Polokrag extends Okrag
{
	protected double pole;
	Polokrag(int r)
	{
		super(r);
	}
	void wypiszPole()
	{
		pole = 0.5*3.14*r*r;
		System.out.println("Pole pó³okrêgu wynosi: "+pole);
	}
}


public class okregi {
	public static void main(String[] args) {
		Polokrag po1 = new Polokrag(2);
		po1.wypiszPole();
	}
}
