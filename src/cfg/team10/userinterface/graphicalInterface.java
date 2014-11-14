package cfg.team10.userinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class graphicalInterface extends JFrame {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 4397889481843927876L;

	public graphicalInterface() {
	        
	       setTitle("Simple example");
	       setSize(300, 200);
	       setLocationRelativeTo(null);
	       setDefaultCloseOperation(EXIT_ON_CLOSE);        
	    }
	
	public static void main(String[] args) {
		  EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	            	graphicalInterface ex = new graphicalInterface();
	                ex.setVisible(true);
	            }
	        });
	}

}
