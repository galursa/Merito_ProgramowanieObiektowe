interface FiguryGeom {
 	public double obwod();
 	public double pole();
 	public void info();
}

interface StaleMatem{
	double Pi = 3.14159265;
	double e = 2.71828183;
	double Fi = 1.61803399;
}

class Kola implements FiguryGeom, StaleMatem{
	private double r;
	Kola(double r){
		this.r = r;
	}
	public double pole() {
		return Pi*r*r;
	}
	public double obwod() {
		return 2*Pi*r;
	}
	public void info()
	{
		System.out.println("To jest ko³o.");
	}
}

class Prostokaty implements FiguryGeom{
	private double a;
	private double b;
	Prostokaty(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double pole(){
		return a*b;
	}
 	public double obwod(){
 		return 2*a+2*b;
 	}
 	public void info()
	{
		System.out.println("To jest Prostok¹t.");
	}
}

abstract class poligon implements FiguryGeom{
	public void info()
	{
		System.out.println("To jest wielok¹t");
	}
}

public class interfejsFigury {
	public static void main(String[] args)
	{
		Kola k = new Kola(4);
		Prostokaty p = new Prostokaty(1,2);
		k.info();
		System.out.println(k.pole());
		System.out.println(k.obwod());
		p.info();
		System.out.println(p.pole());
		System.out.println(p.obwod());
	}
}
