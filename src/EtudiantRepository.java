
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements IEtudiantRepository{

	//private IJournal composite;
	private IDBConnection BD;

	public EtudiantRepository(IDBConnection BD) {
	//	this.composite = composite;
		this.BD = BD;
	}
	
	public void add(Etudiant E) throws SQLException
	{

		// singleton
		//DBConnection BD= DBConnection.setDBC();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
				//composite.outPut_Msg("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
				System.out.println("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				//composite.outPut_Msg("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
				System.out.println("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }


	public boolean Exists(String email) throws SQLException
	{
		// singleton
		//DBConnection BD= DBConnection.setDBC();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);
		
		if (rs){
			//composite.outPut_Msg("logBD--- :email existe dans la BD  " + email);
			System.out.println("logBD--- :email existe dans la BD  " + email);
			connect.close();
			return true;
			}
		//composite.outPut_Msg("logBD--- : email n'existe pas " + email);
		System.out.println("logBD--- : email n'existe pas " + email);
		connect.close();
		return false;
	}
	
	public boolean Exists(int mat) throws SQLException
	{
		// singleton
		//DBConnection BD= DBConnection.setDBC();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.execute(sql);
		
		if (rs){
			//composite.outPut_Msg("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			System.out.println("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			connect.close();
			return true;
			}
		//composite.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);
		System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);
		connect.close();
		return false;
	}

}
