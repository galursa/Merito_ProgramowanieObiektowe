//tworzymy klasê z funkcjami y=ax i klasê z funkcjami y=ax+b

class FunkcjaAX{
	protected double a;
	FunkcjaAX(double a)
	{
		this.a = a;
	}
	public double f(double x)
	{
		return this.a*x;
	}
	public void wyswietlTabele()
	{
		System.out.println("------------");
		System.out.println("| x | f(x) |");
		System.out.println("------------");
		for(int i=-2;i<=2 ;i++)
		{
			System.out.println("| "+i+" |"+ f(i)+" |" );
		}

	}
}

class FunkcjaAXPlusB extends FunkcjaAX
{
	protected double b;
	FunkcjaAXPlusB(double a, double b)
	{
		super(a);
		this.b = b;
	}
	public double f(double x)
	{
		return this.a*x+b;
	}
	
}


public class FunkcjeMatematyczne {
	public static void main(String[] args) {
		FunkcjaAX f1 = new FunkcjaAX(1);
		f1.wyswietlTabele();
		FunkcjaAXPlusB f2 = new FunkcjaAXPlusB(1, 1);
		f2.wyswietlTabele();
	}
}
