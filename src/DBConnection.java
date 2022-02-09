import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static Connection conn;
	    private static DBConnection inst;
		
	   
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	    
	    public Connection getConn() {
			return conn;
		}
	    
	    public static DBConnection getInst() throws SQLException {
	    	if(inst==null) 
	    	{
			inst= new DBConnection();
	    	conn= inst.getConn();
		    }
	    return inst; 	
	    }

/* simple commentaire question partie1 TP2 */
		
	
}
