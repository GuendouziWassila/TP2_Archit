import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements IEtudiant {


	
	@Override
	public void add(Etudiant E) throws SQLException{

		DBConnection BD= DBConnection.getInstance();
		
		Connection connect= BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT INTO etudiant VALUES (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
				System.out.println("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				System.out.println("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
			}
		//connect.close();
	 }

	 @Override
		public boolean Exists(String email) throws SQLException	
		{
			DBConnection BD= DBConnection.getInstance();
			Connection connect= BD.getConn();
			
			Statement stmt = connect.createStatement();
			String sql = "SELECT * FROM etudiant WHERE email='"+ email+"'";
			boolean rs = stmt.executeQuery(sql).next();
			
			if (rs){
				System.out.println("logBD--- :email existe dans la BD  " + email);
				//connect.close();
				return true;
				}
			System.out.println("logBD--- : email n'existe pas " + email);	
			//connect.close();
			return false;
		}
	public boolean Exists(int mat) throws SQLException	
	{
		DBConnection BD= DBConnection.getInstance();
		Connection connect= BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "SELECT * FROM etudiant WHERE matricule='"+ mat+"'";
		boolean rs = stmt.executeQuery(sql).next();
		
		if (rs){
			System.out.println("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			//connect.close();
			return true;
			}
		System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		//connect.close();
		return false;
	}
}