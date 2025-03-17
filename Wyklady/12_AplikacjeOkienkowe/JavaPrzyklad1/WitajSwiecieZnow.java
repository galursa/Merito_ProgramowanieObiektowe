import java.awt.EventQueue;
 
public class WitajSwiecieZnow {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MojaRamka();
 			}
 		});
 	}
}