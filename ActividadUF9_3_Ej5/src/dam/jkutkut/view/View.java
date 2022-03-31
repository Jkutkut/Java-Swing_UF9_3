package dam.jkutkut.view;

import javax.swing.JFrame;

import dam.jkutkut.control.Controller;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class View extends JFrame {
	
	private static final String TITLE = "";
	private static final int WIDTH = 500;
	private static final int HEIGHT = 200;
	
	private JTextField textFieldNumero;
	private JButton btnAceptar;
	private JLabel label;
	
	public View() {
		init();
	}
	
	private void init() {
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblIntro = new JLabel("Horas trabajadas:");
		lblIntro.setBounds(70, 33, 165, 15);
		getContentPane().add(lblIntro);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(305, 31, 114, 15);
		getContentPane().add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		btnAceptar = new JButton("Convertir");
		btnAceptar.setBounds(131, 74, 201, 25);
		getContentPane().add(btnAceptar);
		
		label = new JLabel("");
		label.setBounds(12, 111, 476, 15);
		getContentPane().add(label);
		
		// TODO
		
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
	}
	
	public void showWindow() {
		setVisible(true);
	}
	
	public void setController(Controller controller) {
		getBtnAceptar().addActionListener(controller);
	}
	
	// GETTERS
	
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	
	public JTextField getTextFieldNumero() {
		return textFieldNumero;
	}
	
	public JLabel getLabel() {
		return label;
	}
}
