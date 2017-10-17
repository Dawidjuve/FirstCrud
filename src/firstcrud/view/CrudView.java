package firstcrud.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import firstcrud.control.Controller;

public class CrudView extends JFrame {
	public static final int TEXTAREA_ROWS = 8;
	public static final int TEXTAREA_COLUMNS = 20;
	private Controller ctrl;

	public CrudView(Controller ctrl) {
		this.ctrl = ctrl;
		makeView();
	}

	private void makeView() {
		final JTextField id = new JTextField();
		final JTextField title = new JTextField();
		final JTextField author = new JTextField();
		JPanel northPanel = new JPanel();
		northPanel.add(new JLabel("Book insertion "));
		add(northPanel, BorderLayout.NORTH);
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(3, 3));
		centerPanel.add(new JLabel("id: ", SwingConstants.RIGHT));
		centerPanel.add(id);
		centerPanel.add(new JLabel("Title: ", SwingConstants.RIGHT));
		centerPanel.add(title);
		centerPanel.add(new JLabel("Author: ", SwingConstants.RIGHT));
		centerPanel.add(author);
		add(centerPanel, BorderLayout.CENTER);

		// Dodanie przycisku wstawiającego tekst do obszaru tekstowego
		JPanel southPanel = new JPanel();
		JButton insertButton = new JButton("Insert");
		southPanel.add(insertButton);
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				ctrl.onCreate(Long.parseLong(id.getText()), title.getText(), Integer.parseInt(author.getText()));
				;
			}
		});
		add(southPanel, BorderLayout.SOUTH);
		pack();
	}
}
