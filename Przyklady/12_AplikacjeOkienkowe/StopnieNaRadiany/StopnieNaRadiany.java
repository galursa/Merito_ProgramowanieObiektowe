import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class StopnieNaRadiany extends JFrame implements ActionListener {
	JLabel podpis;
	JLabel wynik;
	JButton btn = new JButton("Zamien");
	JTextField stopnie;
	StopnieNaRadiany()
	{
		super("Zamieñ stopnie na radiany");
		setSize(600,300);
		setLocation(300,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		podpis = new JLabel("Wartoœæ w stopniach:");
		add(podpis);
		stopnie = new JTextField(10);
		add(stopnie);
		add(btn);
		wynik = new JLabel(" ");
		add(wynik);
		btn.addActionListener((ActionListener) this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
    {
		if (e.getSource() == btn)
		{
			/* 1 pobieramy wartoœæ z pola tekstowego
			 * 2 zamieniamy na liczbe
			 * 3 liczymy wartosc
			 * 4 wartosc zamieniamy na stringa
			 * 5 wrzucamy do etykiety za przyciskiem.
			 */
			String liczbaText = stopnie.getText();
			double liczba  = Double.parseDouble(liczbaText);
			double radiany = liczba*2*Math.PI/360;
			String wynikRadiany = String.valueOf(radiany);
			wynik.setText(wynikRadiany);
		}
    }
	
}
