package TextPass;
import java.awt.*;
class Compo05 extends Frame
{
	private Label l1 = new Label("Op��es:");
	private CheckboxGroup cbg = new CheckboxGroup();
	private Checkbox ck1 = new Checkbox ("Op��o 1", cbg, false);
	private Checkbox ck2= new Checkbox("Op��o 2",cbg,false); 
	private Checkbox ck3= new Checkbox("Op��o 3",cbg,false);
	Compo05(String tit, int lar, int alt, int col, int lin) { 
		super(tit); 
		setSize(lar,alt); 
		setLocation(col,lin); 
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(l1);    
		add(ck1);    
		add(ck2);   
		add(ck3);
	}
	}
