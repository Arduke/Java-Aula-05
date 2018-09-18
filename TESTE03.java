package TextPass;

public class TESTE03 {

	public static void main(String[] args) {
		Compo03 li = new Compo03("teste1",500,500,500,500);
		li.setVisible(true);
		li.addWindowListener(new FechaJanela());
		
	}

}
