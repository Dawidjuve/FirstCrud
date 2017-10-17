package firstcrud;

import javax.swing.JFrame;

import firstcrud.control.Controller;
import firstcrud.view.CrudView;

public class Main {

	public static void main(String[] args) {
		
		
		Controller ctrl = new Controller();
		CrudView cv = new CrudView(ctrl);

		cv.pack();
		cv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cv.setVisible(true);

	}

}
