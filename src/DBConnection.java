import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		private static final DBConnection NULL = null;
		private String BDD = "nomBD";
		private String url = "jdbc:mysql://localhost:3306/" + BDD;
		private String user = "root";
		private String passwd = "";
	    private Connection conn;
              
	    //comments
		/**
		 * 
		 */
		private DBConnection(){}
	    private static DBConnection db; 
         
	    public static DBConnection getinstaConnection() throws SQLException {
			if(db == NULL){
				return db = new DBConnection(); }
			return db;
			
		}
         public Connection getConn(){
			 try {
				conn= DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			 return conn;
		 }
	   
		


		
	
}
