class KwiatyDoniczkowe{
	String gatunek;
	boolean kwitnacy;
	int ileRoczny;
	float maxWysokosc;
	int ileWTygodniuPodlewamy;
	
	void wyswietl()
	{
		System.out.println("Gatunek: "+gatunek);
		System.out.print("Czy kwitnie: ");
		if(kwitnacy)
			System.out.print("tak");
		else 
			System.out.print("nie");
		System.out.println();
		System.out.println("Dlugosc zycia: "+ileRoczny+"-roczny.");
		System.out.println("Maksymalna wysokosc: "+maxWysokosc);
		System.out.println("Ile razy w tygodniu podlewamy: "+ileWTygodniuPodlewamy);
	}
}

public class Kwiaty {
	public static void main(String[] args) {
		KwiatyDoniczkowe fiolek = new KwiatyDoniczkowe();
		fiolek.gatunek = "Fio³ek Afrykañski";
		fiolek.kwitnacy = true;
		fiolek.ileRoczny = 10;
		fiolek.maxWysokosc = 10.00f;
		fiolek.ileWTygodniuPodlewamy = 2;
		fiolek.wyswietl();
		
		KwiatyDoniczkowe kalanchoe = new KwiatyDoniczkowe();
		kalanchoe.gatunek = "Kalanchoe";
		kalanchoe.kwitnacy = true;
		kalanchoe.ileRoczny = 1;
		kalanchoe.ileWTygodniuPodlewamy = 2;
		kalanchoe.maxWysokosc = 30;
		kalanchoe.wyswietl();
	}
}
