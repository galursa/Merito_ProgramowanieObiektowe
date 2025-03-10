/*
 * 1.deklarujemy tablice dwuwymiarowa
 * 2.Kazdy wiersz bedzie roznej wielkosci zaczynamy od wiekszego wymiaru
 * i bedziemy schodzic o jedna wielkosc w dol np. zaczynamy od 10, potem jest 9, 8, 7,...,1
 * 3.Losujemy elementy tablicy.
 * 4.Pobierzemy wartosc od uzytkownika
 * 5.Odejmiemy od wszystkich elementow tablicy.
 */

import java.util.Random;
import java.util.Scanner;

public class Tablica2dZmiennaWielkoscWierszy {

	public static void main(String[] args) {
		int rozmiar = 10;
		int tabTrojkat[][] = new int [rozmiar][];
		Random los = new Random();
		for(int i=0; i<tabTrojkat.length; i++ )
		{
			tabTrojkat[i] = new int[rozmiar];
			rozmiar--;
			for(int j=0; j<tabTrojkat[i].length; j++)
			{
				tabTrojkat[i][j] = los.nextInt(50);
				System.out.format("%4d",tabTrojkat[i][j]);
			}		
			System.out.println();
		}
		Scanner dane = new Scanner(System.in);
		System.out.println();
		System.out.println("Podaj liczbe");
		int liczba = dane.nextInt();
		for(int i=0; i<tabTrojkat.length; i++ )
		{
			for(int j=0; j<tabTrojkat[i].length; j++)
			{
				tabTrojkat[i][j]=tabTrojkat[i][j]-liczba;
				System.out.format("%4d",tabTrojkat[i][j]);
			}
			System.out.println();
		}
	}

}
