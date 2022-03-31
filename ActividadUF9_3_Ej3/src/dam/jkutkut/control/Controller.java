package dam.jkutkut.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.jkutkut.pojo.SecondDegreeEquation_Complex;
import dam.jkutkut.view.View;

public class Controller implements ActionListener {
private View window;
	
	public Controller(View window) {
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.getBtnSolve())
			handleBtn();
	}

	private void handleBtn() {
		double a, b, c;
		String result;
		try {
			a = Double.parseDouble(window.getTextFieldA().getText());
			b = Double.parseDouble(window.getTextFieldB().getText());
			c = Double.parseDouble(window.getTextFieldC().getText());
			result = SecondDegreeEquation_Complex.solve(
					a, b, c, window.getChckbxComplex().isSelected());
		}
		catch (Exception e) {
			result = "Error";
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		window.getLabel().setText(result);
	}
}
