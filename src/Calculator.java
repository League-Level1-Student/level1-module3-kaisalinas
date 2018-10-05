import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JTextField textfield = new JTextField();
JTextField textfields = new JTextField();
public static void main(String[] args) {
	
}
Calculator(){
	
	frame.add(panel);
	panel.add(label);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(textfield);
	panel.add(textfields);
	
	frame.pack();
}

}
