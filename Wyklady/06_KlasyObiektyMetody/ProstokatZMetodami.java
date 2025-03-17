class Prostokaty{
	double a;
	double b;
	double obwod()
	{
		return 2*a+2*b;
	}
	void podwojenie()
	{
		a=2*a;
		b=2*b;
	}
	void powieksz(double ile)
	{
		a=ile*a;
		b=ile*b;
	}
}

public class ProstokatZMetodami {
	public static void main(String[] args) {
	Prostokaty prost = new Prostokaty();
	prost.a = 3.5;
	prost.b = 2;
	System.out.println("Pole prostok¹ta ="+prost.a*prost.b);
	System.out.println(prost.obwod());
	prost.podwojenie();
	System.out.println(prost.obwod());
	prost.powieksz(2.5);
	System.out.println(prost.obwod());
	}
}
