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
			double i = Double.parseDouble(txtBox.getText());
			double euros = i * 0.91;
			
			result = String.format("%.2f $ = %.2f €", i, euros);
		}
		catch (NumberFormatException e) {
			result = "Error";
		}
		window.getLabel().setText(result);
	}
}
