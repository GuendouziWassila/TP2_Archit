import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nombd";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	  private Connection conn;
	  
		static private DBConnection DataBase;
	   
	  public DBConnection() throws SQLException{

		conn=DriverManager.getConnection(url, user,passwd);

		}

	    static public DBConnection getDB() throws SQLException{
	    	if(DataBase == null) {
	    		DataBase = new DBConnection();
	    	}
	    	return DataBase;
	    }
	    
	    public Connection getConn() {
			return conn;
		}


		
	
}
