class Prostokat{
	double a;
	double b;
	int ileBokow;
	float dlugoscBoku;
	
	Prostokat()
	{
		a=1;
		b=1;
	}
	
	Prostokat(double bok)
	{
		a = bok;
		b = bok;
	}
	
	Prostokat(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	void wyswiet()
	{
		System.out.println("Boki: a="+a+", b="+b);
	}
	
	double pole()
	{
		return a*b;
	}
	
	double obwodDowolnejFigury(double ... boki)
	{
		double suma =0.0f;
		for ( double bok : boki)
		{
			suma+=bok;
		}
		return suma;
	}
	
}


public class PolaPowierzchni {
	public static void main(String[] args) {
		Prostokat a1 = new Prostokat();
		Prostokat a2 = new Prostokat(3);
		Prostokat a3 = new Prostokat(2,4);
		a1.wyswiet();
		a2.wyswiet();
		a3.wyswiet();
		System.out.println("Pole powierzchni 1: "+a1.pole());
		System.out.println("Pole powierzchni 2: "+a2.pole());
		System.out.println("Pole powierzchni 3: "+a3.pole());
		System.out.println(a1.obwodDowolnejFigury(1));
		System.out.println(a1.obwodDowolnejFigury(1,2));
		System.out.println(a1.obwodDowolnejFigury(1,2,3));
		System.out.println(a1.obwodDowolnejFigury(1,2,3,4));
	}
}
