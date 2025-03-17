class Ksiazka
{
	String tytul;
	String autor;
	String wydawnictwo;
	int rokWydania;
	int numerWydania;
	float cena;
	
	void wyswietl()
	{
		System.out.println("Tytu³: "+tytul);
		System.out.println("Autor: "+autor);
		System.out.println("Wydawnictwo: "+wydawnictwo);
		System.out.println("Rok wydania: "+rokWydania);
		System.out.println("Wydanie: "+numerWydania);
		System.out.println("Cena: "+cena);
	}
	
	float rabat()
	{
		return cena*0.1f;
	}
	
	float rabat(float procent)
	{
		return cena*procent;
	}
	
	boolean porownajZ(Ksiazka nowaKsiazka)
	{
		boolean toSamo = false;
		if(tytul == nowaKsiazka.tytul)
		{
			if(autor == nowaKsiazka.autor) {
				if(wydawnictwo == nowaKsiazka.wydawnictwo) {
					if (rokWydania == nowaKsiazka.rokWydania)
					{
						if(numerWydania == nowaKsiazka.numerWydania)
						{
							toSamo = true;
						}
					}
				}
			}
		}
		return toSamo;
	}
	
	float[] listaRabatow(int ile)
	{
		float[] rabaty = new float[ile];
		float rabatPoczatkowy = 0.1f;
		for(int i=0; i<ile; i++)
		{
			rabaty[i] = rabat(rabatPoczatkowy);
			rabatPoczatkowy+=0.1f;
		}
		return rabaty;
	}
}




public class ObslugaKsiegarni {
	public static void main(String[] args) {
		Ksiazka panTadeusz = new Ksiazka();
		panTadeusz.autor = "Adam Mickiewicz";
		panTadeusz.tytul = "Pan Tadeusz";
		panTadeusz.wydawnictwo = "WSiP";
		panTadeusz.rokWydania = 2021;
		panTadeusz.numerWydania = 10;
		panTadeusz.cena = 39.99f;
		panTadeusz.wyswietl();
		System.out.println("Rabat podstawowy: "+panTadeusz.rabat());
		System.out.println("Rabat z³oty: "+panTadeusz.rabat(0.2f));
		Ksiazka panTadeusz1 = new Ksiazka();
		panTadeusz1.autor = "Adam Mickiewicz";
		panTadeusz1.tytul = "Pan Tadeusz";
		panTadeusz1.wydawnictwo = "WSiP";
		panTadeusz1.rokWydania = 2021;
		panTadeusz1.numerWydania = 10;
		panTadeusz1.cena = 39.99f;
		System.out.println("Czy ksia¿ki s¹ takie same? - "+panTadeusz.porownajZ(panTadeusz1));
		int ile = 3;
		float[] rabaty = new float[ile];
		rabaty = panTadeusz.listaRabatow(ile);
		for(int i=0; i<ile; i++)
		{
			System.out.print(rabaty[i]+" ");
		}
		System.out.println();
	}
}
