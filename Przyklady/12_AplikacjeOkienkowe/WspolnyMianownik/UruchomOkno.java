import java.awt.EventQueue;

public class UruchomOkno {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new OknoOblicz();
 			}
 		});
 	}
}
