import java.util.Arrays;
import java.util.Scanner;

class Oceny{
	String przedmiot;
	float[] oceny;
	Oceny()
	{
		Scanner dane= new Scanner(System.in);
		System.out.println("Podaj nazwê przedmiotu");
		przedmiot = dane.next();
		System.out.println("Podaj iloœæ ocen");
		int ile;
		ile = dane.nextInt();
		oceny = new float[ile];
		for(int i=0; i<ile; i++)
		{
			System.out.println("Podaj ocenê nr: "+i);
			oceny[i] = dane.nextFloat();
		} 
		dane.close();
	}
	Oceny(String przedmiot, float ... ocena)
	{
		this.przedmiot = przedmiot;
		int ile = ocena.length;
		System.out.println(ile);
		oceny = new float[ile];
		int i=0;
		for(float element : ocena)
		{
			oceny[i] = element;
			i++;
		}
	}
	void wyswietl()
	{
		System.out.println("Przedmiot: "+przedmiot);
		System.out.println(Arrays.toString(oceny));
	}
}

public class Przedmioty {
	public static void main(String[] args) {
		Oceny po = new Oceny();
		po.wyswietl();
		Oceny jAngielski = new Oceny("Jêzyk angielski",3,4,5);
		jAngielski.wyswietl();
		Oceny pdstProg = new Oceny("Podstawy Programowania",3,4,5,3,4,5,5,4,5);
		pdstProg.wyswietl();
	}
}
