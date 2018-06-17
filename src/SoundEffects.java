import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	public static void main(String[] args) {
SoundEffects sound = new SoundEffects();
sound.showButton();
	}

	private void showButton() {
		JFrame frame = new JFrame();
		button.setText("1");
		button2.setText("2");
		button3.setText("3");
		button4.setText("4");
		JPanel panel = new JPanel();
		frame.add(button);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
	
		
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
JButton button5 = (JButton) e.getSource();
if(button5.equals(button)) {
	playSound("dog.wav");
} else if (button5.equals(button2)) {
	playSound("seagulls.wav");
} else if (button5.equals(button3)) {
	playSound("hyena.wav");
} else if (button5.equals(button4)) {
	playSound("birds.wav");
}
	}

}
