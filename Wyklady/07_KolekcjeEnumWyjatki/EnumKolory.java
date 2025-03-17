enum WarmColours
{
	BROWN,
	ORANGE,
	YELLOW
}
public class EnumKolory {
	
	enum CoolColours
	{
		BLUE,
		GREEN,
		VIOLET
	}
	
	public static void main(String[] args) {
		WarmColours farba = WarmColours.BROWN;
		CoolColours farba2 = CoolColours.BLUE;
		System.out.println("Pierwsza farba ma kolor: "+farba);
		System.out.println("Druga farba ma kolor: "+farba2);
		System.out.print("Wybrano kolor:");
		switch(farba)
		{
			case BROWN:
				System.out.print("brazowy, szestnastkowo: #663300");
				break;
			case ORANGE:
				System.out.print("Kolor pomaranczowy, szestnaskowo: #ff6600");
				break;
			case YELLOW:
				System.out.print("Kolor zolty, szestnaskowo: #ffcc00");
				break;
			default:
				System.out.print("Nie wybrano zadnego koloru");
		}
		System.out.println();
		System.out.println("Ponizej sa wszystkie kolory ze zbioru chlodnych kolorow");
		for(CoolColours kolor : CoolColours.values())
		{
			System.out.println("Kolor: "+kolor);
		}	
	}
}
