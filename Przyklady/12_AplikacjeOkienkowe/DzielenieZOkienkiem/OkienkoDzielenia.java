import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OkienkoDzielenia extends JFrame implements ActionListener{
	JTextField dzielna;
	JTextField dzielnik;
	JLabel wynik;
	JButton btnOblicz = new JButton("Oblicz");
	OkienkoDzielenia()
	{
		super("Dzielenie liczb");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,100);
		setLocation(500, 250);
		setLayout(new FlowLayout());
		dzielna = new JTextField(5);
		add(dzielna);
		add(new JLabel("/"));
		dzielnik = new JTextField(5);
		add(dzielnik);
		wynik = new JLabel("=...");
		add(wynik);
		add(btnOblicz);
		btnOblicz.addActionListener((ActionListener) this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnOblicz)
		{
			double dzielnaDb = Double.parseDouble(dzielna.getText());
			double dzielnikDb = Double.parseDouble(dzielnik.getText());
			double wynikDzielenia = dzielnaDb / dzielnikDb;		
			wynik.setText("="+String.valueOf(wynikDzielenia));
		}
	}
}
