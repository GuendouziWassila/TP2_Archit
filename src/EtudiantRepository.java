
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements IEtudiantRepository{
	
	private IDBConnexion BDD ;
	private static Statement stmt;
	private IJournal j;

	public EtudiantRepository(IDBConnexion BDD, IJournal j){
		this.BDD = BDD;
		this.j = j ;
		}
	
	public void add(Etudiant E) 
	{
		
	 try {	

		 stmt = BDD.getConn().createStatement();

			String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
			int rs = stmt.executeUpdate(sql);
			
			if (rs == 1){
				j.outPut_Msg("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
				}else if (rs == 0){
					j.outPut_Msg("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
				}
			BDD.getConn().close();
	 }catch(SQLException e){
			e.printStackTrace();
		}
	 }


	public boolean Exists(String email) 	
	{
	 try {
		 stmt = BDD.getConn().createStatement();

			String sql = "select * from etudiant where email='"+ email+"'";
			boolean rs = stmt.execute(sql);
			
			if (rs){
				j.outPut_Msg("logBD--- :email existe dans la BD  " + email);
				BDD.getConn().close();
				return true;
				}
			j.outPut_Msg("logBD--- : email n'existe pas " + email);	
			BDD.getConn().close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			return false;
	}
	
	public boolean Exists(int mat)	
	{
	 try {	
		 stmt = BDD.getConn().createStatement();

			String sql = "select * from etudiant where matricule="+ mat;
			boolean rs = stmt.execute(sql);
			
			if (rs){
				j.outPut_Msg("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
				BDD.getConn().close();
				return true;
				}
			j.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
			BDD.getConn().close();
			
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
