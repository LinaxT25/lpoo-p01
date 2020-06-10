package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class OuvidoDoMenuItemOpen implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent informacoesDoEvento) {
		JOptionPane.showMessageDialog(null, "Cliquei em File->open");

	}

}
