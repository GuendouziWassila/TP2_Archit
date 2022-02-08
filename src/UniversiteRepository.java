import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements I_UniversiteRepository{
	
private IJournal journal;
	
	public UniversiteRepository(IJournal comp) 
	{
		this.journal = comp;
	}
	
	@Override
	public Universite GetById(int universityId) throws SQLException {
		
		Connection connect = DBConnection.getConn();       //DBConnection -> Singleton 
		Statement stmt = connect.createStatement();
		
		AffichageEnrichir.setSender("UniversiteRepository");
		
		journal.outPut_Msg("LogBD : début recherche de id université dans la base de donnée");
		
		String sql = "select * from universite where i_univ="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		journal.outPut_Msg("LogBD : université récupérée");
		
		//connect.close();
		return u;	
	
		
	}	
	
}
