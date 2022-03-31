package dam.jkutkut.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import dam.jkutkut.view.View;

public class Controller implements ActionListener {
private View window;
	
	public Controller(View window) {
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.getBtnAceptar())
			handleBtn();
	}

	private void handleBtn() {
		JTextField txtBox = window.getTextFieldNumero();
		String result = "";
		try {
			int i = Integer.parseInt(txtBox.getText());
			if (i % 2 == 0)
				result = "Es par";
			else
				result = "Es impar";
		}
		catch (NumberFormatException e) {
			result = "Error";
		}
		window.getLabel().setText(result);
	}
}
