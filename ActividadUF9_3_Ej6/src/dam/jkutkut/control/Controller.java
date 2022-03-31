package dam.jkutkut.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JTextField;

import dam.jkutkut.pojo.Palindromo;
import dam.jkutkut.view.View;

public class Controller implements ActionListener {
	private View window;
	private Random r;
	
	public Controller(View window) {
		this.window = window;
		r = new Random();
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
			int n = Integer.parseInt(txtBoxString);
			
			result = String.format(
				"El aleatorio menor que %d es %d",
				n,
				r.nextInt(n)
			);
		} catch (Exception e) {
			result = "Error";
		}
		window.getLabel().setText(result);
	}
}
