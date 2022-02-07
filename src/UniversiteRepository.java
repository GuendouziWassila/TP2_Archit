
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements InterfaceUnivRep {
	InterfaceDBConnection db;
	private IJournal journal;
	
	public UniversiteRepository(InterfaceDBConnection db,IJournal journal) {
		this.db=db;
		this.journal= journal;
	}
	
	@Override
	public Universite GetById(int universityId) throws SQLException, IOException {
		
		
		Connection connect=db.getConn(); 
		Statement stmt = connect.createStatement();
		//System.out.println("LogBD : d�but recherche de id universit� dans la base de donn�e");
		journal.outPut_Msg("LogBD : d�but recherche de id universit� dans la base de donn�e");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		//System.out.println("LogBD : universit� r�cup�r�e");
		journal.outPut_Msg("LogBD : universit� r�cup�r�e");
		
		connect.close();
		return u;	
	
		
	}

	@Override
	public int NbrLivreAutorise(int univId) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Universite univ= GetById(univId);
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

	@Override
	public int NbrLivreBonus(int univId) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Universite univ= GetById(univId);
		if (univ.getPack() == TypePackage.Standard)
	     {
			Package pack = new Standard(null);
	        return pack.getNbrLivreBonus();
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 Package pack = new Premium(null);
		     return pack.getNbrLivreBonus();
	     }
		return 0;
	}	
	
}
