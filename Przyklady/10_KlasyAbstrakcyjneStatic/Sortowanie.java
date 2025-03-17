import java.util.Random;

public class Sortowanie {
	
	static void selectionSort(int[] liczby, int rozmiar)
	{
		for(int i=0; i<rozmiar-1; i++)
		{
			int min = i;
			for(int j=i+1;j<rozmiar ;j++)
			{
				if(liczby[j]<liczby[min])
					min=j;
			}
			int temp = liczby[min];
			liczby[min] = liczby[i];
			liczby[i] = temp;
		}
	}
	
	static void wypisz(int[] liczby, int rozmiar)
	{
		for(int i=0; i<rozmiar; i++)
		{
			System.out.format("%3d",liczby[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int rozmiar = 10;
		Random rand = new Random();
		int[] ciagLiczb = new int[rozmiar];
		for(int i=0; i<rozmiar; i++)
		{
			ciagLiczb[i] = rand.nextInt(20);
		}
		wypisz(ciagLiczb, rozmiar);
		selectionSort(ciagLiczb, rozmiar);
		wypisz(ciagLiczb, rozmiar);
	}
}
