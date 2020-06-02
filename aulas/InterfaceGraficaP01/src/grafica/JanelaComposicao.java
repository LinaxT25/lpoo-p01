package grafica;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JanelaComposicao {
	private JFrame janela;
	private JMenuBar barraDeMenu;
	private JMenu menuFile;
	private JMenuItem menuFileNew;
	private JMenuItem menuFileOpen;
	
	private JMenu menuEdit;
	private JMenuItem menuEditUndo;
	private JMenuItem menuEditRedo;
	
	private JLabel textoQualquer1, textoQualquer2;
	private JButton botaoQualquer;
	
	public JanelaComposicao(String titulo) {
		janela = new JFrame(titulo);
		//janela.setLayout(new GridLayout());
		//janela.setLayout(new FlowLayout());
		janela.setLayout(new BorderLayout());
		barraDeMenu = new JMenuBar();
		menuFile = new JMenu("File");
		menuFileNew = new JMenuItem("new");
		menuFileOpen = new JMenuItem("open");
		menuFile.add(menuFileNew);
		menuFile.add(menuFileOpen);
		
		menuEdit = new JMenu("Edit");
		menuEditUndo = new JMenuItem("undo");
		menuEditRedo = new JMenuItem("redo");
		menuEdit.add(menuEditUndo);
		menuEdit.add(menuEditRedo);
		
		barraDeMenu.add(menuFile);
		barraDeMenu.add(menuEdit);
		
		textoQualquer1 = new JLabel("Sou um texto qualquer 1");
		textoQualquer2 = new JLabel("Sou um texto qualquer 2");
		botaoQualquer = new JButton("Sou um botao");
		
		janela.add(textoQualquer1, BorderLayout.NORTH);
		janela.add(textoQualquer2, BorderLayout.SOUTH);
		janela.add(botaoQualquer, BorderLayout.CENTER);
		
		janela.setJMenuBar(barraDeMenu);
		janela.setSize(800, 600);
		janela.setVisible(true);
	}
}
