/*
 *  Chcemy menu z wyborem losowym
 *  3 opcje:
 *  a) wyswietlimy macierz jednostkowa
 *  b) losujemy liczbe sprawdzamy jej podzielnosc 
 *     przez 2 i 5 jednoczesnie. - operator trojarg.
 *  c) suma ciągu arytmetycznego do losowego elementu
 *     1 2 3 4 
 */

import java.util.Random;

public class PetleWarunki {
	public static void main(String[] args) {
		Random los = new Random();
		int wybor = los.nextInt(3);
		switch(wybor)
		{
		case 0:
			int liczba = los.nextInt(100)+1;
			System.out.println("Czy liczba "+liczba+" jest podzielna przez 2 i 5 jednocześnie? ");
			System.out.println((((liczba%2==0)&&(liczba%5==0))?"Tak":"Nie"));
			break;
		case 1:
			int ostatniElement = los.nextInt(5)+5;
			int suma = 0;
			for(int i=1; i<=ostatniElement; i++ )
			{
				suma+=i; //rownowazne suma=suma+i
			}
			System.out.println("Suma ciagu 1, 2, 3, ..., "+ostatniElement);
			System.out.println("wynosi: "+suma);
			break;
		case 2:
			System.out.println("Macierz jednostkowa");
			int wielkoscMacierzy = los.nextInt(10)+3;
			for(int i=1; i<=wielkoscMacierzy; i++)
			{
				for(int j=1; j<=wielkoscMacierzy; j++)
				{
					if(i==j)
					{
						System.out.print("1 ");
					}else {
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("Nierozpoznany wybor");
			break;
			
		}		
	}
}
