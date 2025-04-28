import java.util.Random;

public class InsertionSort {
	static void sotowaniePrzezWstawianie(int [] tablica)
	{
		int rozmiar = tablica.length;
		int element;
		for(int i =1 ;i<rozmiar; i++)
		{
			element = tablica[i];
			int j;
			j=i-1;
			while((j>=0)&&(tablica[j]>element))
			{
				tablica[j+1]=tablica[j];
				j--;			
			}
			tablica[j+1]=element;
		}
	}
	static void wyswietlTablice(int [] tablica)
	{
		int rozmiar = tablica.length;
		for(int i=0; i<rozmiar; i++)
		{
			System.out.print(tablica[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int rozmiar = 10;
		int []tablica = new int[rozmiar];
		Random los = new Random();
		for(int i=0;i<rozmiar;i++)
		{
			tablica[i] = los.nextInt(20);
		}
		wyswietlTablice(tablica);
		sotowaniePrzezWstawianie(tablica);
		wyswietlTablice(tablica);
	}

}
