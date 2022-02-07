import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		static String BDD = "mydb";
		static String url = "jdbc:mysql://localhost:3306/" + BDD;
		static String user = "root";
		static String passwd = "";
		private static Connection conn = null;

	   
	    public static Connection getConn() throws SQLException {
			if(conn == null) conn = DriverManager.getConnection(url, user,passwd);
			return conn;
		}


		
	
}
