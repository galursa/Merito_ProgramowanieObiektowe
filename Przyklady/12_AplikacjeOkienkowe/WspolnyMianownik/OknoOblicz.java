import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OknoOblicz extends JFrame implements ActionListener{
	JTextField aText;
	JTextField bText;
	JTextField cText;
	JTextField dText;
	JButton oblicz = new JButton("Oblicz");
	JLabel wynik = new JLabel("");
	JComboBox znak;
	public OknoOblicz(){
		super("Sprowadzanie u³amków do wspólnego mianownika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 150);
 		setLocation(300,300);	
 		setLayout(new FlowLayout());
 		aText = new JTextField(4);
 		add(aText);
 		add(new JLabel("/"));
 		bText = new JTextField(4);
 		add(bText);
 		String znaki[] = {"+","-"};
 		znak = new JComboBox(znaki);
 		add(znak);
 		//add(new JLabel("+"));
 		cText = new JTextField(4);
 		add(cText);
 		add(new JLabel("/"));
 		dText = new JTextField(4);
 		add(dText);
 		add(oblicz);
 		oblicz.addActionListener((ActionListener) this);
 		add(wynik);
 		setVisible(true);
	} 
	public void actionPerformed(ActionEvent e)
    {
		if (e.getSource() == oblicz) {
			//1.odczytac wartosci z pol tekstowych i znak z pola kombo
			int a = Integer.parseInt(aText.getText());
			int b = Integer.parseInt(bText.getText());
			int c = Integer.parseInt(cText.getText());
			int d = Integer.parseInt(dText.getText());
			String znakZCombo = znak.getSelectedItem().toString();
			//2. sprowadzic do wspolnego mianownika
			int licznik1 = a*d;
			int licznik2 = c*b;
			int mianownik1 = b*d;
			int mianownik2= b*d;
			//3. wykonac obliczenia
			int licznikWynik=0;
			int mianownikWynik;
			if (znakZCombo=="+")
			{
				licznikWynik=licznik1+licznik2;
			}else if(znakZCombo=="-")
			{
				licznikWynik=licznik1-licznik2;
			}
			//4. wrzucenie wyniku do etykiety wynik
			wynik.setText(String.valueOf(licznik1)+"/"+String.valueOf(mianownik1)+znakZCombo+String.valueOf(licznik2)+"/"+String.valueOf(mianownik2)+"="+String.valueOf(licznikWynik)+"/"+String.valueOf(mianownik1));
			
		}
    }
	
}
