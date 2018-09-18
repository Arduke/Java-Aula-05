package TextPass;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Compo03b extends Frame  implements ActionListener, ItemListener { 
	private String S[] = {"maçã","banana","uva","pera", "mamão","melancia"}; 
	private Label l1   = new Label("Opções:"); 
	private List  lst1 = new List(5); 
	private Label l2   = new Label("fruta"); 
	private Label l3   = new Label("selecionada");
	Compo03b(String titulo, int largura, int altura, int colinic, int lininic) 
	{ 
		super(titulo); 
		setSize(largura,altura); 
		setLocation(colinic,lininic); 
		setLayout(new FlowLayout(FlowLayout.LEFT)); 
		add(l1); 
		add(lst1); 
		add(l2); 
		add(l3); 
		lst1.addActionListener(this); 
		lst1.addItemListener(this);
		
		for(int x=0;x<=5;x++) 
			lst1.add(S[x]);

	}
	
	
	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getSource() == lst1) 
			l2.setText(lst1.getSelectedItem()); 
	
	}
	public void itemStateChanged(ItemEvent e) 
	{ 
		if (e.getSource() == lst1) 
		{ 
			if (lst1.getSelectedIndex()>-1) 
			{
				l3.setText(lst1.getSelectedItem()); 
			}
		} 
	}
}

