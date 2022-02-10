import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniverRepo implements UniversiteRepository{
  public Universite GetById(int universityId) throws SQLException {
		
		IJournal journal = new diffOutputJournal("def");
		DBConnection BD = DBConnection.getDB();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		journal.outPut_Msg("LogBD : debut recherche de id universite dans la base de donnee");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		Universite u = null;
		if(rs.isBeforeFirst()) {
			rs.next();
			TypePackage p=TypePackage.valueOf(rs.getString(3));
			u = new Univ (universityId,rs.getString(2),p);
			
			journal.outPut_Msg("LogBD : universite recuperee");
		}else {
			journal.outPut_Msg("LogBD : universite n'existe pas");
		}
		
		connect.close();
		return u;	
	
		
	}	
}
