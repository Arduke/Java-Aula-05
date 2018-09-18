package TextPass;
import java.awt.*;
import javax.swing.*;

class Compo06 extends Frame { 
	private ImageIcon i = new ImageIcon("C:\\Users\\aluno\\eclipse-workspace\\Aula-05\\src\\TextPass"); 
	private JScrollPane j = new JScrollPane (new JLabel (i));
	
	Compo06(String tit, int lar, int alt, int col, int lin) { 
		super(tit); 
		setSize(lar,alt); 
		setLocation(col,lin); 
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(j);
}
}
