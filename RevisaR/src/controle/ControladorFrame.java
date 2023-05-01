package controle;

import visao.Frame;
import visao.PanelBuscaPalavraChave;

public class ControladorFrame {

	static PanelBuscaPalavraChave pbc;
	static ControladorBuscaPalavraChave cbpc;
	
	public ControladorFrame() {
		
	}
	
	public static void main(String[] args) {
		Frame f = new Frame();
		pbc = new PanelBuscaPalavraChave();
		cbpc = new ControladorBuscaPalavraChave(pbc);
		f.setContentPane(pbc);
	}
}
