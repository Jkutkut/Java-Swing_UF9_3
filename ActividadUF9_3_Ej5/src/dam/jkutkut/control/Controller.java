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
		try {
			int horas = Integer.parseInt(txtBoxString);
			int salario = Math.min(horas, 40) * 16 + Math.max(horas - 40, 0) * 20;
			
			result = String.format(
				"Salario = %dh * %d + %dh * %d = %d",
				Math.min(horas, 40),
				16,
				Math.max(horas - 40, 0),
				20,
				salario
			);
		} catch (Exception e) {
			result = "Error";
		}
		window.getLabel().setText(result);
	}
}
