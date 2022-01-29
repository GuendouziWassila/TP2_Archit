import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfaceEtudiantService {
    boolean inscription (Etudiant etudiant, Universite universite, EtudiantRepository etudiantRepository) throws SQLException;
    public ArrayList<InterfaceEtudiant> GetEtudiantParUniversitye();
    public ArrayList<InterfaceEtudiant> GetEtudiatparLivreEmprunte();
}
