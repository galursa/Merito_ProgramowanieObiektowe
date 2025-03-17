import java.util.Random;

class Pudelko
{
	int iloscKredek;
	void wyprodukujKredki()
	{
		Random los = new Random();
		iloscKredek = los.nextInt(100);
	}
	boolean czyZmieszczaSieWPudelkach()
	{
		System.out.println("Wyprodukowano : "+iloscKredek+" kredek/kredki");
		if((iloscKredek%5)==0)
		{
			System.out.println("Kredki da sie zapakowac do pudelek");
			return true;
		}
		else
		{
			throw new ArithmeticException("Kredek nie da sie zapakowac do pudelek");
		}
	}
}

public class WyjatekWyrzuc {
	public static void main(String[] args) {
		Pudelko swiecowe = new Pudelko();
		swiecowe.wyprodukujKredki();
		swiecowe.czyZmieszczaSieWPudelkach();
		
	}
}
