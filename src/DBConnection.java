import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements InterfaceDBConnection {
	   
		String BDD = "architecture";
		String url = "jdbc:mysql://localhost:3308/architecture?characterEncoding=latin1" ;
		String user = "root";
		String passwd = "";
	    private Connection conn;
	    private static InterfaceDBConnection instance;
	   
	    private DBConnection() {
			
		}

	    public static synchronized  InterfaceDBConnection getinstance(){
	    	if (instance == null) {
	    		instance= new DBConnection();
	    	}
	    	
			return instance;
	    }
	    @Override
		public Connection getConn() {
	    	
	    	try {
				conn=DriverManager.getConnection(url, user,passwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			return conn;
			
		}
	    
		
	
}
