package cfg.team10.userinterface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class clientGUI extends JFrame implements userInterface, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4397889481843927876L;

	public clientGUI() {
		initMenu();
	}

	public void initMenu() {
		// create window
		final JFrame search = new JFrame();
		search.setTitle("Database Lookup");
		search.setLocationRelativeTo(null);
		search.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// create menu
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);

		JMenuItem restart = new JMenuItem("Restart");
		restart.setMnemonic(KeyEvent.VK_R);
		restart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				search.dispose();
				initMenu();
			}
		});

		JMenuItem exit = new JMenuItem("Exit");
		exit.setMnemonic(KeyEvent.VK_E);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		file.add(restart);
		file.add(exit);
		menubar.add(file);
		search.setJMenuBar(menubar);
		checkStatus(search);

		// make panel visible
		search.setVisible(true);
		menubar.setVisible(true);

	}

	private void checkStatus(final JFrame search) {
		// Build panel
		final JPanel p1 = new JPanel();
		p1.add(new JLabel("New Customer or Returning Customer"));

		// add radio buttons
		JRadioButton rbNew = new JRadioButton("New");
		JRadioButton rbReturn = new JRadioButton("Returning");

		// group the buttons and add to panel
		ButtonGroup queryMemb = new ButtonGroup();
		queryMemb.add(rbNew);
		queryMemb.add(rbReturn);
		search.add(p1);
		p1.add(rbNew);
		p1.add(rbReturn);
		search.pack();

		// add listeners to radio buttons

		// New Member - Will show new form to add them to database eventually
		rbNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				p1.setVisible(false);
				p1.removeAll();
				JOptionPane.showMessageDialog(null, "Not yet implemented",
						"InfoBox: Error", JOptionPane.ERROR_MESSAGE);
				System.out.println("Not yet implemented");
				search.dispose();
				initMenu();
			}
		});
		// If existing Member Prompts for member ID
		// will prompt for full details if time permits
		rbReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				p1.setVisible(false);
				search.remove(p1);

				int messageType = JOptionPane.INFORMATION_MESSAGE;
				String membId = JOptionPane.showInputDialog(p1,
						"Please Enter MemberID: ", "Existing Member",
						messageType);

				// yes 0 no 1 cancel 2
				// int usrChoice = JOptionPane.showConfirmDialog(p1,
				// "Has the purpose of this loan changed?", "Purpose?", 1);
				// System.out.println(usrChoice);
				// if (usrChoice != 2)

				memberLookup(search, membId);

			}
		});
		p1.setVisible(true);
	}

	private void memberLookup(JFrame search, String membId) {
		// if member is valid
		System.out.println("Member ID to be queried is: " + membId);

		// magic bit where query happens to retrieve info

		// add variables to be displayed in frame
		String[] labels = { "Account No: ", "First Name: ", "Last Name: ",
				"Display Name: ", "Date of Birth: ", "Gender" };
		int numPairs = labels.length;

		JPanel p = new JPanel(new GridLayout(8, 2));
		for (int i = 0; i < numPairs; i++) {
			JLabel l = new JLabel(labels[i], JLabel.TRAILING);
			p.add(l);

			JTextField textField = new JTextField(20);
			l.setLabelFor(textField);
			p.add(textField);
		}
		JLabel filler = new JLabel("", JLabel.TRAILING);
		p.add(filler);
		JButton b1 = new JButton("Submit changes");
		b1.setMnemonic(KeyEvent.VK_D);
		b1.addActionListener(this);
		p.add(b1);

		b1.setVisible(true);

		// Lay out the panel.
		// SpringUtilities.makeCompactGrid(p, numPairs, 2, // rows, cols
		// 6, 6, // initX, initY
		// 6, 6); // xPad, yPad

		// Set up the content pane.
		p.setOpaque(true); // content panes must be opaque
		search.setContentPane(p);

		// Display the window.
		search.pack();
		search.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked!");
		JFrame result = new JFrame();
		result.setTitle("Database Lookup");
		result.setLocationRelativeTo(null);

		// magic bit where query happens to retrieve info

		// add variables to be displayed in frame
		String[] labels = { "Account No: ", "First Name: ", "Last Name: ",
				"Display Name: ", "Date of Birth: ", "Gender" };
		int numPairs = labels.length;

		JPanel p = new JPanel(new GridLayout(8, 2));
		for (int i = 0; i < numPairs; i++) {
			JLabel l = new JLabel(labels[i], JLabel.TRAILING);
			p.add(l);

			JTextField textField = new JTextField(20);
			textField.setEditable(false);
			l.setLabelFor(textField);
			p.add(textField);
		}
		JLabel filler = new JLabel("", JLabel.TRAILING);
		p.add(filler);
		JButton b1 = new JButton("Submit changes");
		b1.setEnabled(false);
		b1.setMnemonic(KeyEvent.VK_D);
		b1.addActionListener(this);
		p.add(b1);

		b1.setVisible(true);

		// Lay out the panel.
		// SpringUtilities.makeCompactGrid(p, numPairs, 2, // rows, cols
		// 6, 6, // initX, initY
		// 6, 6); // xPad, yPad

		// Set up the content pane.
		p.setOpaque(true); // content panes must be opaque
		result.setContentPane(p);

		// Display the window.
		result.pack();
		result.setVisible(true);
	}

}