import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import Utility.DatabaseConnection;

// Application view of a teacher user
public class TeacherFrame extends JFrame {

	private DatabaseConnection database;
	
	public TeacherFrame(DatabaseConnection conn) {
		database = conn;
		
		
	}
	
	
	
	private class EventListener implements ActionListener{
		
		// TODO: Understand all the events, forms
		// and other actions the teacher are able to make
		// Also understand how the teacher will communicate with the database
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
}
