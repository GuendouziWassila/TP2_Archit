import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
	private	String BDD = "nomBD";
	private	String url = "jdbc:mysql://localhost:3306/" + BDD;
	private	String user = "root";
	private	String passwd = "";
		
    private Connection conn;
    private static DBConnection instance;
	 /*   
	    public DBConnection() throws SQLException {
	    	
			conn=DriverManager.getConnection(url, user,passwd);
		}

	   
	    public Connection getConn() {
			return conn;
		}
*/
		
            private DBConnection() throws SQLException {
            	
            	conn = DriverManager.getConnection(url, user,passwd);
			   }

			   public  Connection getConn() {
			      return conn;
			   }
			
			   public static DBConnection geInstance() throws SQLException{
                   
				   if(instance == null) {
                    	instance = new DBConnection();
                    }
                    return instance;
		
                     }
}