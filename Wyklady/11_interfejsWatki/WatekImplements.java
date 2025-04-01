import java.util.concurrent.TimeUnit;

public class WatekImplements implements Runnable {
	public void run() {
		System.out.println("Jestem w watku. Odliczam wstecz");
		for(int i=10;i>=0;i--)
		{
			System.out.println(i+"...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e)
			{
				e.getMessage();
			}
		}
		System.out.println("Start!");
	}

	public static void main(String[] args) {
		WatekImplements odliczanie = new WatekImplements();
		Thread watek = new Thread(odliczanie);
		watek.start();
		System.out.println("A tu jestesmy poza watkiem. Wypisze ciag liczb parzystych");
		for(int i=2; i<16; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();

	}

}
