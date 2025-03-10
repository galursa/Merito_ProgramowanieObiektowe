
/*
 * Utworzymy tablice jednowymiarowa
 * Wylosujemy do niej liczby
 * odczytamy od uzytkownika wartosc
 * Poszukamy wartosci w tej tablicy.
 */

import java.util.Random;
import java.util.Scanner;

public class WyszukajLiczbe {
	
	public static void main(String[] args) {
		int rozmiar = 20;
		int liczby[] = new int[rozmiar];
		Random los = new Random();
		for (int i=0; i<rozmiar; i++)
		{
			liczby[i] = los.nextInt(50);
			System.out.print(i+":"+liczby[i]+" ");
		}
		Scanner dane = new Scanner(System.in);
		System.out.println();
		System.out.println("Podaj wartosc do odszukania");
		int wartosc = dane.nextInt();
		Boolean znaleziono = false;
		for(int i=0; i<rozmiar; i++)
		{
			if(liczby[i]==wartosc)
			{
				znaleziono = true;
				System.out.println("Wartosc: "+wartosc+" znaleziono na pozycji: "+i+".");
				break;
			}
		}
		if (!znaleziono)
		{
			System.out.println("Wartosc: "+wartosc+" nie zostala znaleziona.");
		}
	}

}
