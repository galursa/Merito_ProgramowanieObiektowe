/*
Dwumian
--
#b: double
#c: double //bx+c 
--
+obliczWartosc(double x):double
+wyswietl():void
*/

class Dwumian{ //bx+c 
	protected double b;
	protected double c;
	Dwumian(double b, double c)
	{
		this.b = b;
		this.c = c;
	}
	public double obliczWartosc(double x)
	{
		return b*x+c;
	}
	
	public void wyswietl()
	{
		System.out.println("Dwumian:");
		System.out.println("W(x)="+b+"*x"+"+"+c);
	}
	
	public void czyZeruje(double x)
	{
		if(obliczWartosc(x)==0)
		{
			System.out.println("Liczba x="+x+" jest pierwiastkiem dwumianu");
		}else {
			System.out.println("Liczba x="+x+" nie jest pierwiastkiem dwumianu");
		}
	}
	public double miejsceZerowe()
	{
		return - c/b;
	}
	
}
/*
Wielomian
--
#a: double  // ax^2+bx+c
--
+obliczWartosc(double x):double
+wyswietl():void

*/

class Wielomiany extends Dwumian
{
	protected double a;
	Wielomiany(double a, double b, double c)
	{
		super(b,c);
		this.a = a;
	}
	public double obliczWartosc(double x)
	{
		return a*x*x+b*x+c;
	}
	public void wyswietl()
	{
		super.wyswietl();
		System.out.println("Wielomian:");
		System.out.println("W(x)="+a+"x^2+"+b+"*x"+"+"+c);
	}
	public void czyZeruje(double x)
	{
		if(obliczWartosc(x)==0)
		{
			System.out.println("Liczba x="+x+" jest pierwiastkiem dwumianu");
		}else {
			System.out.println("Liczba x="+x+" nie jest pierwiastkiem dwumianu");
		}
	}
	public double delta()
	{
		return b*b-4*a*c;
	}
	
	public void pierwiastki()
	{
		double d = delta();
		if(d<0)
		{
			System.out.println("Brak pierwiastkow");
		}else if (d==0)
		{
			double p0 = -b/(2*a);
			System.out.println("Jeden pierwiastek x0= "+p0);
		}else if (d>0)
		{
			double p1 = (-b-Math.sqrt(d))/(2*a);
			double p2 = (-b+Math.sqrt(d))/(2*a);
			System.out.println("Dwa Pierwiastki");
			System.out.println("p1="+p1);
			System.out.println("p2="+p2);
		}
	}
	
}

public class Wielomian {
	public static void main(String[] args) {
		Dwumian d1 = new Dwumian(1.5,2);
		d1.wyswietl();
		System.out.println("W(2) = "+d1.obliczWartosc(2.0));
		d1.czyZeruje(3.5);
		System.out.format("Miejsce zerowe = %2.2f",d1.miejsceZerowe());
		System.out.println();
		Wielomiany w1 = new Wielomiany(2,3,1);
		w1.wyswietl();
		System.out.println("W(2) = "+w1.obliczWartosc(2.0));
		w1.czyZeruje(1);
		w1.pierwiastki();
	}
}
