import java.util.Arrays;
import java.util.Scanner;

class CiagArytmetyczny {
	int r;
	int a1;
	int n;
	int[] elementy; 
	void wyswietA1iR()
	{
		System.out.println("Ci¹g arytmetyczny i jego dane:");
		System.out.println("a1 = "+a1+", r = "+r+". ");
	}
	int entyWyraz(int n)
	{
		return a1+(n-1)*r;
	}
	void wyswietlElementy()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.print(entyWyraz(i)+" ");
		}
	}
	void wyswietlElementy(int n)
	{
		for(int i=1; i<=n; i++)
		{
			System.out.print(entyWyraz(i)+" ");
		}
	}
	boolean porownaj(CiagArytmetyczny c)
	{
		if((c.r == r)&&(c.a1 == a1))
			return true;
		else 
			return false;
	}
	CiagArytmetyczny nowyCiag(int czynnik)
	{
		CiagArytmetyczny ciag = new CiagArytmetyczny();
		ciag.a1 = a1;
		ciag.r = r+czynnik;
		return ciag;
	}
	int[] zapiszDoTablicy(int rozmiar)
	{
		int[] tablica = new int[rozmiar];
		tablica[0]=a1;
		for(int i=1; i<rozmiar; i++)
		{
			tablica[i]=tablica[i-1]+r;
		}
		return tablica;
	}
	void policzElementy()
	{
		elementy = new int[n];
		elementy[0]=a1;
		for(int i=1; i<n; i++)
		{
			elementy[i]=elementy[i-1]+r;
		}
	}
}

public class ciagi {
	public static void main(String[] args) {
		CiagArytmetyczny ciag1 = new CiagArytmetyczny();
		Scanner dane = new Scanner(System.in);
		System.out.println("Pobieram dane do obliczeñ na ci¹gu arytmetycznym.");
		System.out.print("Podaj a1:");
		ciag1.a1 = dane.nextInt();
		System.out.print("Podaj r:");
		ciag1.r = dane.nextInt();
		ciag1.wyswietA1iR();
		System.out.print("Który wyraz ci¹gu chcesz policzyæ. Podaj n:");
		int en;
		en = dane.nextInt();
		System.out.println(en+"-ty wyraz ci¹gu wynosi: "+ciag1.entyWyraz(en));
		System.out.println("Wyœwietlam 5 elementów ci¹gu:");
		ciag1.wyswietlElementy();
		System.out.println();
		System.out.println("Wyœwietlam "+en+" element/-y/-ów ci¹gu:");
		ciag1.wyswietlElementy(en);
		CiagArytmetyczny ciag2 = new CiagArytmetyczny();
		ciag2.a1=1;
		ciag2.r=3;
		System.out.println();
		System.out.println("Czy ci¹gi s¹ równe? " + ciag1.porownaj(ciag2));
		CiagArytmetyczny ciag3;
		ciag3 = ciag1.nowyCiag(2);
		ciag3.wyswietA1iR();
		dane.close();
		int[] ciag4 = new int[en];
		ciag4 = ciag1.zapiszDoTablicy(en);
		System.out.println(Arrays.toString(ciag4));
		ciag1.n = en;
		ciag1.policzElementy();
		System.out.println(Arrays.toString(ciag1.elementy));
	}
}
