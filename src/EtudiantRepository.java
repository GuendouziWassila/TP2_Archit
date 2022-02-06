
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements IEtudiantRepository{

	private IDBConnection BD;
	private IJournal composite;

	public EtudiantRepository(IDBConnection BD, IJournal composite) {
		this.BD = BD;
		this.composite = composite;
	}
	
	
	public void add(Etudiant E) throws SQLException
	{
		//Singleton
		//DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
				AfficherDate.setClassName(this.getClass().getSimpleName());
				composite.outPut_Msg("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
				//System.out.println("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				AfficherDate.setClassName(this.getClass().getSimpleName());
				composite.outPut_Msg("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
				//System.out.println("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }


	public boolean Exists(String email) throws SQLException
	{
		//Singleton
		//DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);
		
		if (rs){
			AfficherDate.setClassName(this.getClass().getSimpleName());
			composite.outPut_Msg("logBD--- :email existe dans la BD  " + email);
			//System.out.println("logBD--- :email existe dans la BD  " + email);
			connect.close();
			return true;
			}
		AfficherDate.setClassName(this.getClass().getSimpleName());
		composite.outPut_Msg("logBD--- : email n'existe pas " + email);
		//System.out.println("logBD--- : email n'existe pas " + email);
		connect.close();
		return false;
	}
	
	public boolean Exists(int mat) throws SQLException
	{
		//Singleton
		//DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.execute(sql);
		
		if (rs){
			AfficherDate.setClassName(this.getClass().getSimpleName());
			composite.outPut_Msg("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			//System.out.println("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			connect.close();
			return true;
			}
		AfficherDate.setClassName(this.getClass().getSimpleName());
		composite.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);
		//System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);
		connect.close();
		return false;
	}

	public boolean checkEmailAndMatricule(IEtudiant stud) throws SQLException {

		if (stud.getEmail() == null || stud.getEmail().length() == 0) {
			return false;
		}

		if (this.Exists(stud.getMatricule())) {
			return false;
		}

		if (this.Exists(stud.getEmail())) {
			return false;
		}

		return true;
	}
}
