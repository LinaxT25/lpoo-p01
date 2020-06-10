package grafica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class JanelaComposicao {
	private JFrame janela;
	private JMenuBar barraDeMenu;
	
	private BotaoDoMenuPrincipal botaoFile;
	private BotaoDoMenuPrincipal botaoEdit;
	
	private JLabel barraDeStatus;
	
	public JanelaComposicao(String titulo) {
		janela = new JFrame(titulo);
		//janela.setLayout(new GridLayout());
		//janela.setLayout(new FlowLayout());
		
		janela.setLayout(new BorderLayout());
		
		barraDeMenu = new JMenuBar();
		
		configuraBotaoFile();
		configuraBotaoEdit();
		
		barraDeMenu.add(botaoFile.getMenu());
		barraDeMenu.add(botaoEdit.getMenu());
		
		barraDeStatus = new JLabel("Barra de status (sul do BorderLayout)");
		
		janela.add(barraDeStatus, BorderLayout.SOUTH);
		
		
		janela.setJMenuBar(barraDeMenu);
		janela.setSize(800, 600);
		janela.setVisible(true);
	}

	private void configuraBotaoEdit() {
		botaoEdit = new BotaoDoMenuPrincipal("Edit", 3);
		botaoEdit.adicionaMenuItem("Undo"); // 0
		botaoEdit.adicionaMenuItem("Redo"); // 1
		botaoEdit.adicionaMenuItem("Cut"); // 2
		
		// Maneira 1
		OuvidoDoBotaoUndo ouvidoDoBotaoUndo = new OuvidoDoBotaoUndo(barraDeStatus);
		botaoEdit.configuraEventoDeMenuItem(0, ouvidoDoBotaoUndo);
		
		// Maneira 2
		ActionListener ouvidoDoBotaoRedo = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evento) {
				barraDeStatus.setText("Cliquei no Redo");
				
			}
		};
		botaoEdit.configuraEventoDeMenuItem(1, ouvidoDoBotaoRedo);
		
		
		// Maneira 3
		ActionListener ouvidoDoBotaoCut = (ActionEvent evento) -> {
			barraDeStatus.setText("Cliquei no Cut");
		};
		botaoEdit.configuraEventoDeMenuItem(2, ouvidoDoBotaoCut);
	}

	private void configuraBotaoFile() {
		botaoFile = new BotaoDoMenuPrincipal("File", 3);
		botaoFile.adicionaMenuItem("New");
		botaoFile.adicionaMenuItem("Open");
		botaoFile.adicionaMenuItem("List");
		
		botaoFile.configuraEventoDeMenuItem
		(
				0, 
				(evento) -> { barraDeStatus.setText("Cliquei em new"); } // É o ouvido (listener)!
		);
		
		botaoFile.configuraEventoDeMenuItem
		(
				1, 
				(evento) -> { barraDeStatus.setText("Cliquei em open"); } // É o ouvido (listener)!
		);
		
		ActionListener ouvidoDoBotaoList = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String nomeDeArquivos[] = new String[3];
				nomeDeArquivos[0] = "oi.txt";
				nomeDeArquivos[1] = "tchau.txt";
				nomeDeArquivos[2] = "jiar_balsonoro.txt";
				
				
				LayoutManager layout = new GridLayout(4, 1);
				JPanel painel = new JPanel(layout);
				
				painel.add(new JLabel("Nome do arquivo"));
				painel.add(new JLabel(nomeDeArquivos[0]));
				painel.add(new JLabel(nomeDeArquivos[1]));
				painel.add(new JLabel(nomeDeArquivos[2]));
				
				
				janela.add(painel, BorderLayout.CENTER);
			}
		};
		botaoFile.configuraEventoDeMenuItem(2, ouvidoDoBotaoList);
	}
}
