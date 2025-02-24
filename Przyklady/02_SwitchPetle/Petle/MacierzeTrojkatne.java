import java.util.Random;

public class MacierzeTrojkatne {

	public static void main(String[] args) {
		Random los = new Random();
		int wielkosc = los.nextInt(10)+3;
		System.out.println("Macierz gornotrojkatna");
		for(int i=1; i<=wielkosc; i++)
		{
			for(int j=1; j<=wielkosc; j++)
			{
				if(j>=i)
				{
					System.out.print((los.nextInt(9)+1)+" ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Macierz dolnotrojkatna");
		for(int i=1; i<=wielkosc; i++)
		{
			for(int j=1; j<=wielkosc; j++)
			{
				if(j<=i)
				{
					System.out.print((los.nextInt(9)+1)+" ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
