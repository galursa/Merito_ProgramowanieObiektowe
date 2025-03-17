abstract class Figury{
	public String nazwa;
	abstract double pole();
	void info(){
		System.out.println(nazwa);
	}
}

class Prostokat extends Figury{
	private double a;
	private double b;
	Prostokat(double a, double b){
		this.a = a;
		this.b = b;
	}
	double pole(){
		return a*b;
	}
}

class Kolo extends Figury{
	private double r;
	Kolo(double r){
		this.r = r;
	}
	double pole() {
		return 3.14*r*r;
	}
}
public class rozneFigury {
	public static void main(String[] args)
	{
		Kolo k = new Kolo(2);
		Prostokat p = new Prostokat(1,2);
		k.nazwa = "Ko³o";
		p.nazwa = "Prostok¹t";
		System.out.print(k.nazwa+" ");
		System.out.println(k.pole());
		System.out.print(p.nazwa+" ");
		System.out.println(p.pole());
		Figury f;
		f = k;
		System.out.print(f.nazwa+" ");
		System.out.println(f.pole());	
	}
}
