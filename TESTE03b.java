package TextPass;


public class TESTE03b {
	public static void main(String[] args) {
		Compo03b li = new Compo03b("teste1",500,500,500,500);
		li.setVisible(true);
		li.addWindowListener(new FechaJanela());
		
	}
}

