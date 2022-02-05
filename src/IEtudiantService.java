import java.sql.SQLException;
import java.util.ArrayList;

public interface IEtudiantService {

    boolean inscription () throws SQLException;

    ArrayList<Etudiant> GetEtudiantParUniversitye();

    ArrayList<Etudiant> GetEtudiatparLivreEmprunte();
}
