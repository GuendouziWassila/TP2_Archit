import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "architecture";
		String url = "jdbc:mysql://localhost:3308/architecture?characterEncoding=latin1" ;
		String user = "root";
		String passwd = "";
	    private Connection conn;
	    private static DBConnection instance;
	   
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	    public static synchronized  DBConnection getinstance() throws SQLException {
	    	if (instance == null) {
	    		instance= new DBConnection();
	    	}
	    	
			return instance;
	    }
	    public Connection getConn() {
			return conn;
		}
	    
		
	
}
