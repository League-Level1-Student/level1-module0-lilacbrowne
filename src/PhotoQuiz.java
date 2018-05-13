
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String image = "http://www.bichonfinder.com/wp-content/uploads/2009/01/Cute-Bichon-Frise-Puppy-Dog.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component dog = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JPanel panel = new JPanel();

		frame.add(dog);
		// 5. call the pack() method on the quiz window

		frame.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What color is the puppy in this photo?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equalsIgnoreCase("white")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		frame.remove(dog);
		// 10. find another image and create it (might take more than one line of code)
		String pic = "https://cdn.pixabay.com/photo/2017/05/03/10/32/dog-2280748_960_720.jpg";
		// 11. add the second image to the quiz window
		Component pup = createImage("https://cdn.pixabay.com/photo/2017/05/03/10/32/dog-2280748_960_720.jpg");
		// 12. pack the quiz window
		frame.add(dog);
		frame.pack();
		// 13. ask another question
		String response = JOptionPane.showInputDialog("What is the color of this pup?");
		if (response.equalsIgnoreCase("brown")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
		}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
