import java.util.Random;

public class WatekIsAlive extends Thread{
	public static int liczba = 0;
	public void run()
	{
		System.out.println("Jestem w watku. Sumuje wartosci od 1 do 9");
		for(int i=1; i<10; i++)
		{
			liczba+=i;
		}
		System.out.println("Skonczylem. Oto liczba: "+liczba);
		
	}
	public static void main(String[] args) {
		WatekIsAlive watek = new WatekIsAlive();
		watek.start();
		while(watek.isAlive()) 
		{
		      System.out.println(".");
		}
		System.out.println("A teraz dodaje tutaj 3 losowe liczby");
		Random rnd = new Random();
		int losowa;
		for (int i=1; i<4; i++)
		{
			losowa =rnd.nextInt(10);
			liczba+=losowa;
			System.out.print(losowa+" ");
		}
		System.out.println();
		System.out.println("A wynik jest tutaj. Liczba: "+liczba);
	}

}
