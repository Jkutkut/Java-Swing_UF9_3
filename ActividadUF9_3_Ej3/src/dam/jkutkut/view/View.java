package dam.jkutkut.view;

import javax.swing.JFrame;

import dam.jkutkut.control.Controller;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class View extends JFrame {
	
	private static final String TITLE = "";
	private static final int WIDTH = 500;
	private static final int HEIGHT = 200;
	
	private JTextField textFieldA;
	private JButton btnSolve;
	private JLabel label;
	private JTextField textFieldB;
	private JTextField textFieldC;
	private JCheckBox chckbxComplex;
	private JLabel lblX;
	private JLabel lblX_1;
	private JLabel label_1;
	
	public View() {
		init();
	}
	
	private void init() {
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblIntro = new JLabel("Ecuaciones de segundo grado: ax^2 + bx + c = 0");
		lblIntro.setBounds(56, 12, 409, 15);
		getContentPane().add(lblIntro);
		
		textFieldA = new JTextField();
		textFieldA.setToolTipText("a");
		textFieldA.setBounds(32, 33, 50, 15);
		getContentPane().add(textFieldA);
		textFieldA.setColumns(10);
		
		lblX = new JLabel("x² + ");
		lblX.setBounds(114, 33, 40, 15);
		getContentPane().add(lblX);
		
		textFieldB = new JTextField();
		textFieldB.setColumns(10);
		textFieldB.setBounds(186, 33, 50, 15);
		getContentPane().add(textFieldB);
		
		lblX_1 = new JLabel("x +");
		lblX_1.setBounds(268, 33, 32, 15);
		getContentPane().add(lblX_1);
		
		textFieldC = new JTextField();
		textFieldC.setColumns(10);
		textFieldC.setBounds(332, 33, 50, 15);
		getContentPane().add(textFieldC);
		
		label_1 = new JLabel("= 0");
		label_1.setBounds(414, 33, 40, 15);
		getContentPane().add(label_1);
		
		btnSolve = new JButton("Convertir");
		btnSolve.setBounds(131, 86, 201, 25);
		getContentPane().add(btnSolve);
		
		chckbxComplex = new JCheckBox("Complex");
		chckbxComplex.setBounds(353, 87, 98, 23);
		getContentPane().add(chckbxComplex);
		
		label = new JLabel("");
		label.setBounds(12, 120, 476, 15);
		getContentPane().add(label);
		
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
	}
	
	public void showWindow() {
		setVisible(true);
	}
	
	public void setController(Controller controller) {
		getBtnSolve().addActionListener(controller);
	}
	
	// GETTERS
	
	public JButton getBtnSolve() {
		return btnSolve;
	}

	public JTextField getTextFieldA() {
		return textFieldA;
	}

	public JTextField getTextFieldB() {
		return textFieldB;
	}

	public JTextField getTextFieldC() {
		return textFieldC;
	}

	public JLabel getLabel() {
		return label;
	}
	
	public JCheckBox getChckbxComplex() {
		return chckbxComplex;
	}
}
