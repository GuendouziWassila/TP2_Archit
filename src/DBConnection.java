import java.sql.Connection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection implements InterfaceDBConnexion {
	   
		
		private String BDD = "nombd";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
		private static DBConnection db; 
	    //comments
		
		private DBConnection(){}
	    
         
	    public static DBConnection getinstance() {
			if(db == null){
			  db = new DBConnection(); 
			}

			return db;
			
		}
		public Connection getConn() {
		return conn;
		}

	   
		


		
	
}
