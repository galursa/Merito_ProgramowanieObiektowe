abstract class Przepisy{
	public String Kategoria;
	abstract void przeliczSkladniki(int liczbaOsob);
}

//Bierzemy klasê konkretnego przpisu i tam definiujemy przeliczSkladniki
//co ma polegaæ na zwiêkszeniu b¹dz zmniejszaniu ilosci skladnikow w zaleznosci od osoby

class Jajecznica extends Przepisy
{
	public int ilosc;
	public String nazwa;
	void przeliczSkladniki(int liczbaOsob)
	{
		ilosc = ilosc*liczbaOsob;
	}
}

class Kanapka extends Przepisy
{
	public int[] ilosc = new int[3];
	public String[] skladniki = new String[3];
	Kanapka(String chleb, String smarowidlo, String wedlina, int ileKromek, int ileLyzeczek, int ilePlasterkow)
	{
		skladniki[0] = chleb;
		ilosc[0] = ileKromek;
		skladniki[1] = smarowidlo;
		ilosc[1] = ileLyzeczek;
		skladniki[2] = wedlina;
		ilosc[2] = ilePlasterkow;
		Kategoria = "Kanapki";
	}
	void przeliczSkladniki(int liczbaOsob)
	{
		for(int i=0; i<3; i++)
		{
			ilosc[i]*=liczbaOsob;
		}
	}
	void wyswietlDane()
	{
		System.out.println(Kategoria);
		for(int i=0; i<3; i++)
		{
			System.out.println(skladniki[i]+" sztuk: "+ilosc[i]);	
		}
	}
}


public class PrzepisyRozne {
	public static void main(String[] args) {
		Jajecznica mala = new Jajecznica();
		mala.ilosc = 2;
		mala.nazwa = "Jajka kurze";
		System.out.println("Jajecznica dla jednej osoby");
		System.out.println(mala.nazwa+" sztuk: "+mala.ilosc);
		mala.przeliczSkladniki(3);
		System.out.println("Jajecznica dla trzech osób");
		System.out.println(mala.nazwa+" sztuk: "+mala.ilosc);
		Kanapka zSerem = new Kanapka("Razowy", "Mas³o", "Ser ¿ó³ty", 2, 1, 3);
		zSerem.wyswietlDane();
		zSerem.przeliczSkladniki(2);
		zSerem.wyswietlDane();
	}
}
