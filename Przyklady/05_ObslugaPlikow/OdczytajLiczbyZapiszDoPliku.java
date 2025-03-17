/*
 * 1. Odczytaj liczby od uzytkownika 
 * 2. zapisz je do pliku w formie tablicowej.
 * 3. Odczytaj tablice z pliku i wyswietl
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OdczytajLiczbyZapiszDoPliku {
	public static void main(String[] args) throws FileNotFoundException {
		int lWierszy;
		int lKolumn;
		Scanner daneLiczby = new Scanner(System.in);
		System.out.println("Podaj liczbe wierszy: ");
		lWierszy = daneLiczby.nextInt();
		System.out.println("Podaj liczbe kolumn: ");
		lKolumn = daneLiczby.nextInt();
		try {
			FileWriter plik = new FileWriter("tablicaLiczb.txt");
			plik.write(String.valueOf(lWierszy));
			plik.write("\n");
			plik.write(String.valueOf(lKolumn));
			plik.write("\n");
			int liczba;
			for(int i=0; i<lWierszy; i++)
			{
				for(int j=0; j<lKolumn; j++)
				{
					System.out.println("Pozycja: "+i+" "+j+" :");
					liczba = daneLiczby.nextInt();
					plik.write(String.valueOf(liczba));
					plik.write(" ");
				}
				plik.write("\n");
			}
			System.out.println("Plik zapisano pomyslnie");
			plik.close();
			daneLiczby.close();
		}catch (IOException ex)
		{
			System.out.println("Nie mozna zapisac danych do pliku");
			ex.getMessage();
		}
		File odczytajPlik = new File("tablicaLiczb.txt");
		Scanner daneZPliku = new Scanner(odczytajPlik);
		lWierszy = daneZPliku.nextInt();
		lKolumn = daneZPliku.nextInt();
		int tablicaLiczb[][] = new int[lWierszy][lKolumn];
		int i=0;
		while(daneZPliku.hasNextLine()&&(i<lWierszy))
		{
			for(int j=0;j<lKolumn;j++)
			{
				tablicaLiczb[i][j] = daneZPliku.nextInt();
			}
			i++;
		}
		System.out.println("Tablica odczytana z pliku:");
		for(i=0; i<lWierszy; i++)
		{
			for(int j=0; j<lKolumn; j++)
			{
				System.out.format("%4d", tablicaLiczb[i][j]);
			}
			System.out.println();
		}
	}
}
