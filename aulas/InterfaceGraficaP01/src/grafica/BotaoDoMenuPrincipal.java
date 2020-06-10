package grafica;

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class BotaoDoMenuPrincipal {
	
	private JMenu menu;
	private JMenuItem menuItems[];
	private int quantidadeAtualDeMenuItems;
	
	
	public BotaoDoMenuPrincipal(String nome, int quantidadeDeMenuItems) {
		menu = new JMenu(nome);
		menuItems = new JMenuItem[quantidadeDeMenuItems];
		setQuantidadeDeMenuItems(0);
	}
	
	public void adicionaMenuItem(String menuItem) {
		menuItems[quantidadeAtualDeMenuItems] = new JMenuItem(menuItem);
		menu.add(menuItems[quantidadeAtualDeMenuItems]);
		
		setQuantidadeDeMenuItems(getQuantidadeAtualDeMenuItems()+1);
	}
	
	public void configuraEventoDeMenuItem(int indiceMenuItem, ActionListener ouvido) {
		menuItems[indiceMenuItem].addActionListener(ouvido);
	}
	
	private void setQuantidadeDeMenuItems(int quantidadeDeMenuItems) {
		this.quantidadeAtualDeMenuItems = quantidadeDeMenuItems;
		
	}
	
	private int getQuantidadeAtualDeMenuItems() {
		return quantidadeAtualDeMenuItems;
	}

	public JMenu getMenu() {
		return menu;
	}
	
}
