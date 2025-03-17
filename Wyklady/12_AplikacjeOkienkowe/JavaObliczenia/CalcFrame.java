import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalcFrame extends JFrame implements ActionListener{
	JTextField wpiszTekst;
	JButton btn = new JButton("Oblicz"); 
	JComboBox cb;
	JLabel wynik;
	public CalcFrame() {
		super("Mno¿enie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
 		setLocation(300,300);	
 		setLayout(new FlowLayout());
 		wpiszTekst = new JTextField(15);
 		add(wpiszTekst);
 		add(new JLabel("*"));
 		String liczby[] = {"1","2","3","4","5"};
 		cb =new JComboBox(liczby);    
 	    cb.setBounds(50,50,90,20);    
 	    add(cb);      
 	    add(new JLabel("="));
 	    wynik =new JLabel("   ");
 	    add(wynik);
 		add(btn);
        btn.addActionListener((ActionListener) this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btn) {
            String liczba = wpiszTekst.getText(); 
            String mnoznik = cb.getSelectedItem().toString();
            int l = Integer.parseInt(liczba);
            int m = Integer.parseInt(mnoznik);
            m*=l;
            String w = String.valueOf(m); 
            wynik.setText(w);
        }
    }

}