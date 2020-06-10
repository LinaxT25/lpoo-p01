package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class OuvidoDoMenuItemNew implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent informacoesDoEvento) {
		JOptionPane.showMessageDialog(null, "Cliquei em File-> new");
	}

}
