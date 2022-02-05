
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
		composite.outPut_Msg("LogBD : début recherche de id université dans la base de donnée");
		//System.out.println("LogBD : début recherche de id université dans la base de donnée");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);

		AfficherDate.setClassName(this.getClass().getSimpleName());
		composite.outPut_Msg("LogBD : université récupérée");
		//System.out.println("LogBD : université récupérée");
		
		connect.close();
		return u;	
	
		
	}	
	
}
