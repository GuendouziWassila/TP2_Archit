
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements etudiant_interface {
	String cla="la classe est EtudiantRepository";
	@Override
	public void add(Etudiant E) throws SQLException
	{

		//DBConnection BD= new DBConnection();
		Connection connect=DBConnection.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
				//System.out.println("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			App_composite.setMessage("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule()+", "+cla);
			}else if (rs == 0){
				//System.out.println("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
				App_composite.setMessage("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule()+", "+cla);
			}
		connect.close();
	 }

	@Override
	public boolean Exists(String email) throws SQLException	
	{
		//DBConnection BD= new DBConnection();
		Connection connect=DBConnection.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);
		
		if (rs){
			//System.out.println("logBD--- :email existe dans la BD  " + email);
			App_composite.setMessage("logBD--- :email existe dans la BD " + email+", "+cla);
			//connect.close();
			return true;
			}
		//System.out.println("logBD--- : email n'existe pas " + email);	
		App_composite.setMessage("logBD--- : email n'existe pas " + email+", "+cla);
		//connect.close();
		return false;
	}
	@Override
	public boolean Exists(int mat) throws SQLException	
	{
		//DBConnection BD= new DBConnection();
		Connection connect=DBConnection.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.execute(sql);
		
		if (rs){
			//System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			App_composite.setMessage("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat+", "+cla);
			//connect.close();
			return true;
			}
		//System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		App_composite.setMessage("logBD----: etudiant avec ce matricule n'existe pas " + mat+", "+cla);
		//connect.close();
		return false;
	}

}
