import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniverRepo implements UniversiteRepository{
  public Universite GetById(int universityId) throws SQLException {
		
		DBConnection BD = DBConnection.getDB();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		System.out.println("LogBD : debut recherche de id universite dans la base de donnee");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		Universite u = null;
		if(rs.isBeforeFirst()) {
			rs.next();
			TypePackage p=TypePackage.valueOf(rs.getString(3));
			u = new Univ (universityId,rs.getString(2),p);
			
			System.out.println("LogBD : universite recuperee");
		}else {
			System.out.println("LogBD : universite n'existe pas");
		}
		
		connect.close();
		return u;	
	
		
	}	
}
