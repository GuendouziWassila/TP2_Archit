import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		static String BDD = "library_book";
		static String url = "jdbc:mysql://localhost:3306/library_book";
		static String user = "root";
		static String passwd = "";
	    private static  Connection conn;

	   
	    private DBConnection()  {
			
		}

	    
	    public static synchronized Connection getConn() throws SQLException {
	    	if (conn==null) conn=DriverManager.getConnection(url, user,passwd);
			return conn;
		}


		
	
}
