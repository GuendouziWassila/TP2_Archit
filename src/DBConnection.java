import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* to implement the singleton pattern we changed the access to the constructor from public to 
 * private in addition to adding an instance "instance" and the method getInstance()*/

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static Connection conn;
	    private static DBConnection instance;
	   
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    
	    public Connection getConn() {
			return conn;
		}
	    
	    public static DBConnection getInstance() throws SQLException {
	    	if (instance == null)
	    	{ 
	    		instance = new DBConnection ();
	    		conn = instance.getConn();
	    	}
			return instance;
		}
         /* commentaire question 5 partie 1*/
}

		
	

