package Utility;

import java.sql.*;

public class DatabaseConnection {
	
	
	// fields for making and securing a connection with the database
	private String connectionUrl;
	private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    public DatabaseConnection() {
    	
    		// Code to establish a connection to the server with given params
    	// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // conn = DriverManager.getConnection(connectionUrl);  
    }
}
