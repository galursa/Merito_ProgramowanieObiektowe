
public class WyjatekWJavie {

	public static void main(String[] args) {
		String slowo = "komputer";
		try {
			System.out.println("Pierwsza litera: "+slowo.charAt(0));
			System.out.println("Druga litera: "+slowo.charAt(20));
		}catch(Exception e)
		{
			System.out.println("Wystapil blad: ");
			System.out.println(e.getMessage());
		}finally
		{
			System.out.println("Uruchom progarm ponownie lub skontaktuj sie z developerem");
		}
	}

}
