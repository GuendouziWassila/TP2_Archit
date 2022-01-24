import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfaceEtudiantService {
    boolean inscription (int matricule, String nom, String prenom, String email,String pwd, int id_universite) throws SQLException;
    public ArrayList<InterfaceEtudiant> GetEtudiantParUniversitye();
    public ArrayList<InterfaceEtudiant> GetEtudiatparLivreEmprunte();
}
