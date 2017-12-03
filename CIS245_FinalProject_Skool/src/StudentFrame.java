import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import Utility.DatabaseConnection;

// Application view for a student user
public class StudentFrame extends JFrame{
	
	private DatabaseConnection database;
	
	public StudentFrame(DatabaseConnection conn) {
		database = conn;
	}
	
	
	private class EventListener implements ActionListener{
		
		// TODO:
		// Understand the events, forms and views for a student user
		// also understand how the student user will communicate with the database
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}

}
