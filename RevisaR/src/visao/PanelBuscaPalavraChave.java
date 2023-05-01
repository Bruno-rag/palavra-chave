package visao;


import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;


public class PanelBuscaPalavraChave extends JPanel {
	private JFileChooser fileChooser;
	private JTextField textFieldKey;
	private JButton buttonAddPalavraChave;
	private JList listaPalavrasChave;
	private JButton buttonPesquisar;
	private JPanel panel;
	private JButton buttonRemover;
	private JRadioButton radioButtonE;
	private JRadioButton radioButtonOu;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	public PanelBuscaPalavraChave() {
		super();
		this.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(402, 158, 46, 584);
		add(separator);
		add(getFileChooser());
		add(getTextFieldKey());
		add(getButtonAddPalavraChave());
		add(getListaPalavrasChave());
		add(getButtonPesquisar());
		add(getPanel());
		add(getButtonRemover());
		add(getRadioButtonE());
		add(getRadioButtonOu());
	}
	
	public JFileChooser getFileChooser() {
		if (fileChooser == null) {
			fileChooser = new JFileChooser();
			
			fileChooser.setApproveButtonText("Abrir");
			fileChooser.setBounds(10, 189, 382, 273);
			fileChooser.setFileSelectionMode(2);
			fileChooser.setControlButtonsAreShown(false);
			
		}
		return fileChooser;
	}
	
	public JTextField getTextFieldKey() {
		if (textFieldKey == null) {
			textFieldKey = new JTextField();
			textFieldKey.setBorder(new TitledBorder(null, "Palavra chave ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			textFieldKey.setBounds(10, 472, 264, 39);
			textFieldKey.setColumns(10);
		}
		return textFieldKey;
	}
	
	public JButton getButtonAddPalavraChave() {
		if (buttonAddPalavraChave == null) {
			buttonAddPalavraChave = new JButton("Adicionar ");
			buttonAddPalavraChave.setBounds(284, 472, 108, 39);
		}
		return buttonAddPalavraChave;
	}
	
	public JList getListaPalavrasChave() {
		if (listaPalavrasChave == null) {
			listaPalavrasChave = new JList();
			listaPalavrasChave.setBounds(10, 518, 382, 119);
			listaPalavrasChave.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
		}
		return listaPalavrasChave;
	}
	
	public JButton getButtonPesquisar() {
		if (buttonPesquisar == null) {
			buttonPesquisar = new JButton("Pesquisar");
			buttonPesquisar.setBounds(153, 692, 126, 39);
		}
		return buttonPesquisar;
	}
	
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(421, 200, 879, 422);
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGap(0, 879, Short.MAX_VALUE)
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGap(0, 422, Short.MAX_VALUE)
			);
			panel.setLayout(gl_panel);
		}
		return panel;
	}
	
	public JButton getButtonRemover() {
		if (buttonRemover == null) {
			buttonRemover = new JButton("Remover");
			buttonRemover.setBounds(274, 647, 118, 35);
		}
		return buttonRemover;
	}
	
	public JRadioButton getRadioButtonE() {
		if (radioButtonE == null) {
			radioButtonE = new JRadioButton("Pesquisar E");
			buttonGroup.add(radioButtonE);
			radioButtonE.setBounds(10, 654, 103, 21);
		}
		return radioButtonE;
	}
	
	public JRadioButton getRadioButtonOu() {
		if (radioButtonOu == null) {
			radioButtonOu = new JRadioButton("Pesquisar Ou");
			buttonGroup.add(radioButtonOu);
			radioButtonOu.setBounds(10, 683, 103, 21);
		}
		
		return radioButtonOu;
	}
	
	

	
	
}
