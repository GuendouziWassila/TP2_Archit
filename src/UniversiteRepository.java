
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements InterfaceUniversiteRep {
	private InterfaceDBConnection BD ;
	private static Statement stmt;
	private IJournal journal;


	
	public UniversiteRepository (InterfaceDBConnection BD,IJournal journal){
		this.BD = BD;
		this.journal=journal;
		}
	
	@Override	
	public Universite GetById(int universityId) {
		try {
		Connection connect=BD.getConn(); 
		stmt = connect.createStatement();
		journal.outPut_Msg("LogBD : d�but recherche de id universit� dans la base de donn�e "
				+"\n"+"G�n�rer par :" +getClass().getName());
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite(rs.getInt(1),rs.getString(2),p);
			
		journal.outPut_Msg("LogBD : universit� r�cup�r�e"
				+"\n"+"G�n�rer par :" +getClass().getName());

	
		connect.close();
		return u;	
		}catch(SQLException e){
			e.printStackTrace();
			}
		return null;
		
	
		
	}

	@Override
	public int NbrLivreAutorise(int id_univ) {
		Universite univ =  GetById(id_univ);

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

	
}

