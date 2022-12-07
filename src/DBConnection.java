import java.sql.Connection;


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
			}else{

			}

			return db;
			
		}
		public Connection getConn() {
		return conn;
		}

	   
		


		
	
}
