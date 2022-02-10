import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements IDBConnexion {
	   
	//Iml�menter le patron singleton 
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
	    
	    //2- cr�er une variable pirvate static de type DBConnection
	    private static DBConnection instance;
	    

	   //1- Chander la visibilit� du constructeur � privite
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    
	    
	    //3- cr�er une m�thode (puplic static) getInstance qui va cr�er une seul instance
	    public static DBConnection getInstance() throws SQLException {
	    	if(instance==null) {
	    		instance = new DBConnection();
	    	}
	    	return instance;
	    }
	      

	    
	    public Connection getConn() {
			return conn;
		}


		
	
}
