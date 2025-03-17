import java.util.Scanner;

/*
	 * Materialy Biurowe
		--
		nazwy : String[]
		ilosc : int[]
		--
		dodajElement(ile:Int):void
		wyswietl():void
	 */
class MaterialyBiurowe {
	String[] nazwy;
	int[] ilosc;
	void dodajElementy()
	{
		int ile;
		System.out.println("Ile chcesz podac elementow? ");
		Scanner dane = new Scanner(System.in);
		ile = dane.nextInt();
		nazwy = new String[ile];
		ilosc = new int[ile];
		for(int i=0; i<ile; i++)
		{
			System.out.println("Element nr: "+(i+1));
			System.out.println("Podaj nazwê: ");
			nazwy[i]=dane.next();
			System.out.println("Podaj ilosc: ");
			ilosc[i]=dane.nextInt();
		}		
	}
	void wyswietl()
	{
		for(String element : nazwy)
		{
			System.out.print(element+" | ");
		}
		System.out.println();
		for(int ileElementow : ilosc)
		{
			System.out.format("%5d | ", ileElementow);
		}
	}
}


public class Biuro {
	public static void main(String[] args) {
		MaterialyBiurowe biurko = new MaterialyBiurowe();
		biurko.dodajElementy();
		biurko.wyswietl();
	}
}
