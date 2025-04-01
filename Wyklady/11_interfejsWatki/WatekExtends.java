import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WatekExtends extends Thread {
	public void run() {
		System.out.println("Jestem w watku. Odliczam");
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"...");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e)
			{
				e.getMessage();
			}
		}
		System.out.println("Koniec dzialania w watku");
	}
	public static void main(String[] args) {
		WatekExtends thread = new WatekExtends();
	    thread.start();
	    System.out.println("Losuję 5 liczb. To sie wykonuje poza watkiem");
	    Random los = new Random();
	    for(int i=0; i<5; i++)
	    {
	    	System.out.println(los.nextInt(100));
	    }
	}
}
