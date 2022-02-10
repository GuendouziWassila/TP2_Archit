package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Repository.InterfaceDBConnection;

public class DBConnection implements InterfaceDBConnection{
	   
		private String BDD = "nomBD";
		private String url = "jdbc:mysql://localhost:3306/" + BDD;
		private String user = "root";
		private String passwd = "";
	    private Connection conn;
	    private static DBConnection instance;

	   
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    
	    public static DBConnection getInstance() throws SQLException{
			if(instance == null){
				instance = new DBConnection();
			}else if (instance.getConn().isClosed()) {
	            instance = new DBConnection();
	        }
			return instance;
		}

	    @Override
	    public Connection getConn() throws SQLException {
	    	if(conn.isClosed()) {
	    		conn=DriverManager.getConnection(url, user,passwd);
	    	}
			return conn;
		}


		
	
}
