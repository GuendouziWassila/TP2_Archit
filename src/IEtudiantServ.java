import java.sql.SQLException;
import java.util.ArrayList;

public interface IEtudiantServ {
    boolean inscription (int matricule, String nom, String prenom, String email,String pwd, int id_universite) throws  SQLException;
    ArrayList<Etudiant> GetEtudiantParUniversitye();
    ArrayList<Etudiant> GetEtudiatparLivreEmprunte();
}
