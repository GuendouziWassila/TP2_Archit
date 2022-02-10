import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements InterfaceDBConnexion {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	        private Connection conn;

	   
	        private static DBConnection instance;
	   
	        private DBConnection() {
			conn=DriverManager.getConnection(url ,user ,password) ;; 
		}

                public static DBConnection getInstance(){
		if(instance == null){
			instance = new DBConnection();	
		}
		return instance;
	}

	    
	    public Connection getConn() {
			return conn;
		}
		
	
}
