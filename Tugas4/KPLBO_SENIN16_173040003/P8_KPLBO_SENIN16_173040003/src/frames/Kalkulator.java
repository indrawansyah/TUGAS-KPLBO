package frames;

import javax.swing.JFrame;

import panels.KalkulatorPanel;

public class Kalkulator extends JFrame {
	public Kalkulator() {
		KalkulatorPanel kp = new KalkulatorPanel();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Kalkulator");
		setLocationRelativeTo(null);
		setSize(500, 200);
		add(kp);
	}

}
