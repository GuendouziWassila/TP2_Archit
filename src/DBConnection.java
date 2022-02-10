import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements IDBConnexion {
	   
	//Imlémenter le patron singleton 
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
	    
	    //2- créer une variable pirvate static de type DBConnection
	    private static DBConnection instance;
	    

	   //1- Chander la visibilité du constructeur à privite
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    
	    
	    //3- créer une méthode (puplic static) getInstance qui va créer une seul instance
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
