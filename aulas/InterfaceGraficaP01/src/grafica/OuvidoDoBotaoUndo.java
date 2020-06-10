package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class OuvidoDoBotaoUndo implements ActionListener {
	
	private JLabel barraDeStatus;
	
	public OuvidoDoBotaoUndo(JLabel barraDeStatus) {
		this.barraDeStatus = barraDeStatus;
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		barraDeStatus.setText("Cliquei no botao undo");
	}

}
