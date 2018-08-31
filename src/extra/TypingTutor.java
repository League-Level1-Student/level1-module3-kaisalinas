package extra;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class TypingTutor {
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
		label

	
	}
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	

}
