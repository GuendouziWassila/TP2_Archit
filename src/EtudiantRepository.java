
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements InterfaceEtudeRep{
	InterfaceDBConnection db;
	private IJournal journal;
	public EtudiantRepository(InterfaceDBConnection db,IJournal journal) {
		this.db = db;
		this.journal = journal;
	}

	@Override
	public void add(InterfaceEtudiant E) throws SQLException, IOException
	{

	
		Connection connect=db.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','"+ E.getPwd() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
				//System.out.println("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			journal.outPut_Msg("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				//System.out.println("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
				journal.outPut_Msg("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }

	@Override
	public boolean Exists(String email) throws SQLException, IOException	
	{
		
		Connection connect=db.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		ResultSet rs = stmt.executeQuery(sql);

		if(rs.next()){
		//System.out.println("logBD--- :email existe dans la BD  " + email);
		journal.outPut_Msg("logBD--- :email existe dans la BD  " + email);
		connect.close();
		return true;
		}
		//System.out.println("logBD--- : email n'existe pas " + email);
		journal.outPut_Msg("logBD--- : email n'existe pas " + email);
		connect.close();
		return false;
	}
	@Override
	public boolean Exists(int mat) throws SQLException, IOException	
	{

		Connection connect=db.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		ResultSet rs = stmt.executeQuery(sql);
		
		if (rs.next()){
			//System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			journal.outPut_Msg("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			connect.close();
			return true;
			}
		//System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);
		journal.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);
		connect.close();
		return false;
	}

	@Override
	public boolean VerifEmailMat(InterfaceEtudiant stud) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return this.Exists(stud.getMatricule()) || this.Exists(stud.getEmail()) || stud.getEmail().length() == 0 || stud.getEmail() == null; 
	}

}
