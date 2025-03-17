class Prostokat{
	double a;
	double b;
}

public class PierwszaKlasa {
	public static void main(String[] args) {
	Prostokat prost = new Prostokat();
	prost.a = 3.5;
	prost.b = 2;
	System.out.println("Pole prostok¹ta ="+prost.a*prost.b);
	}
}
