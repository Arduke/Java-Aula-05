package TextPass;

public class TESTE02 {

	public static void main(String[] args) {
		Compo02 li = new Compo02("teste2",500,500,500,500);
		li.setVisible(true);
		li.addWindowListener(new FechaJanela());
		
	}

}
