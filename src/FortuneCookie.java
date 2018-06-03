import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	private void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.pack();
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		System.out.println("button has been clicked");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will find a new friend!");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will receive a large fortune!");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will eat something delicious!");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will make a nice purchase!");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will have a great day!");
		}

	}

}
