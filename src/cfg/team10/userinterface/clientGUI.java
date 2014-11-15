package cfg.team10.userinterface;

import java.awt.Container;
import java.awt.Frame;
import java.awt.TextArea;
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
		initMenu();
	}

	public void initMenu() {
		// create window
		JFrame search = new JFrame();
		search.setTitle("Database Lookup");
		search.setLocationRelativeTo(null);
		search.setDefaultCloseOperation(EXIT_ON_CLOSE);

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
				// int messageType = JOptionPane.ERROR_MESSAGE;
				// String membId = JOptionPane.showInputDialog(p1,
				// "Please Enter MemberID: ", "Existing Member",
				// messageType);
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
				memberLookup(search, membId);
			}
		});
		p1.setVisible(true);
	}

	private void memberLookup(JFrame search, String membId) {
		// if member is valid
		System.out.println("Member ID to be queried is: " + membId);
		// SpringLayout layout = new SpringLayout();
		// Container p2 = new JPanel();
		String[] labels = { "Name: ", "Fax: ", "Email: ", "Address: " };
		int numPairs = labels.length;

		JPanel p = new JPanel(new SpringLayout());
		for (int i = 0; i < numPairs; i++) {
			JLabel l = new JLabel(labels[i], JLabel.TRAILING);
			p.add(l);
			JTextField textField = new JTextField(10);
			l.setLabelFor(textField);
			p.add(textField);
		}

		// Lay out the panel.
		SpringUtilities.makeCompactGrid(p, numPairs, 2, // rows, cols
				6, 6, // initX, initY
				6, 6); // xPad, yPad

		// Set up the content pane.
		p.setOpaque(true); // content panes must be opaque
		search.setContentPane(p);

		// Display the window.
		search.pack();
		search.setVisible(true);

		// JLabel lId = new JLabel("Member ID is: ");
		// JLabel fName = new JLabel("First Name: ");
		// JLabel sName = new JLabel("Surname: ");
		// JLabel temp1 = new JLabel(": ");
		// JLabel t2 = new JLabel(": ");
		// JLabel t3 = new JLabel(": ");
		// JLabel t4 = new JLabel(": ");
		// JLabel paddingId = new JLabel("<padding>"); // change to query
		// JLabel paddingfName = new JLabel("<padding>");
		// JLabel paddingsName = new JLabel("<padding>");
		// JLabel paddingtemp1 = new JLabel("<padding>");
		// JLabel paddingt2 = new JLabel("<padding>");
		// JLabel paddingt3 = new JLabel("<padding>");
		// JLabel paddingt4 = new JLabel("<padding>");

		// p2.add(lId);
		// p2.add(fName);
		// p2.add(sName);
		// p2.add(temp1);
		// p2.add(t2);
		// p2.add(t3);
		// p2.add(t4);
		// p2.add(paddingId);
		// p2.add(paddingfName);
		// p2.add(paddingsName);
		// p2.add(paddingtemp1);
		// p2.add(paddingt2);
		// p2.add(paddingt3);
		// p2.add(paddingt4);

		// layout.putConstraint(SpringLayout.WEST, lId, 0, SpringLayout.WEST,
		// p2);
		// layout.putConstraint(SpringLayout.WEST, fName, 1, SpringLayout.WEST,
		// p2);
		// layout.putConstraint(SpringLayout.WEST, sName, 2, SpringLayout.WEST,
		// p2);
		// layout.putConstraint(SpringLayout.WEST, temp1, 3, SpringLayout.WEST,
		// p2);
		// layout.putConstraint(SpringLayout.WEST, t2, 4, SpringLayout.WEST,
		// p2);
		// layout.putConstraint(SpringLayout.WEST, t3, 5, SpringLayout.WEST,
		// p2);
		// layout.putConstraint(SpringLayout.WEST, t4, 6, SpringLayout.WEST,
		// p2);

		// p2.setLayout(layout);
		// search.add(p2);
		// search.pack();

	}

}