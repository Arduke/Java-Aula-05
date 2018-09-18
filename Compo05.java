package TextPass;
import java.awt.*;
class Compo05 extends Frame
{
	private Label l1 = new Label("Opções:");
	private CheckboxGroup cbg = new CheckboxGroup();
	private Checkbox ck1 = new Checkbox ("Opção 1", cbg, false);
	private Checkbox ck2= new Checkbox("Opção 2",cbg,false); 
	private Checkbox ck3= new Checkbox("Opção 3",cbg,false);
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
