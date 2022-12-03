
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversityRep {
	
	IJournal msg2= new ScrennMsg();
	IJournal msg20 = new FileMsg();
	public Universite GetById(int universityId) throws SQLException {
		
		DBConnection BD=  DBConnection.getinstaConnection();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		msg20.outPut_Msg("LogBD : d�but recherche de id universit� dans la base de donn�e");
		msg2.outPut_Msg("LogBD : d�but recherche de id universit� dans la base de donn�e"); //System.out.println("LogBD : d�but recherche de id universit� dans la base de donn�e");
		 
		String sql = "SELECT * FROM universite WHERE id_universite ="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		msg20.outPut_Msg("LogBD : universit� r�cup�r�e");
		msg2.outPut_Msg("LogBD : universit� r�cup�r�e"); //System.out.println("LogBD : universit� r�cup�r�e");
		
		connect.close();
		return u;	
	
		
	}	
	
}
