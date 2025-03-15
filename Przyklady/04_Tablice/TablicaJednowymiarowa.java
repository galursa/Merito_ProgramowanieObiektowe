
/*
 * Generujemy losowo tablicę o 100 liczbach
 * Elementy o indeksach parzystych pomnozymy przez -1
 * Elementy o indeksach nieparzystych podzielimy przez 17
 */

import java.util.Random;

public class TablicaJednowymiarowa {
	public static void main(String[] args) {
		int tablica[] = new int[100];
		Random los = new Random();
		for(int i=0; i<tablica.length; i++)
		{
			tablica[i] = los.nextInt(50);
			System.out.print(tablica[i]+" ");
		}
		double tabWynik[] = new double[100];
		System.out.println();
		for(int i=0; i<tablica.length; i++)
		{
			if((i%2)==0)
			{
				tabWynik[i] = tablica[i]*(-1);
			}else
			{
				tabWynik[i] = ((double)tablica[i])/17;
			}
			System.out.printf("%1.2f ",tabWynik[i]);
		}
		System.out.println();
	}
}
