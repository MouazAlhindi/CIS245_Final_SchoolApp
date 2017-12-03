import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import Utility.*;


public class Login extends JFrame {
	
	// Fields
	private JPanel loginFieldPanel;
	private JTextField userField;
	private JTextField passField;
	private JLabel userLabel;
	private JLabel passLabel;
	private JButton submitBtn;
	// private boolean student = true;
	
	// Constructor for Login Screen
	public Login(){
		
		loginFieldPanel = new JPanel();
		loginFieldPanel.setLayout(new GridLayout(3,2));
		
		
		createPanelComponents();
		addComponentsToPanel();
		
		add(loginFieldPanel);
		
		setTitle("The Skool App | Login");
		setVisible(true);
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	private void createPanelComponents() {
		userField = new JTextField(15);
		passField = new JTextField(15);
		userLabel = new JLabel("User Name");
		passLabel = new JLabel("Password");
		submitBtn = new JButton("Login");
		userLabel.setLabelFor(userField);
		passLabel.setLabelFor(passField);
	}
	
	private void addComponentsToPanel() {
		loginFieldPanel.add(userLabel);
		loginFieldPanel.add(userField);
		loginFieldPanel.add(passLabel);
		loginFieldPanel.add(passField);
		loginFieldPanel.add(submitBtn);
	}
	
	public static void main(String[] args) {
		new Login();
	}
	
	
	
	/* Button Listener class
	   will handle....
	   a select query
	   		Select username, password from Student where userField = username;   
	*/
	public class LoginButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// get text from user
			//String userName;
			//String password;
			
			//will try to search the sever for the username
				// will first try in the student if found bring back data
				// if not will try teacher table, if found bring back data AND set student = false
			// once matching username data is brough back (just username and password)
			// decrypt password and see if it matches with what the user inputedd
				// If match, switch to specified user frame
				// if not send out message saying oops wrong password
		}
		
	}

}
