
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversiteRepository {

	//private IJournal composite;
	private IDBConnection BD;

	public UniversiteRepository(IDBConnection BD) {
	//	this.composite = composite;
		this.BD = BD;
	}
	
	public Universite GetById(int universityId) throws SQLException {

		// singleton
		//DBConnection BD= DBConnection.setDBC();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		//composite.outPut_Msg("LogBD : d�but recherche de id universit� dans la base de donn�e");
		System.out.println("LogBD : d�but recherche de id universit� dans la base de donn�e");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);

		//composite.outPut_Msg("LogBD : universit� r�cup�r�e");
		System.out.println("LogBD : universit� r�cup�r�e");
		
		connect.close();
		return u;	
	
		
	}	
	
}
