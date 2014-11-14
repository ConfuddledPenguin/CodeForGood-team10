package cfg.team10.userinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class clientGUI extends JFrame implements userInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4397889481843927876L;

	public clientGUI() {
		initUI();
	}

	private void initUI() {
		// create window
		this.setTitle("Database Lookup");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// create menu
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);

		JMenuItem exit = new JMenuItem("Exit");
		exit.setMnemonic(KeyEvent.VK_E);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		file.add(exit);
		menubar.add(file);

		setJMenuBar(menubar);

		// make visible
		setVisible(true);
	}
}
