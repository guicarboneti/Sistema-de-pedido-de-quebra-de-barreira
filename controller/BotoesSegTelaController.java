package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesSegTelaController implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Editar Pedido")) {
		}
		if(cmd.equals("Ver Pedido")) {

		}
	}
	
}
