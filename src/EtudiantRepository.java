
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements IEtudiantRepository{
	
	
	public void add(Etudiant E)
	{
		
	 try {	

		DBConnection BD= DBConnection.getInstance();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
				System.out.println("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				System.out.println("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }catch(SQLException e){
			e.printStackTrace();
		}
	 }


	public boolean Exists(String email) 	
	{
	 try {
		DBConnection BD= DBConnection.getInstance();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);
		
		if (rs){
			System.out.println("logBD--- :email existe dans la BD  " + email);
			connect.close();
			return true;
			}
		System.out.println("logBD--- : email n'existe pas " + email);	
		connect.close();
	 }catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean Exists(int mat)	
	{
	 try {	
		DBConnection BD= DBConnection.getInstance();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.execute(sql);
		
		if (rs){
			System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			connect.close();
			return true;
			}
		System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		connect.close();
	 }catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
	
	


	@Override
	public boolean Existe_Email_Matricule(int Matricule, String Email) {
		return this.Exists(Matricule) || this.Exists(Email) || Email.length() == 0 || Email == null;
	}
	
	
	
}
