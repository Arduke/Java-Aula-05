package TextPass;

public class TESTE05 {

	public static void main(String[] args) {
		Compo05 li = new Compo05("teste1",300,500,500,500);
		li.setVisible(true);
		li.addWindowListener(new FechaJanela());
	}

}
