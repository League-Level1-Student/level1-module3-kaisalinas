package extra;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class TypingTutor implements KeyListener{
	JFrame frame = new JFrame();
	char currentLetter;
	JLabel label = new JLabel();
	public static void main(String[] args) {
	new TypingTutor();
}
	TypingTutor(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Type or Die");
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
		frame.add(label);
		frame.setSize(100, 100);
		label.setOpaque(true);
		label.setFont(label.getFont().deriveFont(28.0f));
		((JLabel) label).setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
	
	}
	
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if(e.getKeyChar()== currentLetter) {
			System.out.println("Correct");
			label.setBackground(Color.green);
		}
		else {
			label.setBackground(Color.red);
		}
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
