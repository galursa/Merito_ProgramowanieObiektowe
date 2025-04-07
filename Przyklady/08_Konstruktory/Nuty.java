/*
 * NutyDlaMuzykow
--
+tytul: String
+kompozytor: String
+redaktor: String
+instrument: String
+iloscStron: int
+cena: double
+formatWysokosc: int
+formatSzerokosc: int
--
+NutyDlaMuzykow()
+NutyDlaMuzykow(tytul: String, kompozytor: String, 
    redaktor: String, instrument: String, iloscStron: int,
    cena: double, formatWysokosc: int, formatSzerokosc: int
+wyswietlInfo():void
+vat(double wielkosc):double
+cenaVat():void
 */

import java.util.Scanner;

class NutyDlaMuzykow
{
	String tytul;
	String kompozytor; 
	String redaktor;
	String instrument;
	int iloscStron;
	double cena;
	int formatWysokosc;
	int formatSzerokosc;
	NutyDlaMuzykow()
	{
		System.out.println("Wpisane dane dla wydawnictwa muzycznego");
		Scanner dane = new Scanner(System.in);
		System.out.print("Tytul: ");
		tytul = dane.nextLine();
		System.out.print("Kompozytor: ");
		kompozytor = dane.nextLine();
		System.out.print("Redaktor: ");
		redaktor = dane.nextLine();
		System.out.print("Instrument: ");
		instrument = dane.nextLine();
		System.out.print("Ilosc stron: ");
		iloscStron = dane.nextInt();
		System.out.print("Cena: ");
		cena = dane.nextDouble();
		System.out.print("Wysokosc: ");
		formatWysokosc = dane.nextInt();
		System.out.print("Szerokosc: ");
		formatSzerokosc = dane.nextInt();
	}
	NutyDlaMuzykow(String tytul, String kompozytor, String redaktor, String instrument, int iloscStron, double cena, int formatWysokosc, int formatSzerokosc)
	{
		this.tytul = tytul;
		this.kompozytor = kompozytor;
		this.redaktor = redaktor;
		this.instrument = instrument;
		this.iloscStron = iloscStron;
		this.cena = cena;
		this.formatWysokosc = formatWysokosc;
		this.formatSzerokosc = formatSzerokosc;
	}
	
	void wyswietlInfo()
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("Tytul: "+ tytul);
		System.out.println("Kompozytor: "+kompozytor);
		System.out.println("Redaktor: "+redaktor);
		System.out.println("Instrument: "+instrument);
		System.out.println("Ilosc stron: "+ iloscStron);
		System.out.printf("Cena: %3.2f zl %n",cena);
		System.out.println("Wymiary "+formatWysokosc+"x"+formatSzerokosc+" cm");
		System.out.println("---------------------------------------------------------");
	}
	double vat(double wielkosc)
	{
		return wielkosc*cena;
	}
	
	void cenaVat()
	{
		/* cena bez vatu
		 *  vat
		 *  cena z vatem - przechowywana jest w zmiennej skladowej
		 */
		System.out.println("---------------------------------------------------------");
		System.out.printf("Cena bez VATu: %3.2f zl %n", cena-vat(0.07));
		System.out.printf("VAT: 7 %% %3.2f zl %n", vat(0.07));
		System.out.printf("Cena z VATem: %3.2f zl %n",cena);
		System.out.println("---------------------------------------------------------");
		
	}
}

public class Nuty {

	public static void main(String[] args) {
		NutyDlaMuzykow gamycz1 = new NutyDlaMuzykow();
		gamycz1.wyswietlInfo();
		gamycz1.cenaVat();
		System.out.printf("VAT %3.2f %n",gamycz1.vat(0.07));
		NutyDlaMuzykow stareUtwory = new NutyDlaMuzykow("Z dawnych wiekow", "Wielu kompozytorow", "Zbigniew Sliwinski", "fortepian", 34, 29.99, 15 ,22);
		stareUtwory.wyswietlInfo();
		stareUtwory.cenaVat();
		System.out.printf("VAT %3.2f %n",stareUtwory.vat(0.07));
		
		
	}

}
