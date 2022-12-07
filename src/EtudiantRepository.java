import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements IEtudiantRep{
	
	private InterfaceDBConnexion BDD;
	private static Statement stmt;
	private IJournal j;

	public EtudiantRepository(InterfaceDBConnexion BDD, IJournal j){
		this.BDD = BDD;
		this.j = j ;
	}
	@Override
	public void add(Etudiant E)
	{

		//DBConnection BD= DBConnection.getinstance();
		//Connection connect=BDD.getConn();
		try {
		stmt = BDD.getConn().createStatement();

       

		String sql = "insert into etudiant values ('"+E.getMatricule()+"','"+E.getNom()+"','"+E.getPrenom()+"','"+E.getEmail()+"','"+E.getNbLivreMensuel_Autorise()+"','"+E.getNbLivreEmprunte()+"','"+E.getId_universite()+"')";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			j.outPut_Msg("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
		    }else if (rs == 0){
			j.outPut_Msg("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
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
		boolean rs = stmt.executeQuery(sql).next();
		
		if (rs){
		j.outPut_Msg("logBD--- :email existe dans la BD  " + email);
		BDD.getConn().close();
			return true;
			}
		j.outPut_Msg("logBD--- : email n'existe pas " + email);
		BDD.getConn().close();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean Exists(int mat)	
	{
		try{

		stmt = BDD.getConn().createStatement();
        
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.executeQuery(sql).next();
		
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
	public boolean Existe_Email_Matricule(int matricule, String email) throws SQLException {
		
		return this.Exists(matricule) || this.Exists(email) || email.length() == 0 || email == null; 
		
	}

}
