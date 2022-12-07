import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements IDBConnection {
	   
		String BDD = "Archilog";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
        private static IDBConnection instance;
	   
	   private DBConnection()  {
			
		}
        
	   public static IDBConnection getInstance() {
		   if(instance==null) {
			   instance = new DBConnection();
		   }
		   return instance;
	   }
	    
	    public Connection getConn() {
	    	
	    	try {
				conn=DriverManager.getConnection(url, user,passwd);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return conn;
		}


		
	
}
