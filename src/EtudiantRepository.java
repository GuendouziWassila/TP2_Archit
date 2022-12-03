
import java.io.File;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements IEtudiantRep{
	
	IJournal msg= new ScrennMsg();
	IJournal msg0= new FileMsg();
	public void add(Etudiant E) throws SQLException
	{

		DBConnection BD= DBConnection.getinstaConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "insert into etudiant values ('"+E.getMatricule()+"','"+E.getNom()+"','"+E.getPrenom()+"','"+E.getEmail()+"','"+E.getNbLivreMensuel_Autorise()+"','"+E.getNbLivreEmprunte()+"','"+E.getId_universite()+"')";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			msg0.outPut_Msg("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());	
			msg.outPut_Msg("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule()); //("log : ajout dans la BD r�ussi de l'�tudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				msg.outPut_Msg("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule()); //System.out.println("log : Echec de l'ajout dans la BD de l'�tudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }


	public boolean Exists(String email) throws SQLException	
	{
		DBConnection BD= DBConnection.getinstaConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.executeQuery(sql).next();
		
		if (rs){
		msg0.outPut_Msg("logBD--- :email existe dans la BD  " + email);	
		msg.outPut_Msg("logBD--- :email existe dans la BD  " + email);	 //System.out.println("logBD--- :email existe dans la BD  " + email);
		
		connect.close();
			return true;
			}
		msg0.outPut_Msg("logBD--- : email n'existe pas " + email);
		msg.outPut_Msg("logBD--- : email n'existe pas " + email); //System.out.println("logBD--- : email n'existe pas " + email);	
		
		connect.close();
		return false;
	}
	
	public boolean Exists(int mat) throws SQLException	
	{
		DBConnection BD= DBConnection.getinstaConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.executeQuery(sql).next();
		
		if (rs){
			msg0.outPut_Msg("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			msg.outPut_Msg("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat); //System.out.println("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			connect.close();
			return true;
			}
			msg0.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);
		    msg.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);
			   //System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		connect.close();
		return false;
	}

}
