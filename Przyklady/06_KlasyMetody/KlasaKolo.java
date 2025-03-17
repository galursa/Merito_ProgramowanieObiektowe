class Kolo{
	double r;
	
	double pole()
	{
		return Math.PI*r*r;
	}
	
	double obwod()
	{
		return 2*Math.PI*r;
	}
	
}

public class KlasaKolo {
	public static void main(String[] args) {
		Kolo k =  new Kolo();
		k.r = 1;
		System.out.println("Pole: "+k.pole());
		System.out.println("Obwod: "+k.obwod());
		Kolo k1 = new Kolo();
		k1.r=2.5;
		System.out.println("Pole: "+k1.pole());
		System.out.println("Obwod: "+k1.obwod());
		
		
	}
}
