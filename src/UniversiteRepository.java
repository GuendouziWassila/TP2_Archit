import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversityRep {
	
	private IJournal j ;
	private InterfaceDBConnexion BDD;
	private static Statement stmt;
	public UniversiteRepository(InterfaceDBConnexion BDD , IJournal j){
		
		this.j = j ;
		this.BDD = BDD;
	
	}
	public Universite GetById(int universityId) throws SQLException {
		
		 
		stmt = BDD.getConn().createStatement();
		
		j.outPut_Msg("LogBD : début recherche de id université dans la base de donn�e");
		String sql = "SELECT * FROM universite WHERE id_universite ="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		j.outPut_Msg("LogBD : université récupérée");
		BDD.getConn().close();
		return u;	
	
		
	}
	@Override
	public int NbrLivreAutorise(int id_univ) throws SQLException {
		
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
