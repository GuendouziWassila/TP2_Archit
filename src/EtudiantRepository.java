
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository {
	
	
	void add(Etudiant E) throws SQLException
	{

		DBConnection BD= DBConnection.getinstance();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant  values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "','"+ E.getPwd() +"'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
				System.out.println("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				System.out.println("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }


	boolean Exists(String email) throws SQLException	
	{
		DBConnection BD= DBConnection.getinstance();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email = '" +email + "'";
		ResultSet rs = stmt.executeQuery(sql);
	      
	      // iterate through the java resultset
		if (rs.first()){
				System.out.println("logBD--- :email existe deja dans la BD  " + email);
				connect.close();
				return true;}
	      else {
				System.out.println("logBD--- : email n'existe pas " + email);	
				connect.close();
				return false;}}
	
	boolean Exists(int mat) throws SQLException	
	{
		DBConnection BD= DBConnection.getinstance();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule = " + mat;
		ResultSet rs = stmt.executeQuery(sql);
		
		if (rs.first()){
			System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			connect.close();
			return true;
			}
		System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		connect.close();
		return false;
	}

}
