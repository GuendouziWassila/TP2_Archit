import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements InterfaceUniversiteRepository{
	private InterfaceDBConnection DB;
	private IJournal AffichageListes;
	public UniversiteRepository(InterfaceDBConnection DB, IJournal AffichageListes){
		this.DB = DB; this.AffichageListes = AffichageListes;
	}
	@Override
	public InterfaceUniversite GetById(int universityId) throws SQLException {
		Connection connect= DB.getConn();
		Statement stmt = connect.createStatement();
		AffichageListes.outPut_Msg("LogBD : début recherche de id université dans la base de donnée");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		AffichageListes.outPut_Msg("LogBD : université récupérée");
		
		connect.close();
		return u;	
	
		
	}	
}
