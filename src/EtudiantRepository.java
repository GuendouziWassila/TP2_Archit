
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository {
	
	private Connection Connect;
	private Ijournal Journal
	private Statement stmt;
	public EtudiantRepository(Ijournal Journal){
		try{
			this.Connect = DBConnection.getConn();
			this.stmt = this.Connect.createStatement();
		} catch (SQLException){
			e.printStackTrace();
		}
		this.Journal = Journal;
	}
	void add(Etudiant E) throws SQLException
	{
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			AfficherDate.setnomClass("Etudiant Service");
				Journal.outPut_Msg("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				AfficherDate.setnomClass("Etudiant Service");
				Journal.outPut_Msg("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }


	boolean Exists(String email) throws SQLException	
	{
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);
		
		if (rs){
			Journal.outPut_Msg("logBD--- :email existe dans la BD  " + email);
			connect.close();
			return true;
			}
		Journal.outPut_Msg("logBD--- : email n'existe pas " + email);	
		connect.close();
		return false;
	}
	
	boolean Exists(int mat) throws SQLException	
	{
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.execute(sql);
		
		if (rs){
			Journal.outPut_Msg("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			connect.close();
			return true;
			}
		Journal.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		connect.close();
		return false;
	}

}
