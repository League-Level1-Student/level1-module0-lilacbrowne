import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	public static void main(String[] args) {

	}

	private void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.pack();
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		JButton button2 = new JButton();
		button2.addActionListener(this);
		frame.add(button2);
		JPanel panel = new JPanel();
		button.setVisible(true);
		button2.setVisible(true);
		panel.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
