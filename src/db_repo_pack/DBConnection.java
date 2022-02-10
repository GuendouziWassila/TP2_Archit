package db_repo_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		private static String url = "jdbc:mysql://localhost:3306/nombd";
		private static String user = "root";
		private static String passwd = "";
	    private static Connection conn;

	   
	    private  DBConnection() {}

	    
	    public static Connection getConn() throws SQLException {
	    	if(conn==null) {
	    		conn=DriverManager.getConnection(url, user,passwd);
	    	}
			return conn;
		}


		
	
}
