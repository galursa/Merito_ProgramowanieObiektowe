import java.awt.EventQueue;

public class Uruchom {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Trojmian();
			}
		});
	}

}
