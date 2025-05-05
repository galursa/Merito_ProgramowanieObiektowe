/*
 * 1. Tworzymy interfejs
 * 2. Dodajemy do niego metody generujace rozne ciagi:
 * 	a) liczby parzyste
 *  b) liczby podzielne przez 3
 *  
 * 3. Tworzymy klase ciagArytmetyczny, ktora implementuje interfejs.
 * 4. Dodamy do niej metode z wątkiem, gdzie wywolamy jedna metode dla ciagu
 * 5. Druga metode wywolamy w mainie.
 */

import java.util.Scanner;

class CiagArytmetyczny extends Thread implements ICiagi
{
	protected int pierwszyWyraz;
	protected int roznica;
	CiagArytmetyczny(int pierwszyWyraz, int roznica)
	{
		this.pierwszyWyraz = pierwszyWyraz;
		this.roznica = roznica;
	}
	public void parzyste(int wielkosc)
	{
		for(int i=2; i<wielkosc; i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public void podzielnePrzez3(int wielkosc)
	{
		for(int i=1; i<wielkosc; i+=3)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public void run()
	{
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj gorna wartosc dla ciagu:");
		int gornaWartosc = dane.nextInt();
		parzyste(gornaWartosc);
		System.out.println("Koniec dzialania w watku");
		dane.close();
	}
}

public class CiagiZWatkami {

	public static void main(String[] args) {
		CiagArytmetyczny ciagi = new CiagArytmetyczny(1,2);
		ciagi.start();
		while(ciagi.isAlive())
		{			
		}		
		System.out.println("Wyswietlam ciag liczby podzielne przez 3");
		ciagi.podzielnePrzez3(30);
	}

}
