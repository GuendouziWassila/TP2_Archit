
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversiteRepository{
	private IDBConnection BD;
	
	private static Statement stmt;
	private IJournal jrnal;
	
	public UniversiteRepository (IDBConnection BD,IJournal jrnal){
		this.BD = BD;
		this.jrnal=jrnal;
		}
	public Universite GetById(int universityId)  {
		
		Connection connect=BD.getConn(); 
		 stmt = connect.createStatement();
		System.out.println("LogBD : début recherche de id université dans la base de donnée" +getClass().getName());
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		jrnl.outPut_Msg("LogBD : université récupérée" +getClass().getName());
		
		connect.close();
		return u;	
	
		
	}	catch(SQLException e){
		e.printStackTrace();
		}
	return null;
}
public int NbrLivreAutorise(int id_univ) {
	Universite univ =  GetById(id_univ);

	 if (univ.getPack() == TypePackage.Standard)
     {
		 Package pack = new Standard(null);
	        return pack.getNbrLivreAutorise();
	        }
     else if (univ.getPack() == TypePackage.Premium)
     {
    	 Package pack = new Premium(null);
    	 return pack.getNbrLivreAutorise();	    
    	 }                           

	return 0;
}
}
	
}
