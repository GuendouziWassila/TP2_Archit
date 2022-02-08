package Classes;
import Interfaces.IJournal;
import Interfaces.InterfaceEtudiant;
import Interfaces.InterfaceEtudiantRepository;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements InterfaceEtudiantRepository {
	private Connection Connect;
	private IJournal AffichageListes;
	private Statement stmt;
	public EtudiantRepository(IJournal AffichageListes) throws SQLException {
		try {
			this.Connect = DBConnection.getConn();
			this.stmt = this.Connect.createStatement(); // TO DO ..
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.AffichageListes = AffichageListes;
	}
	@Override
	public void add(InterfaceEtudiant E) throws SQLException{
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getPwd() +"'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()){
			AffichageDate.setClassName("EtudiantRepository");
			AffichageListes.outPut_Msg("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			}else if (!rs.next()){
			AffichageListes.outPut_Msg("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
			}
		this.Connect.close();
	}

	@Override
	public boolean Exists(String email) throws SQLException{
		Statement stmt = this.Connect.createStatement(); // TO DO ..
		String sql = "select * from etudiant where email='"+ email+"'";
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()){
			AffichageListes.outPut_Msg("logBD--- :email existe dans la BD  " + email);
			this.Connect.close();
			return true;
			}
		System.out.println("logBD--- : email n'existe pas " + email);	
		this.Connect.close();
		return false;
	}
	@Override
	public boolean Exists(int mat) throws SQLException{
		Statement stmt = this.Connect.createStatement(); // TO DO ..
		String sql = "select * from etudiant where matricule="+ mat;
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()){
			AffichageListes.outPut_Msg("logBD--- :etudiant avec ce matricule existe d�ja dans la BD  " + mat);
			this.Connect.close();
			return true;
			}
		AffichageListes.outPut_Msg("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		this.Connect.close();
		return false;
	}
}
