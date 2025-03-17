import java.awt.EventQueue;
 
public class Calculate {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CalcFrame();
 			}
 		});
 	}
}