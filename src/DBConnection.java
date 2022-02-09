import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "library_ebooks";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static Connection conn;

	   
	    private DBConnection() throws SQLException  {
		}

	    
	    public static synchronized Connection getConn() throws SQLException {
			if(conn == null)
				try{
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(url,user, passwd);
				}catch(Exception ex){
					System.out.println(ex.getMessage());
					System.out.println("couldn't connect!");
					throw new RuntimeException(ex);
				}
			return conn;
		}


		
	
}
