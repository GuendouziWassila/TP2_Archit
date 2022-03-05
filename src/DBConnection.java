import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static Connection conn;
	    private static DBConnection INST;
	   
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    
	    public Connection getConn() {
			return conn;
		}
	    
	    public static DBConnection getInstance() throws SQLException {
	    	if (INST == null)
	    	{ 
	    		INST = new DBConnection ();
	    		conn = INST.getConn();
	    	}
			return INST;
		}

}


/* simple commentaire question partie1 TP2 */
		
	

