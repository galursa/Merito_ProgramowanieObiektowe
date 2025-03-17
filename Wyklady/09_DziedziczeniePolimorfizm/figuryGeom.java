
class FiguryGeometryczne{
	public int bok;
	protected String nazwa;
	FiguryGeometryczne(int a, String n)
	{
		bok = a;
		nazwa = n;
	}
	
	public void wyswietlFig() {
		System.out.println("Klasa figury geometryczne");
		System.out.println("Bok = "+ bok);
		System.out.println("Nazwa = "+ nazwa);
	}
}

class Prostokat extends FiguryGeometryczne{
	public int bok; // przes³ania bok z klasy bazowej
	public  int bok2;
	Prostokat(int a, int b, String n)
	{
		super(a, n);
		bok2 = b;
		bok = a*2;
	}
	public void wyswietlProstokat() {
		System.out.println("Klasa Prostokat");
		System.out.println("Bok 1, klasa Prostokat = "+ bok);
		System.out.println("Bok 1, klasa nadrzêdna = "+ super.bok);
		System.out.println("Bok 2 = "+ bok2);
		System.out.println("Nazwa = "+ nazwa);
	}
}
public class figuryGeom {
	public static void main(String[] args) {
		FiguryGeometryczne fig1 = new FiguryGeometryczne(2, "kwadrat");
		fig1.wyswietlFig();
		Prostokat fig2 = new Prostokat(3, 4, "Prostokat");
		fig2.wyswietlProstokat();
	}
}
