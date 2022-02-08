import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements InterfaceEtudiantReposit {
	
	private InterfaceDBConnection BDD ;
	private static Statement stmt;
	

	
		
@Override
public void add(InterfaceEtudiant E){
	try {
	 
		stmt = BDD.getConn().createStatement();

		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			System.out.println("log : ajout dans la BD r�ussi de l'etudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				System.out.println("log : Echec de l'ajout dans la BD de l'etudiant  du Matricule" + E.getMatricule());
			}
		BDD.getConn().close();
		
	 }catch(SQLException e){
			e.printStackTrace();
			}
}
@Override
 public	boolean Exists(String email){
	try{
		
		stmt = BDD.getConn().createStatement();

		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);
		
		if (rs){
			System.out.println("logBD--- :email existe dans la BD  " + email);
			BDD.getConn().close();
			return true;
			}
		System.out.println("logBD--- : email n'existe pas " + email);	
		BDD.getConn().close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
@Override	
public	boolean Exists(int mat)
	{
		
	try {	
	stmt = BDD.getConn().createStatement();

	String sql = "select * from etudiant where matricule="+ mat;
	boolean rs = stmt.execute(sql);
	
	if (rs){
		System.out.println("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
		BDD.getConn().close();
		return true;
		}
	System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
	BDD.getConn().close();
	
	}catch(SQLException e){
		e.printStackTrace();
	}
	return false;
	}
}
