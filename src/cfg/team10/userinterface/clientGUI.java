package cfg.team10.userinterface;

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
		SpringLayout layout = new SpringLayout();
		final JPanel p2 = new JPanel();
		p2.add(new JLabel("Member ID is: " + membId)); // change to query
		p2.add(new JLabel("First Name: "));
		p2.add(new JLabel("Surname: "));
		p2.add(new JLabel(": "));
		p2.add(new JLabel(": "));
		p2.add(new JLabel(": "));
		p2.add(new JLabel(": "));
		p2.setLayout(layout);
		search.add(p2);
		search.pack();

	}

}