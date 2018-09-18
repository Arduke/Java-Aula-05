package TextPass;

public class TESTE03a {
	public static void main(String[] args) {
		Compo03a li = new Compo03a("teste1",500,500,500,500);
		li.setVisible(true);
		li.addWindowListener(new FechaJanela());
		
	}
}
