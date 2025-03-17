class Okrag
{
	double r;
	double obwod()
	{
		return 2*Math.PI*r;
	}
	double pole()
	{
		return Math.PI*r*r;
	}
}


public class KlasaOkrag {
	public static void main(String[] args) {
		Okrag o1 = new Okrag();
		o1.r = 1;
		System.out.println(o1.obwod());
		System.out.println(o1.pole());
		Okrag o2 = new Okrag();
		o2.r = 3;
		System.out.println(o2.obwod());
		System.out.println(o2.pole());
	}
}
