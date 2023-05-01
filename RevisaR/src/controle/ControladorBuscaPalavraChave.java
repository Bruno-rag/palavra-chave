package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.DefaultListModel;
import visao.PanelBuscaPalavraChave;

public class ControladorBuscaPalavraChave implements ActionListener{

	PanelBuscaPalavraChave panelBPC;
	public  DefaultListModel dlm = new DefaultListModel();
	
	public ControladorBuscaPalavraChave(PanelBuscaPalavraChave panelBPC) {
		this.panelBPC = panelBPC;
		addEventos();
	}
	
	private void addEventos() {
		panelBPC.getListaPalavrasChave().setModel(dlm);
		panelBPC.getButtonAddPalavraChave().addActionListener(this);
		panelBPC.getButtonPesquisar().addActionListener(this);
		panelBPC.getButtonRemover().addActionListener(this);
		
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelBPC.getButtonAddPalavraChave()) {
			addListaPalavra(panelBPC.getTextFieldKey().getText());
		}else if (e.getSource() == panelBPC.getButtonPesquisar()) {
			pesquisaArtigos();
		}else if (e.getSource() == panelBPC.getButtonRemover()) {
			removeChaveDaLista();
		}
		
	}

	private void pesquisaArtigos() {
		File caminho = panelBPC.getFileChooser().getSelectedFile();
		
		if(caminho.isFile()) {
			try {
				var cont = 0;
				BufferedReader buffRead = new BufferedReader(new FileReader(caminho.getAbsolutePath()));
				String linha = "";
				while(true) {
					if(linha != null) {
						System.out.println(linha);
						//System.out.println(cont);
						cont++;
					}else {
						break;
					}
					
					linha = buffRead.readLine();					
				}
				buffRead.close();
				System.out.println(caminho.getAbsolutePath());
			} catch (Exception e) {
				
			}
			
		}else if(caminho.isDirectory()) {
			
		}
	}

	private void removeChaveDaLista() {
		String palavra = (String)panelBPC.getListaPalavrasChave().getSelectedValue();
		dlm.removeElement(palavra);	
	}

	private void addListaPalavra(String chave) {
		if (!dlm.contains(chave)) {
			dlm.addElement(chave);
		}
	}		
}
