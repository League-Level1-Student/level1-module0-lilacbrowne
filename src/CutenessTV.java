import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {
		CutenessTV cuteness = new CutenessTV();
		cuteness.showButton();
		
	}
	private void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		button.setText("1");
		button2.setText("2");
		button3.setText("3");
		frame.add(button);
		frame.add(button2);
		frame.add(button3);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button4 = (JButton) e.getSource();
		if(button4.equals(button)) {
			showDucks();
		} else if (button4.equals(button2)) {
			showFrog();
		} else if (button4.equals(button3)) {
			showFluffyUnicorns();
		}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
