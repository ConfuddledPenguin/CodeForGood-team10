package cfg.team10.userinterface;

import javax.swing.*;

public class graphicalInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4397889481843927876L;

	private graphicalInterface() {
        JLabel jlbHelloWorld = new JLabel("Hello World");

        add(jlbHelloWorld);

        this.setSize(100,100);

        setVisible(true);
	}

	public static void main(String[] args) {

		new graphicalInterface();

	}

}
