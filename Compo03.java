package TextPass;
import java.awt.*;

class Compo03 extends Frame {
private Label l1=new Label("Op��es:");
private List lst1= new List(5);
Compo03(String titulo, int largura, int altura, int colinic, int lininic)
{
super(titulo);
setSize(largura,altura);
setLocation(colinic,lininic);
setLayout(new FlowLayout(FlowLayout.LEFT));
add(l1);
add(lst1);
lst1.add("ma��"); lst1.add("banana");
lst1.add("uva"); lst1.add("pera");
lst1.add("mam�o"); lst1.add("melancia");
}
}