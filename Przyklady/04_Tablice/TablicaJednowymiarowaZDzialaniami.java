/*
 * Generujemy tablice jednowymiarowa losowo
 * elementy z indeksem parzystym mnozymy przez 5
 * elementy z indeksem nieparzystym dzielimy przez 2
 */

import java.util.Random;

public class TablicaJednowymiarowaZDzialaniami {
	public static void main(String[] args) {
		double tablica[] = new double[50];
		Random los = new Random();
		for(int i=0; i<tablica.length; i++)
		{
			tablica[i] = los.nextDouble();
			System.out.printf("%1.3f ",tablica[i]);
		}
		System.out.println();
		for(int i=0; i<tablica.length; i++)
		{
			if((i%2)==0)
			{
				tablica[i]*=5;
			}else {
				tablica[i]/=2; 
			}
			System.out.printf("%1.3f ",tablica[i]);
		}
		System.out.println();
	}
}
