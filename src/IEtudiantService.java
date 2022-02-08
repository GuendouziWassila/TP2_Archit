import java.sql.SQLException;
import java.util.ArrayList;

public interface IEtudiantService {
	boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException;	
    public ArrayList<InterfaceEtudiant> GetEtudiantParUniversitye();
    public ArrayList<InterfaceEtudiant> GetEtudiatparLivreEmprunte();
}