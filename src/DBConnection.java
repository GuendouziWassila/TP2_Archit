import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements InterfaceDBConnection{
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
		private static DBConnection db;
	    private DBConnection() throws SQLException  {
			 conn = DriverManager.getConnection(url,user, passwd);
		}
		public static synchronized DBConnection getInstanceDB() throws SQLException {
			if(db == null)
				db= new DBConnection();
			return db;
		}
	    public Connection getConn()  {
			return conn;
		}	
}
