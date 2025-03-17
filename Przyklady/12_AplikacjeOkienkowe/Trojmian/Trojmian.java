import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Trojmian extends JFrame implements ActionListener{
	JTextField aText;
	JTextField bText;
	JTextField cText;
	JButton przycisk = new JButton("Oblicz");
	JLabel wynik;
	Trojmian()
	{
		super("Pierwiastki trójmianu kwadratowego");
		setSize(600,300);
		setLocation(300,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new JLabel("ax^2+bx+c=0: "));
		aText = new JTextField(4);
		add(aText);
		add(new JLabel("x^2+"));		
		bText = new JTextField(4);
		add(bText);
		add(new JLabel("x+"));
		cText = new JTextField(4);
		add(cText);
		add(new JLabel("=0"));
		add(przycisk);
		wynik = new JLabel("Wynik ");
		add(wynik);
		przycisk.addActionListener((ActionListener) this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
    {
		if (e.getSource() == przycisk)
		{
			/* 1 - musimy odczytaæ wszystkie wartoœci z pól tekstowych i zamieniæ je na liczby
			 * 2 - liczymy delte
			 * 3 - w zale¿noœci od delty liczymy lub nie liczymy pierwiastki
			 * 4 - tworzymy komunikat
			 * 5 - dodajemy komunikat do etykiety
			 */
			double a = Double.parseDouble(aText.getText());
			double b = Double.parseDouble(bText.getText());
			double c = Double.parseDouble(cText.getText());
			double delta = b*b-4*a*c;
			//wynik.setText("delta");
			String komunikat;
			if (delta<0)
			{
				komunikat="Delta < 0 zatem brak pierwiastków.";
			}else if (delta==0)
			{
				double x0 = -b/(2*a);
				komunikat="Delta = 0 zatem jest jeden pierwiastek x0 = "+String.valueOf(x0)+".";
			}else
			{
				double x1= (-b-Math.sqrt(delta))/(2*a);
				double x2= (-b+Math.sqrt(delta))/(2*a);
				komunikat = "Delta > 0 zatem s¹ dwa pierwiastki: x1 = "+String.valueOf(x1)+", x2 = "+String.valueOf(x2)+".";
			}
			wynik.setText(komunikat);
			
		}
    }
}
