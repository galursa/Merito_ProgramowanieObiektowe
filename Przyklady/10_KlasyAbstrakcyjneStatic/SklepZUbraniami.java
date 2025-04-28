/*
 * 
 * /Ubrania/
--
#kolor: String
#cena: float
#material: String
#poraRoku: String
#damskieMeskieUnisex: String
#zapiecie: String
--
/+wyswietlInfo():void/
/+wyswietlRozmiar():void/
+wyswietlCeneZVatem():void
 * 
 * 
 * 
 */

abstract class Ubrania
{
	protected String kolor;
	protected float cena;
	protected String material;
	protected String poraRoku;
	protected String damskieMeskieUnisex;
	protected String zapiecie;
	abstract void wyswietlInfo();
	abstract void wyswietlRozmiar();
	public void wyswietlCeneZVatem()
	{
		System.out.println("Cena: "+cena+" zl");
		System.out.printf("W tym vat %2.2f zl",(cena*0.23));
	}
}
/*
 * Bluzki
--
#rozmiar: int
#rekawy: String
--
+wyswietlInfo():void
+wyswietlRozmiar():void
 */

class Bluzki extends Ubrania
{
	protected int rozmiar;
	protected String rekawy;
	Bluzki(String kolor,float cena,String material,String poraRoku,String damskieMeskieUnisex,String zapiecie,int rozmiar,String rekawy)
	{
		this.kolor = kolor;
		this.cena = cena;
		this.material = material;
		this.poraRoku = poraRoku;
		this.damskieMeskieUnisex =damskieMeskieUnisex;
		this.zapiecie = zapiecie;
		this.rozmiar = rozmiar;
		this.rekawy = rekawy;
	}
	public void wyswietlInfo()
	{
		System.out.println("Bluzka");
		System.out.println("Kolor: "+kolor);
		System.out.println("Material: "+material);
		System.out.println("Pora roku:"+poraRoku);
		System.out.println("Przeznaczenie: "+damskieMeskieUnisex);
		System.out.println("Zapiecie: "+zapiecie);
		System.out.println("Rekawy: "+rekawy);
		wyswietlRozmiar();
		wyswietlCeneZVatem();
	}
	public void wyswietlRozmiar()
	{
		System.out.println("Rozmiar: "+rozmiar);
	}
}

/*
 * Spodnie
--
#height: int
#waist: int
#wykonczenieNogawek: String
--
+wyswietlInfo():void
+wyswietlRozmiar():void
 */

class Spodnie extends Ubrania
{
	protected int height;
	protected int waist;
	protected String wykonczenieNogawek;
	Spodnie(String kolor,float cena,String material,String poraRoku,String damskieMeskieUnisex,int height,int waist,String wykonczenieNogawek)
	{
		this.kolor = kolor;
		this.cena = cena;
		this.material = material;
		this.poraRoku = poraRoku;
		this.damskieMeskieUnisex =damskieMeskieUnisex;
		this.zapiecie = zapiecie;
		this.height = height;
		this.waist = waist;
		this.wykonczenieNogawek = wykonczenieNogawek;
	}
	public void wyswietlInfo()
	{
		System.out.println("Spodnie");
		System.out.println("Kolor: "+kolor);
		System.out.println("Material: "+material);
		System.out.println("Wykonczenie nogawe: "+wykonczenieNogawek);
		System.out.println("Pora roku:"+poraRoku);
		System.out.println("Przeznaczenie: "+damskieMeskieUnisex);
		wyswietlRozmiar();
		wyswietlCeneZVatem();
	}
	public void wyswietlRozmiar()
	{
		System.out.println("H: "+height);
		System.out.println("W: "+waist);
	}
	
}

public class SklepZUbraniami {
//int height,int waist,String wykonczenieNogawek)
	public static void main(String[] args) {
		Bluzki owocowySorbet = new Bluzki("Zolta w czerwone owoce", 49.99f, "bawelna", "lato", "unisex", "brak", 44, "krótkie");
		owocowySorbet.wyswietlInfo();
		Spodnie joggery = new Spodnie("Indygo",74.99f,"bawelna","caloroczne","meskie",23,24,"gumka");
		joggery.wyswietlInfo();
	}

}
