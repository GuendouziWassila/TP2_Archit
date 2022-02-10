
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements InterfaceEtudiantRep {
	private InterfaceDBConnection BD ;
	private static Statement stmt;

	public EtudiantRepository(InterfaceDBConnection BD) throws SQLException{
		this.BD = BD;
		}
	@Override
	public void add(Etudiant E)
	{ try {
		stmt = BD.getConn().createStatement();
		String sql = "INSERT into etudiant  values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "','"+ E.getPwd() +"'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		if (rs == 1){
				System.out.println("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				System.out.println("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
			}
		BD.getConn().close();
	}catch(SQLException e){
		e.printStackTrace();
	}
	 }

	@Override
	public boolean Exists(String email) 
	{ try {
		
		stmt = BD.getConn().createStatement();
		String sql = "select * from etudiant where email = '" +email + "'";
		ResultSet rs = stmt.executeQuery(sql);
	      
	      // iterate through the java resultset
		if (rs.first()){
				System.out.println("logBD--- :email existe deja dans la BD  " + email);
				//BD.getConn().close();
				return true;}
	     
				System.out.println("logBD--- : email n'existe pas " + email);	
				BD.getConn().close();
				return false;
	}catch(SQLException e){
		e.printStackTrace();
	}
	return false;}
	@Override
	public boolean Exists(int mat)	
	{ try {

		stmt = BD.getConn().createStatement();
		String sql = "select * from etudiant where matricule = " + mat;
		ResultSet rs = stmt.executeQuery(sql);
		
		if (rs.first()){
			System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			//BD.getConn().close();
			return true;
			}
		System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		BD.getConn().close();
		return false;
	}catch(SQLException e){
		e.printStackTrace();
	}
	return false;
	}	

}
