
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversiteRepository{
	
	
	public Universite GetById(int universityId) {
		try{
		DBConnection BD= DBConnection.getInstance();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		System.out.println("LogBD : début recherche de id université dans la base de donnée");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		System.out.println("LogBD : université récupérée");
		
		connect.close();
		return u;	
		}catch(SQLException e){
			e.printStackTrace();
		}
		

		return null;
	}	
	
	@Override
	public int NbrLivreAutorise(int id_univ) {
		Universite Univ =  GetById(id_univ);
		
		if (Univ.getPack() == TypePackage.Standard)
	     {
			Package pack = new Standard(null);
	        return pack.nbrLivreAutorise;
	     }
	     else if (Univ.getPack() == TypePackage.Premium)
	     {
	    	 Package pack = new Premuim(null);
	    	 return pack.nbrLivreAutorise;
	    	 }     
		
		return 0;
	}
		
	
}
