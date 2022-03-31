package dam.jkutkut.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import dam.jkutkut.pojo.Palindromo;
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
		String txtBoxString = window.getTextFieldNumero().getText();
		String result;
		if (txtBoxString.length() == 0)
			result = "Introduce el número";
		else {
			if (Palindromo.esPalindromo(txtBoxString))
				result = "Es capicua";
			else
				result = "No es capicua";
			
			if (txtBoxString.length() != 3)
				result = "No tiene tamaño 3 pero " + result.toLowerCase();
		}
		window.getLabel().setText(result);
	}
}
