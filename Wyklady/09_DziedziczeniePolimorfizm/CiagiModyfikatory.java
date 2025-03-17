import java.util.Scanner;

class CiagArytmetyczny {
    private int r;
    private int a1;
    private int n;
	CiagArytmetyczny()
	{
		System.out.println("Ci¹g arytmetyczny pobieram dane.");
		System.out.println("Podaj a1");
		Scanner dane = new Scanner(System.in);
		a1 = dane.nextInt();
		System.out.println("Podaj r");
		r = dane.nextInt();
		System.out.println("Podaj liczbê elementów");
		setN(dane.nextInt());
		dane.close();
	}
	CiagArytmetyczny(int a1, int r, int n)
	{
		this.a1 = a1;
		this.r = r;
		this.setN(n);
	}
	public void wyswietA1iR()
	{
		System.out.println("Ci¹g arytmetyczny i jego dane:");
		System.out.println("a1 = "+a1+", r = "+r+". ");
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
public class CiagiModyfikatory {
	public static void main(String[] args) {
		CiagArytmetyczny ciag1 = new CiagArytmetyczny(1,1,5);
		ciag1.wyswietA1iR();
	}
}
