/*
 * Generujemy macierz losowo
 * Wymiary niezależnie będą ustalane losowo od 3 - 10
 * Transponowanie macierzy
 */

import java.util.Random;

public class TransponowanieMacierzy {

	public static void main(String[] args) {
		Random los = new Random();
		int lWierszy = los.nextInt(8)+3;
		int lKolumn = los.nextInt(8)+3;
		int macierz [][] = new int[lWierszy][lKolumn];
		System.out.println("Macierz wyjsciowa");
		for(int i=0; i<lWierszy; i++)
		{
			for(int j=0; j<lKolumn; j++)
			{
				macierz[i][j] = los.nextInt(20);
				System.out.printf("%3d",macierz[i][j] );
			}
			System.out.println();
		}
		System.out.println();
		int macierzT [][] = new int[lKolumn][lWierszy];
		System.out.println("Macierz transponowana");
		for(int i=0; i<lKolumn; i++)
		{
			for(int j=0; j<lWierszy; j++)
			{
				macierzT[i][j] = macierz[j][i];
				System.out.printf("%3d", macierzT[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
