
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversiteRepository{

	private IDBConnection BD;
	private IJournal composite;

	public UniversiteRepository(IDBConnection BD, IJournal composite) {
		this.BD = BD;
		this.composite = composite;
	}

	public Universite GetById(int universityId) throws SQLException {

		//Singleton
		//DBConnection BD= new DBConnection();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		//
		AfficherDate.setClassName(this.getClass().getSimpleName());
		composite.outPut_Msg("LogBD : d�but recherche de id universit� dans la base de donn�e");
		//System.out.println("LogBD : d�but recherche de id universit� dans la base de donn�e");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);

		AfficherDate.setClassName(this.getClass().getSimpleName());
		composite.outPut_Msg("LogBD : universit� r�cup�r�e");
		//System.out.println("LogBD : universit� r�cup�r�e");
		
		connect.close();
		return u;	
	
		
	}	
	
}
