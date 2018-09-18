package TextPass;

public class TESTE01 {

	public static void main(String[] args) {
		Compo01 li = new Compo01("teste1",500,500,500,500);
		li.setVisible(true);
		li.addWindowListener(new FechaJanela());
		
	}

}
