/*
 * Lamiglowki
--
#wydawnictwo: String
#cena: double
#iloscStron:int
#autor: String
#rozwiazaniaSaZNumeru: String
--
+wyswietlInfo():void
+obliczVat():double
 */

class Lamiglowki
{
	protected String wydawnictwo;
	protected double cena;
	protected int iloscStron;
	protected String autor;
	protected String rozwiazaniaSaZNumeru;
	Lamiglowki(String wydawnictwo, double cena,int iloscStron,String autor, String rozwiazaniaSaZNumeru)
	{
		this.wydawnictwo = wydawnictwo;
		this.cena = cena;
		this.iloscStron = iloscStron;
		this.autor = autor;
		this.rozwiazaniaSaZNumeru = rozwiazaniaSaZNumeru;
	}
	public String getWydawnictwo() {
		return wydawnictwo;
	}
	public void setWydawnictwo(String wydawnictwo) {
		this.wydawnictwo = wydawnictwo;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public int getIloscStron() {
		return iloscStron;
	}
	public void setIloscStron(int iloscStron) {
		this.iloscStron = iloscStron;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getRozwiazaniaSaZNumeru() {
		return rozwiazaniaSaZNumeru;
	}
	public void setRozwiazaniaSaZNumeru(String rozwiazaniaSaZNumeru) {
		this.rozwiazaniaSaZNumeru = rozwiazaniaSaZNumeru;
	}
	public void wyswietlInfo()
	{
		System.out.println("Wydawnictwo: "+wydawnictwo);
		System.out.println("Autor: "+ autor);
		System.out.println("Cena: "+cena+" zl");
		System.out.println("Ilosc stron: "+iloscStron);
		System.out.println("Czy sa rozwiazania: "+rozwiazaniaSaZNumeru);
	}
	public double obliczVat()
	{
		return 0.08*cena;
	}
}

/*
 * Szyfrokrzyzowki
--
#jezyk: String
#czySaIlustracje: boolean
#rodzajSzyfrokrzyzowki: String
--
+wyswietlAlfabet():void
+wyswietlInfoSzyfrokrzyzowki():void
 */

class Szyfrokrzyzowki extends Lamiglowki
{
	protected String jezyk;
	protected boolean czySaIlustracje;
	protected String rodzajSzyfrokrzyzowki;
	Szyfrokrzyzowki(String jezyk, boolean czySaIlustracje, String rodzajSzyfrokrzyzowki, String wydawnictwo, double cena,int iloscStron,String autor, String rozwiazaniaSaZNumeru)
	{
		super(wydawnictwo, cena,iloscStron,autor, rozwiazaniaSaZNumeru);
		this.jezyk = jezyk;
		this.czySaIlustracje = czySaIlustracje;
		this.rodzajSzyfrokrzyzowki = rodzajSzyfrokrzyzowki;
	}
	public void wyswietlAlfabet()
	{
		for(int i=65; i<=90; i++)
		{
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
	public void wyswietlInfoSzyfrokrzyzowki()
	{
		this.wyswietlInfo();
		System.out.println("Jezyk: "+jezyk);
		System.out.print("Czy sa ilustracje: ");
		if(czySaIlustracje)
			System.out.print("tak");
		else
			System.out.print("nie");
		System.out.println();
		System.out.println("Rodzaj szyfrokrzyzowki: "+rodzajSzyfrokrzyzowki);
	}
}
/*
 * Sudoku
--
#dlaDoroslychCzyDzieci: String
#rodzajSudoku: String
#poziomTrudnosci: String
#cyfryObrazkiLubInneZnaki: String
--
+wyswietlInfoSudoku():void
 */
class Sudoku extends Lamiglowki
{
	protected String dlaDoroslychCzyDzieci;
	protected String rodzajSudoku;
	protected String poziomTrudnosci;
	protected String cyfryObrazkiLubInneZnaki;
	Sudoku(String dlaDoroslychCzyDzieci, String rodzajSudoku, String poziomTrudnosci,String cyfryObrazkiLubInneZnaki, String wydawnictwo, double cena,int iloscStron,String autor, String rozwiazaniaSaZNumeru)
	{
		super(wydawnictwo, cena,iloscStron,autor, rozwiazaniaSaZNumeru);
		this.dlaDoroslychCzyDzieci =dlaDoroslychCzyDzieci;
		this.rodzajSudoku =rodzajSudoku;
		this.poziomTrudnosci =poziomTrudnosci;
		this.cyfryObrazkiLubInneZnaki = cyfryObrazkiLubInneZnaki;  
	}
	public void wyswietlInfoSudoku()
	{
		this.wyswietlInfo();
		System.out.println(dlaDoroslychCzyDzieci);
		System.out.println("Rodzaj: "+rodzajSudoku);
		System.out.println("Poziom trudnosci: "+poziomTrudnosci);
		System.out.println("W sudoku uzyto symbole: "+cyfryObrazkiLubInneZnaki);
	}
}

public class LamiglowkiZeszytowe {
	public static void main(String[]args) {
		//wydawnictwo, cena,iloscStron,autor, rozwiazaniaSaZNumeru
		Lamiglowki rozne = new Lamiglowki("Rozrywka", 9.99, 96, "ConceptisPuzzle", "z numeru biezacego");
		rozne.wyswietlInfo();
		Szyfrokrzyzowki poAngielsku = new Szyfrokrzyzowki("angielski", true, "klasyczne", "PuzzleABC", 23.99, 200, "Adam Smith", "z numeru poprzedniego" );
		poAngielsku.wyswietlInfoSzyfrokrzyzowki();
		poAngielsku.wyswietlAlfabet();
		Sudoku mega = new Sudoku("Dla dzieci", "6x6 kratek", "latwe", "obrazki", "Dzieciece marzenia", 6.99, 20, "Anna Kowalska", "z biezacego numeru");
		mega.wyswietlInfoSudoku();
	}
}
