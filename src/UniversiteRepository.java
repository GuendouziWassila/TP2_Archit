
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversite {


	@Override
	public Universite GetById(int universityId) throws SQLException {
                IJournal journal = new MultipleOutputJournal("def");
		DBConnection BD= DBConnection.getInstance();
		Connection connect= BD.getConn();
		Statement stmt = connect.createStatement();
		System.out.println("LogBD : début recherche de id université dans la base de donnée");
		ournal.outPut_Msg("LogBD : debut recherche de id universite dans la base de donnee");
		String sql = "SELECT * FROM universite WHERE id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		System.out.println("LogBD : université récupérée");
		journal.outPut_Msg("LogBD : universite recuperee");
		//connect.close();
		return u;	
	
		
	}
	public int NbrLivreAutorise(int id_univ) {
	// TODO Auto-generated method stub
	Universite Univ =  GetById(id_univ);
	
	if (Univ.getPack() == TypePackage.Standard)
     {
		Package pack = new Standard(null);
        return pack.nbrLivreAutorise;
     }
     else if (Univ.getPack() == TypePackage.Premium)
     {
    	 Package pack = new Premuim(null);
    	 return pack.nbrLivreAutorise;
    	 }     
	
	return 0;
}
	
}
