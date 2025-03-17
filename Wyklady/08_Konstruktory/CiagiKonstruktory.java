import java.util.Scanner;

class CiagArytmetyczny {
	int r;
	int a1;
	int n;
	int[] elementy; 
	CiagArytmetyczny()
	{
		System.out.println("Ci¹g arytmetyczny pobieram dane.");
		System.out.println("Podaj a1");
		Scanner dane = new Scanner(System.in);
		a1 = dane.nextInt();
		System.out.println("Podaj r");
		r = dane.nextInt();
		System.out.println("Podaj liczbê elementów");
		n = dane.nextInt();
		dane.close();
	}
	/*CiagArytmetyczny(int ajeden, int er, int en)
	{
		a1 = ajeden;
		r = er;
		n = en;
	}*/
	CiagArytmetyczny(int a1, int r, int n)
	{
		this.a1 = a1;
		this.r = r;
		this.n = n;
	}
	void wyswietA1iR()
	{
		System.out.println("Ci¹g arytmetyczny i jego dane:");
		System.out.println("a1 = "+a1+", r = "+r+". ");
	}
	int entyWyraz(int n)
	{
		return a1+(n-1)*r;
	}
	void wyswietlElementy()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.print(entyWyraz(i)+" ");
		}
	}
	void wyswietlElementy(int n)
	{
		for(int i=1; i<=n; i++)
		{
			System.out.print(entyWyraz(i)+" ");
		}
	}
	boolean porownaj(CiagArytmetyczny c)
	{
		if((c.r == r)&&(c.a1 == a1))
			return true;
		else 
			return false;
	}
	CiagArytmetyczny nowyCiag(int czynnik)
	{
		CiagArytmetyczny ciag = new CiagArytmetyczny();
		ciag.a1 = a1;
		ciag.r = r+czynnik;
		return ciag;
	}
	int[] zapiszDoTablicy(int rozmiar)
	{
		int[] tablica = new int[rozmiar];
		tablica[0]=a1;
		for(int i=1; i<rozmiar; i++)
		{
			tablica[i]=tablica[i-1]+r;
		}
		return tablica;
	}
	void policzElementy()
	{
		elementy = new int[n];
		elementy[0]=a1;
		for(int i=1; i<n; i++)
		{
			elementy[i]=elementy[i-1]+r;
		}
	}
	void czyArytmetyczny(int ... pewienCiag)
	{
		int elPoprzedni = 0;
		int i = 0;
		int staleR=0;
		boolean tak = true;
	    for(int el : pewienCiag)
	    {
	    	
	        System.out.print(el + " ");
	        if(i==1)
	        {
	        	staleR = el-elPoprzedni;
	        	tak = true;
	        } else if (i>1)
	        {
	        	int noweR = el-elPoprzedni;
	        	if(noweR==staleR)
	        	{
	        		tak = true;
	        	} else
	        	{
	        		tak = false;
	        	}
	        }
	        elPoprzedni = el; 
	        i++;
	        
	    }
	    if (tak)
	    	System.out.println("Podany ci¹g jest ci¹giem arytmetycznym.");
	    else
	    	System.out.println("Podany ci¹g NIE jest ci¹giem arytmetycznym");
	}
}


public class CiagiKonstruktory {
	public static void main(String[] args) {
		CiagArytmetyczny ciag = new CiagArytmetyczny();
		ciag.wyswietA1iR();
		CiagArytmetyczny ciag2 = new CiagArytmetyczny(2,2,6);
		ciag2.wyswietA1iR();
		CiagArytmetyczny ciag3 = new CiagArytmetyczny(1,2,3);
		ciag3.czyArytmetyczny(1,2,3,4);
		ciag3.czyArytmetyczny(2,4,6);
		ciag3.czyArytmetyczny(5,2,4,2,4);
	}
}
