package dam.jkutkut.main;

import dam.jkutkut.control.Controller;
import dam.jkutkut.view.View;

public class Main {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater (new Runnable() {
			public void run() {
			  View window = new View();
			  Controller controller = new Controller(window);
			  window.setController(controller);
			  window.showWindow();
			}
		});
	}
}
