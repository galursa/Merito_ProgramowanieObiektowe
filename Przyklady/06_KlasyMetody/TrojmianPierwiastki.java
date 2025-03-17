class TrojKwadratowy{
	// a*x^2+b*x+c=0
	double a;
	double b;
	double c;
	
	void wyswietl()
	{
		System.out.println(a+"*x^2+"+b+"*x+"+c+"=0");
	}
	
	double delta()
	{
		return b*b - 4*a*c;
	}
	
	double x1()   //x1=-b-|delta/2a
	{
		return (-b - Math.sqrt(this.delta()))/(2*a);
	 }
	double x2()   //x1=-b-|delta/2a
	{
		return (-b + Math.sqrt(this.delta()))/(2*a);
	}
	 
	void pierwiastki()
	{
		double d = this.delta();
		if (d<0)
		{
			System.out.println("Delta ujemna. Brak pierwiastków");
		}else if (d==0)
		{
			System.out.println("Delta równa zero. ");
			System.out.println("Jeden pierwiastek = "+this.x1());
		} else {
			System.out.println("Mamy dwa pierwiastki.");
			System.out.println( "x1 = " + this.x1() +",");
			System.out.println("x2 = " + this.x2());
		}
	}
	
}


public class TrojmianPierwiastki {
	public static void main(String[] args) {
		TrojKwadratowy trojmian = new TrojKwadratowy();
		trojmian.a = 1; //delta ujemna
		trojmian.b = 2;
		trojmian.c = 3;
		trojmian.wyswietl();
		System.out.println("Delta ="+trojmian.delta());
		trojmian.pierwiastki();
		TrojKwadratowy trojmian1 = new TrojKwadratowy();
		trojmian1.a = 2; //delta dodatnia
		trojmian1.b = 5;
		trojmian1.c = 1;
		trojmian.wyswietl();
		System.out.println("Delta ="+trojmian1.delta());
		trojmian1.pierwiastki();
		TrojKwadratowy trojmian2 = new TrojKwadratowy();
		trojmian2.a = 2; //delta równa zero
		trojmian2.b = 4;
		trojmian2.c = 2;
		trojmian.wyswietl();
		System.out.println("Delta ="+trojmian2.delta());
		trojmian2.pierwiastki();
	}
}
