import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	  private Connection conn;
	  
		static private DBConnection DataBase = new DBConnection();
		

	   
	  public DBConnection(){

			try {
				conn=DriverManager.getConnection(url, user,passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	    static public DBConnection getDB() {
	    	return DataBase;
	    }
	    
	    public Connection getConn() {
			return conn;
		}


		
	
}
