import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Login extends JFrame {
	
	// Fields
	private JTextField userField;
	private JTextField passField;
	private JLabel userLabel;
	private JLabel passLabel;
	private JButton submitBtn;
	
	// Constructor for Login Screen
	public Login(){
		
		createJComponenets();
		addComponents();
		
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void createJComponenets() {
		userField = new JTextField(30);
		passField = new JTextField(30);
		userLabel = new JLabel("User Name");
		passLabel = new JLabel("Password");
		submitBtn = new JButton("Login");
	}
	
	private void addComponents() {
		add(userLabel);
		add(userField);
		add(passLabel);
		add(passField);
		add(submitBtn);
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
