import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton("add");
	JButton button2 = new JButton("minus");
	JButton button3 = new JButton("multiply");
	JButton button4 = new JButton("divide");
	JTextField textfield = new JTextField(5);
	JTextField textfields = new JTextField(5);
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	}

	Calculator() {

		frame.add(panel);
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(textfield);
		panel.add(textfields);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String a = textfield.getText();
		String b = textfields.getText();
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		if (e.getSource() == button1) {
			label.setText("" + (c + d));
		}
		if (e.getSource() == button2) {
			label.setText("" + (c - d));
		}
		if (e.getSource() == button3) {
			label.setText("" + (c * d));
		}
		if(e.getSource() == button4) {
			label.setText(""+((double)c/(double)d));
		}
	}
}