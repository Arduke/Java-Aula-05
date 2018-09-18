package TextPass;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Compo01 extends Frame implements ActionListener{
	
	private JLabel l1 = new JLabel ("Digite seu nome:");
	private JTextField campo1 = new JTextField("", 20);
	private JLabel l2 = new JLabel ("Digite sua senha:");
	private JPasswordField campo2 = new JPasswordField(5);
	private JPanel p1 = new JPanel (new GridLayout(4,1));
	
	Compo01 (String tit, int larg, int alt, int col, int lin){
		super(tit);
		setSize(larg,alt);
		setLocation(col,lin);
		campo1.addActionListener(this);
		campo2.addActionListener(this);
		p1.add(l1);
		p1.add(campo1);
		p1.add(l2);
		p1.add(campo2);
		add(p1);;
	}
	
	public void actionPerformed(ActionEvent e)
	{
	if (e.getSource() == campo1)
	campo2.requestFocus();
	if (e.getSource() == campo2)
	System.exit(0);
	}


}
